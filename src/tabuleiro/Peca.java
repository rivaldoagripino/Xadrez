package tabuleiro;

public class Peca {
	protected Posicao posicao;
	private Mesa mesa;
	
	public Peca(Mesa mesa) {
		this.mesa = mesa;
		posicao = null;//atribuindo a Posição da peça nula
	}

	protected Mesa getMesa() {//SOMENTE CLASSES DO MESMO PACOTE E SUBCLASSES PODERÃO ACESSAR O TABULEIRO DE UMA PEÇA
		return mesa;
	}

	
	
	
	
}
