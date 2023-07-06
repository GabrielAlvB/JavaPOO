public class Flujo {

  public static void main(String[] args) {
    System.out.println("Ini do main");
    metodo1();
    System.out.println("Fim do main");
  }
  public static void metodo1(){
    System.out.println("Ini do metodo1");
    // si metodo2() throws MiExeption no podemos llamarlo porque si
    //metodo2();
    try {
		metodo2();
	} catch (MiExeption e) {
		System.out.println("Atrapo Exception");
	}
    System.out.println("Fim do metodo1");
  }
  
  private static void metodo2() throws MiExeption{
      System.out.println("Inicio del metodo2");
      throw new MiExeption("Hola exception");
  }
}