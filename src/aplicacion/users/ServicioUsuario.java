package aplicacion.users;

import java.util.ArrayList;
import java.util.Optional;

import entidades.users.Usuario;

public class ServicioUsuario {
	
	private final ArrayList<Usuario> users;
	private int indentifier_available;

	public ServicioUsuario() {
		this.indentifier_available = 1;
		this.users = new ArrayList<Usuario>();
	}
	
	public String listAllUsers() {
		StringBuilder users = new StringBuilder("Lista de Usuarios:\n");
		this.users.forEach((user)->{
			users.append("\t").append(user);
		});
		
		return users.toString();
	}
	
	public ArrayList<Usuario> getAllUsers(){
		return this.users;
	}
	
	public Usuario findUser(int identificador) {
		
		Optional<Usuario> user = this.users.stream()
			.filter(obj -> obj.getIDENTIFICADOR() == identificador)
			.findFirst();
		
		return user.isPresent() ? user.get() : null;
	}
	
	public boolean addUser(Usuario user) {
		
		if(!repeatedUser(user)) {
			this.users.add(user);
			this.indentifier_available++;
			return true;
		}
		
		return false;
	}
	
	public boolean deleteUser(int idUuser) {
		if(this.users.isEmpty())
			return false;
		Usuario user = this.findUser(idUuser);
		if(user != null) {
			return this.users.remove(user);
		}
		
		return false;
	}
	
	public boolean repeatedUser(Usuario user) {
		if(this.users.size() == 0) {
			return false;
		}
		
		return this.users.contains(user);
	}

	public int getNextIdentifierAvailable() {
		return this.indentifier_available;
	}
	
}
