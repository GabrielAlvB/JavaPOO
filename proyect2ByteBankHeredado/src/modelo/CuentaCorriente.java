package modelo;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente( int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsufisienteException {
		double comision = 0.2;
		super.saca(valor + comision);
	}

	@Override
	public void deposita(double valor) {
		this.saldo+=valor;
		
	}
	@Override
	public String toString() {
	    return "CuentaCorriente, " + super.toString();
	}
	
}
