package Xadrez;

import Xadrez.pecas.Bispo;
import Xadrez.pecas.Cavalo;
import Xadrez.pecas.Dama;
import Xadrez.pecas.Rei;
import Xadrez.pecas.Torre;
import tabuleiro.Mesa;
import tabuleiro.Peca;
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
	
	public PecaDeXadrez performMovimentoXadrez(PosicaoXadrez sourcePosicao, PosicaoXadrez targetPosicao) {
		Posicao source = sourcePosicao.toPosicao();
		Posicao target = targetPosicao.toPosicao();
		validacaoSourcePosicao(source);
		Peca capturacaoPeca = makeMove(source, target);
		return (PecaDeXadrez)capturacaoPeca;
	}
	
	private Peca makeMove (Posicao source, Posicao target) {
		Peca p = mesa.removerPeca(source);
		Peca capturacaoPeca = mesa.removerPeca(target);
		mesa.mesaPeca(p, target);
		return capturacaoPeca;
	}
	
	private void validacaoSourcePosicao (Posicao posicao) {
		if (!mesa.umaPeca(posicao)) {
			throw new ExcecaoDoXadrez("Não existe peça na posição informada.");
		}
		if (mesa.pecas(posicao).posicaoValida()) {
			throw new ExcecaoDoXadrez("Não existe movimentos possíveis para a peça.");
			
		}
	}
	
	private void mesaNovaMesa(char column, int row, PecaDeXadrez peca) {
		mesa.mesaPeca(peca, new PosicaoXadrez(column, row).toPosicao());
	}
	
	private void inicio() {
		mesaNovaMesa('a', 8, new Torre(mesa, Cor.PRETO));
		mesaNovaMesa('h', 8, new Torre(mesa, Cor.PRETO));
		mesaNovaMesa('c', 8, new Bispo(mesa, Cor.PRETO));
		mesaNovaMesa('f', 8, new Bispo(mesa, Cor.PRETO));
		mesaNovaMesa('b', 8, new Cavalo(mesa, Cor.PRETO));
		mesaNovaMesa('g', 8, new Cavalo(mesa, Cor.PRETO));
		mesaNovaMesa('d', 8, new Dama(mesa, Cor.PRETO));		
		mesaNovaMesa('e', 8, new Rei(mesa, Cor.PRETO));

		mesaNovaMesa('e', 1, new Rei(mesa, Cor.BRANCO));
		mesaNovaMesa('d', 1, new Dama(mesa, Cor.BRANCO));
		mesaNovaMesa('b', 1, new Cavalo(mesa, Cor.BRANCO));
		mesaNovaMesa('g', 1, new Cavalo(mesa, Cor.BRANCO));
		mesaNovaMesa('c', 1, new Bispo(mesa, Cor.BRANCO));
		mesaNovaMesa('f', 1, new Bispo(mesa, Cor.BRANCO));
		mesaNovaMesa('a', 1, new Torre(mesa, Cor.BRANCO));
		mesaNovaMesa('h', 1, new Torre(mesa, Cor.BRANCO));
	}
}
