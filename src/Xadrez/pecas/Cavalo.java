package Xadrez.pecas;

import Xadrez.Cor;
import Xadrez.PecaDeXadrez;
import tabuleiro.Mesa;

public class Cavalo extends PecaDeXadrez {

	public Cavalo(Mesa mesa, Cor cor) {
		super(mesa, cor);
	}
	
	@Override
	public String toString() {
		return "C";
	}

	@Override
	public boolean[][] movimentosPossiveis() {
		boolean[][] mat = new boolean[getMesa().getRows()][getMesa().getColumns()];
		return mat;
	}
	

}
