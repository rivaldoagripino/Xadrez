package Xadrez;

import tabuleiro.Mesa;

public class PartidaDeXadrez {//AQUI FICARÁ AS REGRAS DO JOGO DE XADREZ
	
	private Mesa mesa;
	
	public PartidaDeXadrez() {
		mesa = new Mesa(8, 8);
	}
	
	public PecaDeXadrez[][] getPecas() {
		PecaDeXadrez[][] mat = new PecaDeXadrez[mesa.getRows()][mesa.getColumns()];
		for (int i=0; i<mesa.getRows(); i++) {
			for (int j=0; j<mesa.getColumns(); j++) {
				mat[i][j] = (PecaDeXadrez) mesa.pecas(i, j);
			}
		}
		return mat;
	}
}
