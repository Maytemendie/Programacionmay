package entradaSalida;

import java.util.Scanner;

public class ej1_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("dame el radio de una circunferencia y te doy " + "su longitud y su area ");
		double radio=sc.nextDouble();
		double longitud = 2*Math.PI*radio;
		double area = Math.PI*Math.pow(radio, 2);
		
		System.out.printf("Con un radio de %.2f su perimetro es de %.2f " + "y su area %.2f ", radio, longitud, area);
		
	}

}
