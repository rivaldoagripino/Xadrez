package Xadrez.pecas;

import Xadrez.Cor;
import Xadrez.PecaDeXadrez;
import tabuleiro.Mesa;

public class Bispo extends PecaDeXadrez {

	public Bispo(Mesa mesa, Cor cor) {
		super(mesa, cor);
	}
	
	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] movimentosPossiveis() {
		boolean[][] mat = new boolean[getMesa().getRows()][getMesa().getColumns()];
		return mat;
	}
	

}
