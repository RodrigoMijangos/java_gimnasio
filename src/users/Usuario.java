package users;

public class Usuario {
	
	private final int IDENTIFICADOR;
	private String nombre;
	private String apellidos;
	private String contacto;
	
	public Usuario(
			int identificador
			) {
		this.IDENTIFICADOR = identificador;		
	}
	

	public Usuario(
			int identificador, 
			String nombre, 
			String apellidos,
			String contacto
			) {
		this.IDENTIFICADOR = identificador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contacto = contacto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getContacto() {
		return contacto;
	}


	public void setContacto(String contacto) {
		this.contacto = contacto;
	}


	public int getIDENTIFICADOR() {
		return IDENTIFICADOR;
	}
	
	

}
