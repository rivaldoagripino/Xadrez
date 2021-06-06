package tabuleiro;

public class Mesa {
	
	private int rows;
	private int columns;
	private Peca[][] pecas;
	
	public Mesa(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pecas = new Peca[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Peca pecas(int row, int column) {
		return pecas[row][column];
	}
	
	public Peca pecas(Posicao posicao) {
		return pecas[posicao.getRow()][posicao.getColumn()];
	}
	
	public void mesaPeca(Peca peca, Posicao posicao) {
		pecas[posicao.getRow()][posicao.getColumn()] = peca;
		peca.posicao = posicao;
	}
	
}
