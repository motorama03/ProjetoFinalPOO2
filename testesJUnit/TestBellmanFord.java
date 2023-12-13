package testesJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import BellmanFord.BellmanFord;
import graph.Graph;
import searchGraph.AlgBFS;

class TestBellmanFord {

	@Test
	void test() {
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
		System.out.println(gp.getGraphVertex().get("1").getValue());
		System.out.println(gp.getGraphVertex().get("2").getValue());
		System.out.println(gp.getGraphVertex().get("3").getValue());
		System.out.println(gp.getGraphVertex().get("4").getValue());
		System.out.println(gp.getGraphVertex().get("5").getValue());
		System.out.println("teste");
		new AlgBFS(gp, "3", "4");
		
		assertEquals(true,BellmanFord.bellmanFord(gp, gp.getGraphVertex().get("1")));
		gp.imprimirGrafoCircular();
	}
}
