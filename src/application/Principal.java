package application;

import java.util.Scanner;

import Xadrez.PartidaDeXadrez;
import Xadrez.PecaDeXadrez;
import Xadrez.PosicaoXadrez;

public class Principal {

	public static void main(String[] args) {
		
		PartidaDeXadrez partida = new PartidaDeXadrez();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			UI.printMesa(partida.getPecas());
			System.out.println();
			System.out.print("Source: ");
			PosicaoXadrez source = UI.readPosicaoXadrez(sc);
			
			System.out.println();
			System.out.print("Target: ");
			PosicaoXadrez target = UI.readPosicaoXadrez(sc);
			
			PecaDeXadrez capturacaoPeca = partida.performMovimentoXadrez(source, target);
		}
		
	}

}
