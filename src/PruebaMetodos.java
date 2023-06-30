
public class PruebaMetodos {

	public static void main(String[] args) {
		Cuenta miCuenta= new Cuenta();
		miCuenta.saldo=300;
		miCuenta.depositar(400);
		System.out.println(miCuenta.saldo);
		miCuenta.retirar(500);
		System.out.println(miCuenta.saldo);
		Cuenta cuentaJimena= new Cuenta();
		cuentaJimena.depositar(1000);
		System.out.println("Saldo Jimena= "+ cuentaJimena.saldo);
		cuentaJimena.transferir(500, miCuenta);
		System.out.println("Saldo mi cuenta= "+miCuenta.saldo);
		System.out.println("Saldo Jimena= "+ cuentaJimena.saldo);
		
	}
}
