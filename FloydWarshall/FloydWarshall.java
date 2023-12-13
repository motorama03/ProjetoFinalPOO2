package FloydWarshall;

import java.util.List;

import graph.Graph;
import graph.Vertex;

public class FloydWarshall {
		private Graph g;
	    private int nVertices;
	    private float[][] distancia;

	    /**
	     * Algoritmo responsavel por encontrar caminho de custo minimo entre todos os pares de vertices de um grafo
	     * @param nVertices
	     */
	    
	    public FloydWarshall(int nVertices) {
	        this.nVertices = nVertices;
	        distancia = new float[nVertices][nVertices];

	        for (int i = 0; i < nVertices; i++) {
	            for (int j = 0; j < nVertices; j++) {
	                if (i == j) {
	                    distancia[i][j] = 0;
	                } else {
	                    distancia[i][j] = i-j;
	                }
	            }
	        }
	    }

	    /**
	     * @return retorna o menor caminho encontrado entre todos os vertices do grafo
	     */
	    public void executar() {
	        for (int k = 0; k < nVertices; k++) {
	            for (int i = 0; i < nVertices; i++) {
	                for (int j = 0; j < nVertices; j++) {
	                    if (i != j && distancia[i][j] > distancia[i][k] + distancia[k][j]) {
	                        distancia[i][j] = distancia[i][k] + distancia[k][j];
	                    }
	                }
	            }
	        }

	        for (int i = 0; i < nVertices; i++) {
	            for (int j = 0; j < nVertices; j++) {
	                if (i != j && distancia[i][j] != 0) {
	                    System.out.println("O menor caminho entre " + (i+1) + " e " + (j+1) + " é " + getDistancia(i, j));
	                }
	            }
	        }
	    }
	        
	    /**
	     * 
	     * @param i
	     * @param j
	     * @return retorna a distancia entre dois vertices
	     */
	    public float getDistancia(int i, int j) {
	        return distancia[i][j];
	    }
	}


