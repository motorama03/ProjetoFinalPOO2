package testes;

import FloydWarshall.FloydWarshall;
import graph.Graph;

public class TesteFloyd extends Graph{

	public TesteFloyd() {
		super(false);
	}

	public static void main(String[] args) {
		new TesteFloyd().testandoFloyd();
	}
	
	public void testandoFloyd() {
		Graph gp = this;
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
		
		FloydWarshall fw = new FloydWarshall(getOrder());
		fw.executar();
//		imprimirGrafoLivre();;
		
	}

}
