package test;

import modelo.Cuenta;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;

public class TestReferenciasObject {
	 // alterando el tipo
	public static void main(String[] args) {
    Object[] referencias = new Object[5];
    CuentaCorriente cc1 = new CuentaCorriente(22, 11);
    referencias[0] = cc1;

    // crea instancia de CuentaAhorro
    CuentaAhorros ca2 = new CuentaAhorros(22, 22);
    referencias[1] = ca2;    

    //no se puede hacer de esta manera, se tiene que castear
    //System.out.println(referencias[1].getNumero()  );
    System.out.println(((Cuenta) referencias[1]).getNumero()  );

    
    // altero o tipo, realizando o cast
    CuentaCorriente ref = (CuentaCorriente) referencias[0];
    //System.out.println(cc2.getNumero()); //no sirve sin el cast
    System.out.println(ref.getNumero());
	}
}
