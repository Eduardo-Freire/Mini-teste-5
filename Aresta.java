package miniTest;

public class Aresta {
	private Vertice origem;
	private Vertice destino;
	private boolean segue;

	public Vertice getOrigem() {
		return origem;
	}

	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}

	public boolean isSegue() {
		return true;
	}

	public void setSegue(boolean segue) {
		this.segue = false;
	}

	public Vertice getDestino() {
		return destino;
	}

	public void setDestino(Vertice destino) {
		this.destino = destino;
	}

}