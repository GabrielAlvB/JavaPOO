package test;

import java.util.ArrayList;

import modelo.Cuenta;
import modelo.CuentaCorriente;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
		Cuenta cc= new CuentaCorriente(11, 2);
		Cuenta cc2= new CuentaCorriente(12, 3);
		Cuenta cc3= new CuentaCorriente(11, 2);
		
		lista.add(cc);
		lista.add(cc2);
		Cuenta obtenerCuenta=  (Cuenta) lista.get(0);
		//System.out.println(obtenerCuenta);
		
		System.out.println("Inicio ciclo for");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println("Segundo for");
		// por cada cuenta en lista
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		boolean contiene=lista.contains(cc3);
		if (contiene) {
			System.out.println("Si son iguales, (equals)");
		}
		
		
	}
}
