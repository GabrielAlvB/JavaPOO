
public class SistemaInterno {
	
	private String clave="Contraseña";
	
	public boolean autentica(FuncionarioAutenticable gerente) {
		boolean puedeIniciarSesion=gerente.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Error en el Login");
			return false;
		}
	}
}
