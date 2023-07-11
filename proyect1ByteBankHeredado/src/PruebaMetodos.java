
public class PruebaMetodos {

	public static void main(String[] args) {
		Cuenta miCuenta= new Cuenta(0, 0);
		miCuenta.depositar(300);;
		miCuenta.depositar(400);
		System.out.println(miCuenta.getSaldo());
		miCuenta.retirar(500);
		System.out.println(miCuenta.getSaldo());
		Cuenta cuentaJimena= new Cuenta(0, 0);
		cuentaJimena.depositar(1000);
		System.out.println("Saldo Jimena= "+ cuentaJimena.getSaldo());
		cuentaJimena.transferir(500, miCuenta);
		System.out.println("Saldo mi cuenta= "+miCuenta.getSaldo());
		System.out.println("Saldo Jimena= "+ cuentaJimena.getSaldo());
		
	}
}
