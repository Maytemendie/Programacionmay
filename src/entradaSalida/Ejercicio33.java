package entradaSalida;

import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("introduce un numero");
		int numero = scanner.nextInt(); 
		System.out.print("introduce otro numero");
		int numero2 = scanner.nextInt(); 
		int suma= numero + numero2;
		int resta= numero - numero2;
		int multiplicación= numero * numero2;
		System.out.println("suma " + suma);
		System.out.print("resta " + resta +"\n");
		System.out.println("multiplicación " + multiplicación);
		System.out.print("introduce un numero entero");
		int dividendo = scanner.nextInt();
		System.out.print("introduce otro numero entero");
		int divisor =scanner.nextInt();
		int division= dividendo/divisor;
		System.out.println("dividendo " + dividendo);
		System.out.println("divisor " + divisor);
		System.out.println("resultado " + division); 
		
		
		scanner.close();
		
		

	}

}
