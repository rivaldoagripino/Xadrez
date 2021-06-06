package application;

import Xadrez.PartidaDeXadrez;

public class Principal {

	public static void main(String[] args) {
		
		PartidaDeXadrez partida = new PartidaDeXadrez();
		UI.printMesa(partida.getPecas());
	}

}
