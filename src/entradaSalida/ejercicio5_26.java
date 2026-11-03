package entradaSalida;

import java.util.Scanner;

public class ejercicio5_26 {
	
	public static int contar(String s, char c);{
		int veces=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) { 
				veces++;
			}
		}
		
		return veces;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una frase: ");
		String frase = sc.nextLine();
		System.out.println("escribe un caracter y cuento cuantas veces aparece: ");
		char caracter = sc.nextLine().charAt(0);
		
		/*
		 * int numApariciones=0;
	
		for (int i=0; i<s.length();i++) {
			if (s.charAt(i)==caracter); {
				numApariciones++;}
			}
		}*/
	
		int numApariciones=contar(frase, caracter);
		System.out.printf("en total el caracter %c aparece" + "un total de %d veces", caracter, numApariciones);
		
		sc.close();
	}
}



