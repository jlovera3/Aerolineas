package proyecto.classes;

public class Airbus extends Plane{

  	private final int ASIENTOS=300;
	private final int PRECIO = 280000000;
	private final int AUTONOMIAKM = 8000;
	private final int CONSUMOLITROKM = 12;
	private final int NUMERODEFILAS = 50;
	private final int NUMEROCOLUMNAS = 7;
	private final int NUMEROFILASVIP = 10; //De la 1 a la 5
	private final int CAPACIDADVEHICULOS = 4;

  public Airbus(){
    super();
  }

  public Airbus(String m, String f){
    super(m, f);

  }
}
