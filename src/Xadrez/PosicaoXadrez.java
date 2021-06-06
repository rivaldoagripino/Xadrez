package Xadrez;

import tabuleiro.Posicao;

public class PosicaoXadrez {
	
	private char column;
	private int row;
	
	public PosicaoXadrez(char column, int row) {//regra de posição da mesa
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ExcecaoDoXadrez("Instanciação do local da posição incorreta.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Posicao toPosicao() {//regra de posicionamento das linhas
		return new Posicao(8 - row, column - 'a');
	}
	
	protected static PosicaoXadrez fromPosicao(Posicao posicao) {//regra de posicionamento das colunas
		return new PosicaoXadrez((char)('a' - posicao.getColumn()), 8 - posicao.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;//concatenação de strings. os "" estão obrigando o compilador *NÃO REMOVER*
	}
}
