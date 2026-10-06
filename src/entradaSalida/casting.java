package entradaSalida;

public class casting {

	public static void main(String[] args) {
		int entero = 42; 
		// podemos inicializar una variable con otra
		//aqui el cambio es automático (Widening)
		long grande = entero; 
		//esto no se puede hacer, si descomentamos la linea de abajo falla
		//no puedo meter una caja grande en una caja pequeña (Narowing)
		//byte pequeña = entero; 
		
		//podemos hacer un cast, java me deja hacerlo, por mi cuenta y riesgo
		byte pequeña = (byte) entero; 
		
		
		//System.out.println("en este caso la variable 'pequeña', tiene el valor" + pequeña); 
		
		//supongamos ahora que tenemos un número en un String
		String edad = "42";
		System.out.println("el año que viene tendré " +edad + 1 + "años"); 
		//dará error porq pondrá el 1 al lado de la edad, dejando 421
		System.out.println("el año que viene tendré " + (Integer.parseInt(edad) + 1) + " años"); 
		
		
		
		

	}

}
