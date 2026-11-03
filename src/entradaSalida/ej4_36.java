package entradaSalida;

import java.util.Scanner;

public class ej4_36 {

	public static double calcularPerimetro(double radio) {
		double perimetro= 2*Math.PI*radio;
		return perimetro;
	}
	public static double calcularArea(double radio) {
		return Math.PI*Math.pow(radio,2);
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("dame el radio de una circuferencia y te doy " + "su longitud y su área ");
		double radio=sc.nextDouble();
		double perimetro = calcularPerimetro(radio);
		doble area = calcularArea();

	}

}
