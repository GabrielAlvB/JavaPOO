
public class TestCuenta {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaAhorros ca = new CuentaAhorros(2, 3);
		cc.deposita(2000);
		cc.transfiere(1000, ca);
		
		Cuenta cuenta=new CuentaCorriente(1,2);
		cuenta.deposita(1000);
		
		System.out.println(cuenta.getSaldo());
		System.out.println(cc.getSaldo());
	}
	
}