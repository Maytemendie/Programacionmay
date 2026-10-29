package entradaSalida;

import java.util.Scanner;

public class conjetura60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("dime un numero entero ");
		int numero = sc.nextInt(); 
		while (numero!=1) {
			if(numero%2==0) {
				
				System.out.println(numero + " es par --> " + numero +" /2 = " + numero/2 );
				numero=numero/2;
						
			}else {
				System.out.println(numero + " es impar --> " + numero + "*3+1=" + (numero*3+1));
				numero=numero*3+1;
			}
		
			
		}

	}
}
