
public class TestCuentaException {
	public static void main(String[] args) {
		Cuenta cuenta=new CuentaAhorros(1, 1);
		cuenta.deposita(200);
		System.out.println("Entra a la Exception");
		try {
			cuenta.saca(210);
		} catch (SaldoInsufisienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//with try and catch is posible to continue the flow
		System.out.println("NOO sigue el flujo del programa");
	}
}
