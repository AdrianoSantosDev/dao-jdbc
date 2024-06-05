package db;

public class DbException extends RuntimeException {
	
	//Exceção personalizada

	private static final long serialVersionUID = 1L;
	
	public DbException(String msg) {
		super(msg);
	}
	
}
