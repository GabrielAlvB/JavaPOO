
public class Gerente extends FuncionarioAutenticable {
	
	
	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente");
		return super.getSalario()+
				super.getSalario()*0.05;
	}
}
