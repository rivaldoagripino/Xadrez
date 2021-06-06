package Xadrez;

import Xadrez.pecas.Rei;
import Xadrez.pecas.Torre;
import tabuleiro.Mesa;
import tabuleiro.Posicao;

public class PartidaDeXadrez {//AQUI FICARÁ AS REGRAS DO JOGO DE XADREZ
	
	private Mesa mesa;
	
	public PartidaDeXadrez() {
		mesa = new Mesa(8, 8);
		inicio();
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
	
	private void inicio() {
		mesa.mesaPeca(new Torre(mesa, Cor.BRANCO), new Posicao(0, 0));
		mesa.mesaPeca(new Torre(mesa, Cor.BRANCO), new Posicao(0, 7));
		mesa.mesaPeca(new Torre(mesa, Cor.PRETO), new Posicao(7, 0));
		mesa.mesaPeca(new Torre(mesa, Cor.PRETO), new Posicao(7, 7));
		mesa.mesaPeca(new Rei(mesa, Cor.PRETO), new Posicao(0, 4));
		mesa.mesaPeca(new Rei(mesa, Cor.BRANCO), new Posicao(7, 4));
	}
}
