
public class TestGerente {
	public static void main(String[] args) {
		Gerente gerente=new Gerente();
		gerente.setSalario(200);
		gerente.setClave("Contraseña");
		gerente.setTipo(1);
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("Contraseña"));
	}
}
