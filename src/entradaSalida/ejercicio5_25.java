package entradaSalida;

import java.util.Scanner; 

public class ejercicio5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in); 
		System.out.print("Dame un numero y lo escribo en vertical");
		String palabra = sc.nextLine();
		
		for (int i=0; i<palabra.length(); i++)
			System.out.println(palabra.charAt(i));
		
	
		for (int i=palabra.length()-1; i>=0; i--)
		System.out.println(palabra.charAt(i));
	
	}
}
