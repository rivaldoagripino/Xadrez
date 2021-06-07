package Xadrez.pecas;

import Xadrez.Cor;
import Xadrez.PecaDeXadrez;
import tabuleiro.Mesa;

public class Peao extends PecaDeXadrez {
	
	public Peao(Mesa mesa, Cor cor) {
		super(mesa, cor);
	}
	
	@Override
	public String toString() {
		return "P";
	}

	@Override
	public boolean[][] movimentosPossiveis() {
		boolean[][] mat = new boolean[getMesa().getRows()][getMesa().getColumns()];
		return mat;
	}
	
}
