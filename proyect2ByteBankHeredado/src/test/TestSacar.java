package test;
import modelo.SaldoInsufisienteException;
import modelo.Cuenta;
import modelo.CuentaCorriente;

public class TestSacar {

        public static void main(String[] args) {
            Cuenta cuenta = new CuentaCorriente(123, 321);

            cuenta.deposita(200.0);

            try {
                cuenta.saca(210.0);
            } catch(SaldoInsufisienteException ex) {
                System.out.println("Exception: " + ex.getMessage());
                ex.printStackTrace();
            }

            System.out.println(cuenta.getSaldo());
        }
}