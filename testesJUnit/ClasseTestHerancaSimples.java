package testesJUnit;

import org.junit.jupiter.api.Test;
import graph.Graph;
import searchGraph.AlgBFS;


class ClasseTestHerancaSimples{
	Graph gp = new Graph(false);

	@Test
	void test() {
		
			for (int i = 1; i<11; i++){
				gp.addVertex(String.valueOf(i));
			}
			gp.addEdge(gp.getGraphVertex().get("1"), gp.getGraphVertex().get("2"), 1D);
			gp.addEdge(gp.getGraphVertex().get("1"), gp.getGraphVertex().get("2"), 4D);
			gp.addEdge(gp.getGraphVertex().get("1"), gp.getGraphVertex().get("7"), 1D);
			gp.addEdge(gp.getGraphVertex().get("1"), gp.getGraphVertex().get("2"), 6D);
			gp.addEdge(gp.getGraphVertex().get("1"), gp.getGraphVertex().get("8"), 8D);
			gp.addEdge(gp.getGraphVertex().get("2"), gp.getGraphVertex().get("8"), 11D);
			gp.addEdge(gp.getGraphVertex().get("2"), gp.getGraphVertex().get("8"), 3D);
			gp.addEdge(gp.getGraphVertex().get("2"), gp.getGraphVertex().get("3"), 8D);
			gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("4"), 7D);
			gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("4"), 1D);
			gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("9"), 2D);
			gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("6"), 4D);
			gp.addEdge(gp.getGraphVertex().get("4"), gp.getGraphVertex().get("5"), 9D);
			gp.addEdge(gp.getGraphVertex().get("4"), gp.getGraphVertex().get("6"), 14D);
			gp.addEdge(gp.getGraphVertex().get("6"), gp.getGraphVertex().get("5"), 10D);
			gp.addEdge(gp.getGraphVertex().get("7"), gp.getGraphVertex().get("6"), 2D);
			gp.addEdge(gp.getGraphVertex().get("8"), gp.getGraphVertex().get("7"), 20D); 
			gp.addEdge(gp.getGraphVertex().get("8"), gp.getGraphVertex().get("7"), 19D);
			gp.addEdge(gp.getGraphVertex().get("7"), gp.getGraphVertex().get("9"), 6D);
			gp.addEdge(gp.getGraphVertex().get("7"), gp.getGraphVertex().get("1"), 6D);
			gp.addEdge(gp.getGraphVertex().get("7"), gp.getGraphVertex().get("9"), 5D);
			gp.addEdge(gp.getGraphVertex().get("8"), gp.getGraphVertex().get("9"), 4D); //alterar pra 17 e 12...	
			gp.addEdge(gp.getGraphVertex().get("8"), gp.getGraphVertex().get("9"), 20D);
			//this.addEdge(this.getGraphVertex().get("12"), this.getGraphVertex().get("3"), 20D);
			//new AlgoritmoPrim(this, this.getGraphVertex().get("1"));
			//Dijkstra dj = new Dijkstra(this, 8, 4);
			new AlgBFS(gp, "8", "4");
			gp.imprimirGrafoCircular();
		}
}
