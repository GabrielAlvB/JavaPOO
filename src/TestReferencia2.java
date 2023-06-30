
public class TestReferencia2 {
	public static void main(String[] args) {
		Cliente diego=new Cliente();
		diego.nombre="Diego";
		diego.documento="445473";
		diego.telefono="5577391422";
		
		Cuenta cuentaDiego= new Cuenta();
		cuentaDiego.agencia=1;
		cuentaDiego.titular=diego;
		System.out.println(cuentaDiego.titular.nombre);
	}
}
