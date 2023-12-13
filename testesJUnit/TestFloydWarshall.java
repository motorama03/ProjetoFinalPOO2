package testesJUnit;

import FloydWarshall.FloydWarshall;
import graph.Graph;
import org.junit.jupiter.api.Test;

class TestFloydWarshall {

	@Test
	void test() {

		
				Graph gp = new Graph(true);
				for (int i = 1; i<5; i++){
					gp.addVertex(String.valueOf(i));
				}
				gp.addEdge(gp.getGraphVertex().get("1"), gp.getGraphVertex().get("2"), 1D);
				gp.addEdge(gp.getGraphVertex().get("2"), gp.getGraphVertex().get("3"), 2D);
				gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("4"), 2D);
				gp.addEdge(gp.getGraphVertex().get("2"), gp.getGraphVertex().get("3"), 3D);
				gp.addEdge(gp.getGraphVertex().get("2"), gp.getGraphVertex().get("4"), 4D);
				gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("2"), 5D);
				gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("1"), 6D);
				gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("4"), 7D);
				
				FloydWarshall fw = new FloydWarshall(gp.getOrder());
				fw.executar();
				
			}

}
