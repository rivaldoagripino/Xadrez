package tabuleiro;

public abstract class Peca {
	protected Posicao posicao;
	private Mesa mesa;
	
	public Peca(Mesa mesa) {
		this.mesa = mesa;
		posicao = null;//atribuindo a Posi��o da pe�a nula
	}

	protected Mesa getMesa() {//SOMENTE CLASSES DO MESMO PACOTE E SUBCLASSES PODER�O ACESSAR O TABULEIRO DE UMA PE�A
		return mesa;
	}

	public abstract boolean [][] movimentosPossiveis();
	
	public boolean movimentosPossiveis(Posicao posicao) {
		return movimentosPossiveis()[posicao.getRow()][posicao.getColumn()];
	}
	
	public boolean posicaoValida() {
		boolean [][] mat = movimentosPossiveis();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat [i] [j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	
	
}
