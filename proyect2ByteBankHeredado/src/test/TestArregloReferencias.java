package test;

import modelo.Cuenta;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;

public class TestArregloReferencias {
	public static void main(String[] args) {
		CuentaCorriente cc= new CuentaCorriente(1, 1);
		//arreglo de objetos
		Cuenta[] cuentas= new Cuenta[5];
		cuentas[0]=cc;
		//podemos guardar en el array de tipo cuenta, diversas cuentas 
		//que extiendan de cuenta
		CuentaAhorros ca=new CuentaAhorros(23, 4);
		cuentas[3]=ca;
		System.out.println(cuentas[0]);
		
		cuentas[1]=new CuentaCorriente(2, 3);
		System.out.println(cuentas[1]);
		
		//Cast 
		CuentaAhorros cuentaprueba=(CuentaAhorros)cuentas[3];
		System.out.println(cuentaprueba);
		
		System.out.println("printing the Array");
		for (int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
	}
}
