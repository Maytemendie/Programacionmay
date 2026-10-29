package entradaSalida;

import java.util.Scanner;

public class ejercicio63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				System.out.print("Dame un número te pinto un triangulo rectangulo: ");
				int numero = sc.nextInt();
				
				for(int i=1;i<=numero; i++) {
					for(int j=1;j<=i; j++) {
						System.out.print("*");
					}
					System.out.println();
					
				}
				System.out.print("Dame un numero y te pinto un triangulo rectangulo:");
				numero = sc.nextInt();
				for(int i=1; i<=numero; i++) {
					for (int j=1; j<= numero-1; j++)
						System.out.print(" ");
					for (int k=1; k<=i; k++);
						System.out.print("*");
				System.out.println();
				
				}
			}

		}