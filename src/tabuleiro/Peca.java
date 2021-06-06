package tabuleiro;

public class Peca {
	protected Posicao posicao;
	private Mesa mesa;
	
	public Peca(Mesa mesa) {
		this.mesa = mesa;
		posicao = null;//atribuindo a Posi��o da pe�a nula
	}

	protected Mesa getMesa() {//SOMENTE CLASSES DO MESMO PACOTE E SUBCLASSES PODER�O ACESSAR O TABULEIRO DE UMA PE�A
		return mesa;
	}

	
	
	
	
}
