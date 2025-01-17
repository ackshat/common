package com.alok.algo.djikstra;

import java.util.List;

// An immutable class
public class Graph {
	
	private final List<Vertex> vertices;
	private final List<Edge> edges;
	
	public Graph(List<Vertex> vertices, List<Edge> edges) {
		super();
		this.vertices = vertices;
		this.edges = edges;
	}
	
	public List<Vertex> getVertices() {
		return vertices;
	}
	public List<Edge> getEdges() {
		return edges;
	}
	
	

}
