package entidades.users;

import java.util.ArrayList;

import entidades.cursos.Curso;

public class Subscriptor extends Usuario {
	
	private final String MEMBRESIA;
	private boolean active;
	private byte nivel;
	private final ArrayList<Curso> CURSOS;

	public Subscriptor(
			int identificador, 
			String membresia
			) {
		super(identificador);
		this.MEMBRESIA = membresia;
		this.CURSOS = new ArrayList<Curso>();
	}
	
	public Subscriptor(
			int identificador,
			String nombre,
			String apellidos,
			String contacto,
			String membresia,
			boolean active,
			byte nivel,
			ArrayList<Curso> cursos
			) {
		super(identificador, nombre, apellidos, contacto);
		this.MEMBRESIA = membresia;
		this.active = active;
		this.nivel = nivel;
		this.CURSOS = cursos;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public byte getNivel() {
		return nivel;
	}

	public void setNivel(byte nivel) {
		this.nivel = nivel;
	}

	public String getMEMBRESIA() {
		return MEMBRESIA;
	}
	
	public String listarCursos() {
		
		if(this.CURSOS.size() > 0) {
			
			StringBuffer lista = new StringBuffer();
			
			lista.append("Lista de cursos del usuario\n\n");
			
			for(Curso x : this.CURSOS) {
				lista.append(String.format("\t%s", x.toString()));
			}
			return lista.toString();
		}else {
			return "No hay cursos para este usuario";
		}
	}
	
	public boolean addCurso(Curso curso) {
		this.CURSOS.add(curso);
		return true;
	}

}
