package Xadrez.pecas;

import Xadrez.Cor;
import Xadrez.PecaDeXadrez;
import tabuleiro.Mesa;

public class Rei extends PecaDeXadrez{

	public Rei(Mesa mesa, Cor cor) {
		super(mesa, cor);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}
