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
		Integer numero2=Integer.valueOf(8); //metodo actualizado para asignar valor
		//lista sin <> generics
		List<Integer> lista=new ArrayList<Integer>();
		//primitivo != object
		lista.add(numero);//auto boxing
		lista.add(numero2);
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
	}
}
