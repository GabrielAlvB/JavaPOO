package test;

import java.util.ArrayList;
import java.util.List;

import modelo.Cuenta;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;

public class TestOrdenarLista {
	public static void main(String[] args) {
		Cuenta cc1 = new CuentaCorriente(22, 33);
		cc1.deposita(333.0);

		Cuenta cc2 = new CuentaAhorros(22, 44);
		cc2.deposita(444.0);

		Cuenta cc3 = new CuentaCorriente(22, 11);
		cc3.deposita(111.0);

		Cuenta cc4 = new CuentaAhorros(22, 22);
		cc4.deposita(222.0);

		List<Cuenta> lista = new ArrayList<Cuenta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
	}
}
