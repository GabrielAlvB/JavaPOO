
public class Gerente extends Funcionario {
	private String clave;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave=="Contraseña";
	}
	
	public double getBonificacion() {
		return super.getSalario()+
				super.getBonificacion();
	}
}
