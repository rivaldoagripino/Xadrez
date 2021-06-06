package Xadrez;

import Xadrez.pecas.Bispo;
import Xadrez.pecas.Cavalo;
import Xadrez.pecas.Dama;
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
		mesa.mesaPeca(new Torre(mesa, Cor.PRETO), new Posicao(0, 0));
		mesa.mesaPeca(new Torre(mesa, Cor.PRETO), new Posicao(0, 7));
		mesa.mesaPeca(new Torre(mesa, Cor.BRANCO), new Posicao(7, 0));
		mesa.mesaPeca(new Torre(mesa, Cor.BRANCO), new Posicao(7, 7));
		mesa.mesaPeca(new Rei(mesa, Cor.BRANCO), new Posicao(0, 4));
		mesa.mesaPeca(new Rei(mesa, Cor.PRETO), new Posicao(7, 4));
		mesa.mesaPeca(new Dama(mesa, Cor.BRANCO), new Posicao(0, 3));
		mesa.mesaPeca(new Dama(mesa, Cor.PRETO), new Posicao(7, 3));
		mesa.mesaPeca(new Cavalo(mesa, Cor.PRETO), new Posicao(0, 1));
		mesa.mesaPeca(new Cavalo(mesa, Cor.PRETO), new Posicao(0, 6));
		mesa.mesaPeca(new Cavalo(mesa, Cor.BRANCO), new Posicao(7, 1));
		mesa.mesaPeca(new Cavalo(mesa, Cor.BRANCO), new Posicao(7, 6));
		mesa.mesaPeca(new Bispo(mesa, Cor.PRETO), new Posicao(0, 2));
		mesa.mesaPeca(new Bispo(mesa, Cor.PRETO), new Posicao(0, 5));
		mesa.mesaPeca(new Bispo(mesa, Cor.BRANCO), new Posicao(7, 2));
		mesa.mesaPeca(new Bispo(mesa, Cor.BRANCO), new Posicao(7, 5));
	}
}
