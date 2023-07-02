
public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	
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
		this.agencia=agencia;
	}
	public void setNumero(int numero) {
		this.numero=numero;
	}
}
