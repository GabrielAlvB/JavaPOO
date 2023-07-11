
public class TestConnection {
	public static void main(String[] args) throws Exception {
		
		try (Connection con= new Connection()){
			con.leerDatos();
		} catch (IllegalStateException e) {
			System.out.println("ejecutando catch");
			e.printStackTrace();
		}
		
		/*//este codigo funciona pero podria ser mejor
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
		}*/
	}
	
}
