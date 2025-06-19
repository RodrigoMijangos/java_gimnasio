package utils;

import java.util.Scanner;

import entidades.users.Usuario;

public class UserOperations {

	private static final Scanner SC = new Scanner(System.in);
	
	public static Usuario capturarUsuario(int identificador_asignado) {
		System.out.println("Añadir nombres:\t");
		String nombre = SC.next();
		System.out.println("Añadir apellidos:\t");
		String apellidos = SC.next();
		System.out.println("Añadir método de contacto:\t");
		String contacto = SC.next();
		
		return new Usuario(identificador_asignado, nombre, apellidos, contacto);
	}

}
