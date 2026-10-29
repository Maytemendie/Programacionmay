package entradaSalida;

import java.util.Scanner;

public class factorial39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.print("dime un numero entero y te muestro su factorial");
			int num = sc.nextInt();
			int factorial=1; 
			
			for(int i=num; i>1; i--) {
				System.out.println("tengo " + factorial + " lo multiplico por " + i);
				factorial=factorial*i; 
			}
			System.out.printf("el factorial de %d es %d", num, factorial);
			
	
	}

}
