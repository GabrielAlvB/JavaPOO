
public class TestConnection {
	public static void main(String[] args) {
		Connection conec = null;
		
		try {
			conec=new Connection();
			conec.leerDatos();
			//se necesita cerrar la conexion
			//conec.cerrar();
		} catch (IllegalStateException e) {
			System.out.println("Recibiendo Exception");
			e.printStackTrace();
		}finally {
			// con finally si o si se ejecuta el metodo cerrar conection
			if (conec != null) {
				conec.cerrar();

			}
		}
	}
}
