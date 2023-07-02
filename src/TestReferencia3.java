
public class TestReferencia3 {
	public static void main(String[] args) {
		Cuenta cuentaDiego=new Cuenta();
		//this give us an error 
		//System.out.println(cuentaDiego.titular.nombre);
		Cliente cliente=new Cliente();
		cuentaDiego.titular=cliente;
		System.out.println(cuentaDiego.titular.nombre);
	}
}
