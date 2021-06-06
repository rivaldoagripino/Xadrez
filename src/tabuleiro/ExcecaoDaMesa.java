package tabuleiro;

public class ExcecaoDaMesa extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ExcecaoDaMesa(String msg) {
		super(msg);
	}
}
