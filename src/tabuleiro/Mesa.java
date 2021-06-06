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
	
	
}
