package BellmanFord;

import java.util.List;

import graph.Edge;
import graph.Graph;
import graph.Vertex;

public class BellmanFord {
	
	private static BellmanFord bellmanFord;
	
	/**
	 * Metodo responsavel por encontrar um caminho de custo mínimo de um vertice de origem a todos os demais, seu diferencial em comparacao a Dijkstra é que ele pode conter valores negativos.
	 * @param gp Graph
	 * @param source Vertex
	 * @return retorna um boolean caso consiga executar o BellmanFord
	 */
	public static boolean bellmanFord(Graph gp, Vertex source) {
		try {
			List<Vertex> vertices = gp.getAllVertices();
			for(Vertex u : vertices) {
				u.distancia(Integer.MAX_VALUE);
			}
			
			source.distancia(0);
			
			// Relaxa as distâncias
		    for (int i = 0; i < gp.getOrder() - 1; i++) {
		    	for (graph.Edge e : gp.getGraphEdgsList()) {
		    		Vertex u = e.getVi();
		    		Vertex v = e.getVj();
		        if (u.getValue() < Integer.MAX_VALUE && u.getValue() + e.getValor() < v.getValue()) {
		        	v.setValue(u.getValue() + e.getValor());
		        	System.out.println("ID do vertice: "+v.getId()+" Distância percorrida: "+ v.getValue());
		        }
		      }
		    }
		    return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
		
	}
	
	/**
	 * 
	 * @param b
	 * @return Gera uma instancia do objeto dentro da propria classe.
	 */
	public static BellmanFord geraInstância(BellmanFord b) {
		if (bellmanFord == null) {
			bellmanFord = new BellmanFord();
        }
        return bellmanFord;
	}
}
