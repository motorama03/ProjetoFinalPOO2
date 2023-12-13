package dijkstra; // Deveria mostrar o menor caminho entre dois pontos...

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import arvorePrim.AtributePrimDijkstra;
import graph.Graph;
import graph.Vertex;

public class Dijkstra {
	
	private Graph graph;
	
	private Vertex inicial; // vertice inicial
	
	private Vertex finals; // vertice final
	
	private ArrayList<AtributePrimDijkstra> fila = new ArrayList<>(); // uma lista de vertices com o vertice atual o antecessor e o valor do atual
	
	private HashMap<Vertex,AtributePrimDijkstra> custoAntecessor = new HashMap<>();
	
	private HashSet<Vertex> calculados = new HashSet<>();
	
	public Dijkstra(Graph graph, Vertex inicial, Vertex finals) {
		this.graph = graph;
		this.inicial = inicial;
		this.finals = finals;
		inicializa();
		dijkstra();
	}
	
	public Dijkstra(Graph graph, Vertex inicial) {
		this.graph = graph;
		this.inicial = inicial;
		inicializa();
		dijkstra();
	}
	
	public boolean Dijkstra() {
		return(dijkstra());
	}
	
	private void inicializa(){
		for (Entry<String, Vertex> u: graph.getGraphVertex().entrySet()){
			AtributePrimDijkstra elemento = new AtributePrimDijkstra(null,Double.POSITIVE_INFINITY);
			custoAntecessor.put(u.getValue(),elemento);
			elemento.setVertex(u.getValue());
			fila.add(elemento);
		}
		custoAntecessor.get(inicial).setValor(0d);
		custoAntecessor.get(inicial).setAntecessor(null);
	}
	
	/**
	 * 
	 * @return retorna um boolean informando se foi possível encontrar o menor caminho para todos os vertices a partir de um único.
	 */
	private boolean dijkstra(){
		try {
			while (!fila.isEmpty()){
				Collections.sort(fila);
				inicial = fila.get(0).getVertex();
				calculados.add(inicial);
				fila.remove(0);
				if (inicial.getAdjacentList().contains(finals)){
					relaxa(finals);
					fila.removeAll(fila);
					break;
				}
				for (Vertex v : inicial.getAdjacentList()){
					relaxa(v);
					if (finals != null && finals.equals(v)){
						fila.removeAll(fila);
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
	 * @param adj
	 * @returm faz o relaxamentro entre o vertice adjacente com seu antecessor
	 */
	private void relaxa(Vertex adj){
		double custoAresta = graph.adjacentAux(inicial, adj).getValor();
		if (custoAntecessor.get(adj).getValor() > custoAntecessor.get(inicial).getValor()+custoAresta){
			graph.getSolucao().add(inicial.getId()+" "+adj.getId()+" "+custoAresta);
			custoAntecessor.get(adj).setValor(custoAntecessor.get(inicial).getValor()+custoAresta);
			custoAntecessor.get(adj).setAntecessor(inicial);
		}
	}
	
}
