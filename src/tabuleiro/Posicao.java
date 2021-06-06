package tabuleiro;

public class Posicao {

	private int row;//encapsulamento
	private int column;//encapsulamento
	
	public Posicao(int row, int column) {//construtores
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {//tostring sobre escrevendo
		return row + ", " + column;
	}
	
	
	
}
