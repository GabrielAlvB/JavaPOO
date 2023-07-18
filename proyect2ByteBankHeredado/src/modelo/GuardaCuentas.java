package modelo;

public class GuardaCuentas {
	
	// Crear un objeto para guardar muchas cuentas
	// permitirnos agregar una cuenta con un metodo 
	// guerdaCuentas.addicionar(cuenta){}
	// entre otros metodos
	
	private Cuenta[] referencias;
    private int posicionLibre;

    public GuardaCuentas() {
        this.referencias = new Cuenta[10];
        this.posicionLibre = 0;
    }

    public void adicionar(Cuenta ref) {
        referencias[this.posicionLibre] = ref;
        this.posicionLibre++;
    }
    
    public int getCantidadDeElementos() {
        return this.posicionLibre;
    }
    
    public Cuenta getReferencia(int indice) {
        return referencias[indice];
    }
}
