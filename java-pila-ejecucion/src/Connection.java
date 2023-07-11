
public class Connection implements AutoCloseable{
	 public Connection() {
	       System.out.println("Abriendo conexion");
	       //throw new IllegalStateException();
	   }

	   public void leerDatos() {
	       System.out.println("Recibiendo datos");
	       
	   }

	   public void cerrar() {
	       System.out.println("Cerrando conexion");
	   }

	@Override
	public void close() throws Exception {
			cerrar();
	}
}
