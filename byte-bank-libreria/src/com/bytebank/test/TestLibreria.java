package com.bytebank.test;

import modelo.Cuenta;
import modelo.CuentaAhorros;

public class TestLibreria {
	public static void main(String[] args) {
		Cuenta cuenta= new CuentaAhorros(1,1);
		
		cuenta.deposita(200);
	}
}
