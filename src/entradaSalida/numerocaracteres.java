package entradaSalida;

import java.util.Scanner;

public class numerocaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String frase = "Tres tristes tigres comen trigo en un trigal en tres tristes platos. Tanto trigo tragaban que los tres tristes tigres se atragantaron";
		int contador = 0;
		for(int i = 0; i <frase.length(); i++)
			if (frase.charAt(i) == 'a')
				contador ++;
		System.out.println("la frase " + frase + "," + "son " + contador + " a");
	}

}
