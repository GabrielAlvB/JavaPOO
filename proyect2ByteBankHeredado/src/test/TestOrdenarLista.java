package test;

import java.util.ArrayList;
import java.util.Comparator;
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
		System.out.println("Imprimiendo antes de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		
		//Ordenar las listas
		// 			Cualquier clase hija de cuenta
		Comparator<Cuenta> comparador=new OrdenarLista();
		// Comparator <? extend Cuenta> c
		lista.sort(comparador);
		
		System.out.println("Imprimiendo despues de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
	}
}

class OrdenarLista implements Comparator<Cuenta>{
 
	//el algoritmo lo hace por si solo ordena -1,1,0
	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		/*
		if (o1.getNumero()==o2.getNumero()) {
			return 0;	
		}else if(o1.getNumero()<=o2.getNumero()) {
			return -1;
		}else {
			return 1;
		}
		*/
		//esto es lo mismo que decir 
		// return o1.getNumero()-o2.getNumero();
		//ya que no nos importa el valor, solamente el signo +,-, o 0
		
		//FORMA WRAPPER
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
	
}

class OrdenarPorNombre implements Comparator<Cuenta>{
	 
	//el algoritmo lo hace por si solo ordena -1,1,0
	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		
		if (o1.getNumero()==o2.getNumero()) {
			return 0;	
		}else if(o1.getNumero()<=o2.getNumero()) {
			return -1;
		}else {
			return 1;
		}
		
	}
	
}
