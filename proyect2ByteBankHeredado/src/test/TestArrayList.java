package test;

import java.util.ArrayList;

import modelo.Cuenta;
import modelo.CuentaCorriente;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		Cuenta cc= new CuentaCorriente(11, 2);
		Cuenta cc2= new CuentaCorriente(12, 3);
		
		lista.add(cc);
		lista.add(cc2);
		Cuenta obtenerCuenta=  (Cuenta) lista.get(0);
		System.out.println(obtenerCuenta);
	}
}
