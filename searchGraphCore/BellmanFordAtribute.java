package searchGraphCore;

import graph.Vertex;

public class BellmanFordAtribute extends Atribute{
	
	public BellmanFordAtribute(Double distancia,Vertex antecessor,Color cor) {
		this.setDistancia(distancia);
		super.setAntecessor(antecessor);
		super.setCor(cor);
	}
	public BellmanFordAtribute() {
		
	}
	
	private Double distancia;
	
	public Double getDistancia() {
		return distancia;
	}

	public void setDistancia(Double distancia) {
		this.distancia = distancia;
	}

}
