
public class TestConnection {
	public static void main(String[] args) {
		Connection conec = new Connection();
		
		try {
			conec.leerDatos();
			//se necesita cerrar la conexion
			//conec.cerrar();
		} catch (IllegalStateException e) {
			System.out.println("Recibiendo Exception");
			e.printStackTrace();
		}finally {
			// con finally si o si se ejecuta el metodo cerrar conection
			conec.cerrar();
		}
	}
}
