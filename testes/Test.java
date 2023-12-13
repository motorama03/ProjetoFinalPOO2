package testes;
import BellmanFord.BellmanFord;
import FloydWarshall.FloydWarshall;
import dijkstra.Dijkstra;
import graph.Graph;

public class Test extends Graph {

	public Test() {
		super(false);
	}

	public static void main(String[] args) {
		new Test().testando();
	}
	
	private void testando() {
		Graph gp = this;
		for (int i = 1; i<5; i++){
			gp.addVertex(String.valueOf(i));
		}
		gp.addEdge(gp.getGraphVertex().get("1"), gp.getGraphVertex().get("2"), 1D);
		gp.addEdge(gp.getGraphVertex().get("1"), gp.getGraphVertex().get("3"), 2D);
		gp.addEdge(gp.getGraphVertex().get("1"), gp.getGraphVertex().get("4"), 2D);
		gp.addEdge(gp.getGraphVertex().get("2"), gp.getGraphVertex().get("3"), 3D);
		gp.addEdge(gp.getGraphVertex().get("2"), gp.getGraphVertex().get("4"), 4D);
		gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("2"), 5D);
		gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("1"), 6D);
		gp.addEdge(gp.getGraphVertex().get("3"), gp.getGraphVertex().get("4"), 7D);
		
		BellmanFord.bellmanFord(gp, gp.getGraphVertex().get("1"));
		//new AlgBFS(gp, "3", "4");
		FloydWarshall fw = new FloydWarshall(getOrder());
		fw.executar();
		new Dijkstra(gp, gp.getGraphVertex().get("1"));
		
//		List<Vertex> vertices = gp.getAllVertices();
		
		double peso = gp.getGraphEdgsList().get(3).getValor();
		System.out.println("O peso da aresta é: " + peso);
		imprimirGrafoCircle();
		
	}

}
