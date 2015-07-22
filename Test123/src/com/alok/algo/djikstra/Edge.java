package com.alok.algo.djikstra;

public class Edge {

	private String id;
	private int weight;
	private Vertex source;
	private Vertex destination;
	
	
	
	public Edge(String id, int weight, Vertex source, Vertex destination) {
		super();
		this.id = id;
		this.weight = weight;
		this.source = source;
		this.destination = destination;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Vertex getSource() {
		return source;
	}
	public void setSource(Vertex source) {
		this.source = source;
	}
	public Vertex getDestination() {
		return destination;
	}
	public void setDestination(Vertex destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Edge [id=" + id + ", weight=" + weight + ", source=" + source
				+ ", destination=" + destination + "]";
	}
	
	
	
	
	
	
}
