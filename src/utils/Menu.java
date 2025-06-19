package utils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import aplicacion.users.ServicioUsuario;
import entidades.users.Usuario;

public class Menu {
	
	/**
	 * Esta función inicia un menu para controlar 
	 * las opciones del sistema
	 * */
	
	private final ServicioUsuario servicioUsuario;
	
	public Menu() {
		this.servicioUsuario = new ServicioUsuario();
	}
	
	public void startMenu() {
		// Crear Usuarios
		// Editar Usuario
		
		int option = 0;
		
		do {
			System.out.println("Seleccione la opción según convenga\n");
			System.out.println("1. Crear Usuario");
			System.out.println("2. Editar Usuario \n");
			option = selectOption();
			
			switch(option) {
				case 1:
					Usuario newUser = UserOperations.capturarUsuario(
							this.servicioUsuario.getNextIdentifierAvailable()
							);
					if(this.servicioUsuario.addUser(newUser))
						System.out.println("Usuario agregado correctamente");
					break;
				case 2:
					break;
				case 0:
					break;
				default:
					System.out.println("Opcion no válida\n");
			}
			
		}while(option != 0);
	}
	
	private int selectOption() {
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.print("Escriba una opción:\t");
			
			int num = 0;
			boolean completed = false; 
			
			try {
				num = sc.nextInt();
				completed = true;
			} catch (InputMismatchException e) {
				System.out.println("Solo puedes escribir números");
			} catch (NoSuchElementException e) {
				System.out.println("Excepción 1");
			} finally {
				//System.out.println("Esto se hace cada vez");
				if(!completed) {
					sc.next();
				}else {
					return num;
				}
			}
		}while(true);
	}

}
