
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primerCuenta= new Cuenta();
		primerCuenta.depositar(200);
		System.out.println(primerCuenta.getSaldo());
	}
}
