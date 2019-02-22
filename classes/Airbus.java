package proyecto.classes;

public class Airbus extends Plane{

  private final int ASIENTOS=80;
	private final int PRECIO = 80000000;
	private final int AUTONOMIAKM = 4000;
	private final int CONSUMOLITROKM = 11;
	private final int NUMERODEFILAS = 20;
	private final int NUMEROCOLUMNAS = 4;
	private final int NUMEROFILASVIP = 5; //De la 1 a la 5
	private final int CAPACIDADVEHICULOS = 0;

  public String PlaneType="Airbus";

  public Airbus(){
    super();
  }

  public Airbus(String m, String f){
    super(m, f);

  }
}
