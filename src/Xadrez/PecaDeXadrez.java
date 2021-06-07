package Xadrez;

import tabuleiro.Mesa;
import tabuleiro.Peca;

public abstract class PecaDeXadrez extends Peca {
	
	private Cor cor;

	public PecaDeXadrez(Mesa mesa, Cor cor) {
		super(mesa);
		this.cor = cor;
	}

	public Cor getCor() {//NÃO IRÁ PRECISAR DO SET POIS APENAS IREI QUERER PUXAR AS CORES QUE JÁ ESTÃO PREDEFINIDAS E NÃO MODIFICA-LAS
		return cor;
	}

	
	
	

}
