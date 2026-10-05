package entradaSalida;

import java.util.Scanner;

public class SaludoPersonalizado {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		String nombre; 
		
		System.out.print("hola, ¿Como te llamas?");
		nombre=lector.nextLine();
		System.out.print("encantado de conocerte " + nombre);
	}

}
