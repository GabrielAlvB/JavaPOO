
public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total=0;
	
	public Cuenta(int agencia) {
		if(agencia <=0) {
			System.out.println("No se permite ese numero de agencia");
			this.agencia=1;
		}else {
			this.agencia=agencia;
		}
		total++;
		System.out.println("Total de cuentas creadas= "+total);
	}
	
	public void depositar(double valor) {
		saldo+=valor;
	}
	public boolean retirar(double valor) {
		if (saldo>=valor) {
			saldo-=valor;
			return true;
		} else {
			return false;
		}
		
		
	}
	
	 public void transferir(double valor, Cuenta cuenta1) {
		
		if (this.saldo >= valor) {
			cuenta1.depositar(valor);
			this.saldo-=valor;
		} 		
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		if (agencia>0) {
			this.agencia=agencia;	
		}else {
			System.out.println("No es valido el numero");
		}
	}
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
