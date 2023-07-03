
public class TestReferencias {
	public static void main(String[] args) {
		//
		//Funcionario funcionario= new Gerente();
		Funcionario funcionario= new Funcionario();
		funcionario.setNombre("Gabriel");
		
		//La siguuiente linea no funciona, pues de lo especifico se pasa a lo
		//general
		//Gerente gerente=new Funcionario();
		Gerente gerente=new Gerente();
		gerente.setNombre("Alvarez");
		
	}
}
