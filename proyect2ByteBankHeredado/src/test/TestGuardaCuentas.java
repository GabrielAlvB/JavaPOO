package test;

import modelo.Cuenta;
import modelo.CuentaCorriente;
import modelo.GuardaCuentas;

public class TestGuardaCuentas {
	public static void main(String[] args) {
		GuardaCuentas guardador= new GuardaCuentas();

        Cuenta cc = new CuentaCorriente(22, 11);
        guardador.adicionar(cc);

        Cuenta cc2 = new CuentaCorriente(22, 22);
        guardador.adicionar(cc2);
		System.out.println(guardador);
		
		int tamano = guardador.getCantidadDeElementos();
        System.out.println(tamano);
        
        Cuenta ref = guardador.getReferencia(0);
        System.out.println(ref);
        
	}
}	
