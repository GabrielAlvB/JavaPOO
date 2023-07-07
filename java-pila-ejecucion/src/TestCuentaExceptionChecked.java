
public class TestCuentaExceptionChecked {
	public static void main(String[] args) {
		Cuenta cuenta=new Cuenta();
		try {
			cuenta.deposita();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
