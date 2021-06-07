package Xadrez;

import tabuleiro.Mesa;
import tabuleiro.Peca;

public abstract class PecaDeXadrez extends Peca {
	
	private Cor cor;

	public PecaDeXadrez(Mesa mesa, Cor cor) {
		super(mesa);
		this.cor = cor;
	}

	public Cor getCor() {//N�O IR� PRECISAR DO SET POIS APENAS IREI QUERER PUXAR AS CORES QUE J� EST�O PREDEFINIDAS E N�O MODIFICA-LAS
		return cor;
	}

	
	
	

}
