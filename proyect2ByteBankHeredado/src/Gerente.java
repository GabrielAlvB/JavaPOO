
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
		System.out.println("Ejecutando desde gerente");
		return super.getSalario()+
				super.getSalario()*0.05;
	}
}
