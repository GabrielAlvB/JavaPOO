
public class CrearCuenta {
	public static void main(String[] args) {
		Cuenta primerCuenta= new Cuenta(0, 0);
		primerCuenta.depositar(200);
		System.out.println(primerCuenta.getSaldo());
	}
}
