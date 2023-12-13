package testes;

import BellmanFord.BellmanFord;
import graph.Graph;
import searchGraph.AlgBFS;

public class TesteBellmanFord extends Graph {
	
	public TesteBellmanFord() {
		super(false);
	}

	public static void main(String[] args) {
		new TesteBellmanFord().testandoBellman();
	}
	
	public void testandoBellman() {
	Graph gp = new Graph(false);
	for (int i = 1; i<6; i++){
		gp.addVertex(String.valueOf(i));
	}
	gp.addEdge(gp.getGraphVertex().get("1"), gp.getGraphVertex().get("2"), 1D);
	gp.addEdge(gp.getGraphVertex().get("1"), gp.getGraphVertex().get("3"), 2D);
	gp.addEdge(gp.getGraphVertex().get("2"), gp.getGraphVertex().get("3"), 3D);
	gp.addEdge(gp.getGraphVertex().get("2"), gp.getGraphVertex().get("4"), 4D);
	gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("2"), 5D);
	gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("1"), 6D);
	gp.addEdge(gp.getGraphVertex().get("4"), gp.getGraphVertex().get("2"), 7D);
	
	BellmanFord.bellmanFord(gp, gp.getGraphVertex().get("1"));
	new AlgBFS(gp, "3", "4");
	
	gp.imprimirGrafoCircular();
	}
}
