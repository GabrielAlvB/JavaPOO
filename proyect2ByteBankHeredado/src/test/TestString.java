package test;

import modelo.CuentaAhorros;
import modelo.CuentaCorriente;


public class TestString {
	public static void main(String[] args) {
		Object cc = new CuentaCorriente(22, 33);
        Object cp = new CuentaAhorros(33, 22);

        //method println use .toString method
        //OVERRIDING METHOD .TOSTRING ON CA Y CC Y CUENTA
        System.out.println(cc);
        System.out.println(cp);
	}
}
