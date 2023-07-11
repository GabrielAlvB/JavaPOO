
public class PruebaEncapsulamiento {
	public static void main(String[] args) {
		Cuenta cuenta= new Cuenta(0, 0);
		Cliente cliente= new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("95195asd");
		
		cuenta.setTitular(cliente);
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getDocumento());
	}
}
