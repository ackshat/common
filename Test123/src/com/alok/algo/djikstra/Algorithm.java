package com.alok.algo.djikstra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Algorithm {

		private List<Vertex> nodes;
		private List<Edge> edges;
		private Set<Vertex> settledNodes;
		private Set<Vertex> unSettledNodes;
		
		private Map<Vertex,Vertex> predecessors;
		private Map<Vertex,Integer> distance;
		
		public Algorithm(Graph graph){
			this.nodes = new ArrayList<Vertex> (graph.getVertices());
			this.edges = new ArrayList<Edge> (graph.getEdges());
			
		}
		
		public void execute(Vertex source){
			settledNodes = new HashSet<Vertex>();
			unSettledNodes = new HashSet<Vertex>();
			distance = new HashMap<Vertex,Integer>();
			predecessors = new HashMap<Vertex,Vertex>();
			distance.put(source, 0);
			unSettledNodes.add(source);
			while(unSettledNodes.size()>0){
				Vertex node = getMinimum(unSettledNodes);
				settledNodes.add(node);
				unSettledNodes.remove(node);
				findMinimalDistances(node);
			}
		}

		private void findMinimalDistances(Vertex node) {
			List<Vertex> adjacentNodes = getNeighbours(node);
			for(Vertex target : adjacentNodes){
				if (getShortestDistance(target) > 
								getShortestDistance(node) + getDistance(node, target)) {
				        distance.put(target, getShortestDistance(node)
				            + getDistance(node, target));
				        predecessors.put(target, node);
				        unSettledNodes.add(target);
				      }
			}
		}

		private int getDistance(Vertex node, Vertex target) {
			 for (Edge edge : edges) {
			      if (edge.getSource().equals(node)
			          && edge.getDestination().equals(target)) {
			        return edge.getWeight();
			      }
			    }
			    throw new RuntimeException("Should not happen");
		}

		private int getShortestDistance(Vertex destination) {
			 Integer d = distance.get(destination);
			    if (d == null) {
			      return Integer.MAX_VALUE;
			    } else {
			      return d;
			    }
		}

		private List<Vertex> getNeighbours(Vertex node) {
			List<Vertex> neighbors = new ArrayList<Vertex>();
		    for (Edge edge : edges) {
		      if (edge.getSource().equals(node)
		          && !isSettled(edge.getDestination())) {
		        neighbors.add(edge.getDestination());
		      }
		    }
		    return neighbors;
		}
		
		private boolean isSettled(Vertex vertex) {
		    return settledNodes.contains(vertex);
		  }


		private Vertex getMinimum(Set<Vertex> vertices) {
			 Vertex minimum = null;
			    for (Vertex vertex : vertices) {
			      if (minimum == null) {
			        minimum = vertex;
			      } else {
			        if (getShortestDistance(vertex) < getShortestDistance(minimum)) {
			          minimum = vertex;
			        }
			      }
			    }
			    return minimum;
		}
		
}
