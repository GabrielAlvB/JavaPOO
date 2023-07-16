package test;

import modelo.CuentaCorriente;

public class TestArregloReferencias {
	public static void main(String[] args) {
		CuentaCorriente cc= new CuentaCorriente(1, 1);
		//arreglo de objetos
		CuentaCorriente[] cuentas= new CuentaCorriente[5];
		cuentas[0]=cc;
		
		System.out.println(cuentas[0]);
	}
}
