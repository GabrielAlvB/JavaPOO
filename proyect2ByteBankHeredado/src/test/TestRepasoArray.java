package test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
	public static void main(String[] args) {
		int[] numeros=new int[10];
		
		int numero=7;
		//esta forma ya no se usa mas desde Java9
		
		//WRAPPER
		//Integer numero2=new Integer(8);
		Integer numeroObjeto=Integer.valueOf(8); //metodo actualizado para asignar valor
		//lista sin <> generics
		List<Integer> lista=new ArrayList<Integer>();
		//primitivo != object
		lista.add(numero);//auto boxing
		lista.add(numeroObjeto);
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		
		//unboxing
		//int valorPrimitivo=numeroObjeto;
		int valorPrimitivo=numeroObjeto.intValue();
		
	//wrapers
		double doubleInteger= numeroObjeto.doubleValue();
		float floatInteger=numeroObjeto.floatValue();
		
		System.out.println("MAX value Integer: "+Integer.MAX_VALUE);
		System.out.println("MIN value Integer: "+Integer.MIN_VALUE);
		System.out.println("Numero de Bytes: "+ Integer.BYTES);
		System.out.println("Numero de bits: "+Integer.SIZE);
		
	}
}
