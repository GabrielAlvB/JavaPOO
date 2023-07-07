
public class TestCuentaException {
	public static void main(String[] args) {
		Cuenta cuenta=new CuentaAhorros(1, 1);
		cuenta.deposita(200);
		System.out.println("Entra a la Exception");
		cuenta.saca(210);
		System.out.println("NOO sigue el flujo del programa");
	}
}
