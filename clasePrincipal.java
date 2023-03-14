public class clasePrincipal {

    public static void main(String[] args) {

	  Ventana vent = new Ventana();
        Proceso1 extencion = new Proceso1();
        Thread implementacion = new Thread(new Proceso2());
	  
	  vent.start();
        extencion.start();
        implementacion.start();
    }
}
