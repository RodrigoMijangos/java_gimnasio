package users;

public class Instructor extends Usuario {
	
	private final int NUMERO;

	public Instructor(
			int identificador,
			int numero
			) {
		super(identificador);
		this.NUMERO = numero;
	}

	public Instructor(
			int identificador, 
			String nombre, 
			String apellidos, 
			String contacto, 
			int numero) {
		super(identificador, nombre, apellidos, contacto);
		this.NUMERO = numero;
	}
	
	public int getNumero() {
		return this.NUMERO;
	}
	
}
