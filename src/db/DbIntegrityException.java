package db;

//Excess�o personalizada de integridade referencial

public class DbIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DbIntegrityException(String msg) { //For�ando o construtor a receber uma mensagem msg
		super(msg); //repassando a mensagem recebida para a superclasse	
	}
	
}
