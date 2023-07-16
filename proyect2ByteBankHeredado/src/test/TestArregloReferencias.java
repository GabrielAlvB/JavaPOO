package test;

import modelo.CuentaCorriente;

public class TestArregloReferencias {
	public static void main(String[] args) {
		CuentaCorriente cc= new CuentaCorriente(1, 1);
		//arreglo de objetos
		CuentaCorriente[] cuentas= new CuentaCorriente[5];
		cuentas[0]=cc;
		
		System.out.println(cuentas[0]);
		
		cuentas[1]=new CuentaCorriente(2, 3);
		System.out.println(cuentas[1]);
		
		System.out.println("printing the Array");
		for (int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
	}
}
