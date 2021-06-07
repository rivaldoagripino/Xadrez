package tabuleiro;

public class Mesa {
	
	private int rows;
	private int columns;
	private Peca[][] pecas;
	
	public Mesa(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new ExcecaoDaMesa("Erro ao criar a mesa: É necessário que exista pelo menos 1 linha e 1 coluna");
		}
		this.rows = rows;
		this.columns = columns;
		pecas = new Peca[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	public Peca pecas(int row, int column) {
		if (!posicaoExists(row, column)) {
			throw new ExcecaoDaMesa("Posição não identificada na mesa!");
		}
		return pecas[row][column];
	}
	
	public Peca pecas(Posicao posicao) {
		if (!posicaoExists(posicao)) {
			throw new ExcecaoDaMesa("Posição não identificada na mesa!");
		}
		return pecas[posicao.getRow()][posicao.getColumn()];
	}
	
	public void mesaPeca(Peca peca, Posicao posicao) {
		if (umaPeca(posicao)) {
			throw new ExcecaoDaMesa("Já há uma peça na posição escolhida " + posicao);
		}
		pecas[posicao.getRow()][posicao.getColumn()] = peca;
		peca.posicao = posicao;
	}
	
	public Peca removerPeca(Posicao posicao) {
		if (!posicaoExists(posicao)) {
			throw new ExcecaoDaMesa("Posição não disponível na mesa");
		}
		if (pecas(posicao) == null) {
			return null;
		}
		Peca aux = pecas(posicao);
		aux.posicao = null;
		pecas[posicao.getRow()][posicao.getColumn()] = null;
		return aux;
	}
	
	private boolean posicaoExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean posicaoExists(Posicao posicao) {
		return posicaoExists(posicao.getRow(), posicao.getColumn());
	}
	
	public boolean umaPeca(Posicao posicao) {
		if (!posicaoExists(posicao)) {
			throw new ExcecaoDaMesa("Posição não identificada na mesa!");
		}
		return pecas(posicao) != null;
	}
}
