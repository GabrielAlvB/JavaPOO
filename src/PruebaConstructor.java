
public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta= new Cuenta(33);
		Cuenta cuenta2= new Cuenta(22);
		Cuenta cuenta3= new Cuenta(44);
		System.out.println(Cuenta.getTotal());
	}
}
