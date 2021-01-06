package org.acme.graph.model;

import java.util.ArrayList;
import java.util.List;

public class Path {
	
	private List<Edge> edges;
	
	public Path() {
		this.edges = new ArrayList<>();
	}
	
	public void addEdge(Edge edge) {
		this.edges.add(edge);
	}

	public List<Edge> getEdges() {
		return this.edges;
	}

}
