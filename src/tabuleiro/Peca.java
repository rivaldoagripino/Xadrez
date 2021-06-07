package tabuleiro;

public abstract class Peca {
	protected Posicao posicao;
	private Mesa mesa;
	
	public Peca(Mesa mesa) {
		this.mesa = mesa;
		posicao = null;//atribuindo a Posição da peça nula
	}

	protected Mesa getMesa() {//SOMENTE CLASSES DO MESMO PACOTE E SUBCLASSES PODERÃO ACESSAR O TABULEIRO DE UMA PEÇA
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
