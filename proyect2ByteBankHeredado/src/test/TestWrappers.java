package test;

public class TestWrappers {
	public static void main(String[] args) {
		
		Double numeroDouble=12.0; //autoboxing
		Boolean verdadero=true; //autoboxing
		Double numeroDouble2=Double.valueOf("12"); //metodo valueOf sobrecargado
		Double numeroDouble3=Double.valueOf(3); 	// metodo sobrecargado (entero)
		
		System.out.println(numeroDouble2);
		System.out.println(numeroDouble3);
		
		//todos los numeros extienden de la clase Number
		Number numero= Double.valueOf(2);
		System.out.println(numero);
	}
}
