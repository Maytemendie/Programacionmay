package entradaSalida;

import java.util.Scanner;

public class ProblemaScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("introduce tu nombre 1");
		String nombre1 = scanner.nextLine(); 
		System.out.print("introduce tu edad 1"); 
		int edad1 = scanner.nextInt(); 
		scanner.nextLine();
		System.out.print("introduce tu nombre 2");
		String nombre2 = scanner.nextLine(); 
		System.out.print("introduce tu edad 2");
		int edad2 = scanner.nextInt(); 
		scanner.nextLine();
		int suma = edad1 + edad2; 
		System.out.print("las edades suman" + suma); 
		
		

	}

}
