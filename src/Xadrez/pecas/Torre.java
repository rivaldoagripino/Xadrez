package Xadrez.pecas;

import Xadrez.Cor;
import Xadrez.PecaDeXadrez;
import tabuleiro.Mesa;

public class Torre extends PecaDeXadrez {

	public Torre(Mesa mesa, Cor cor) {
		super(mesa, cor);
	}
	
	@Override
	public String toString() {
		return "T";
	}
	
}
