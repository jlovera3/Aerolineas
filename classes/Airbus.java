package classes;

public class Airbus extends Plane{

  private final int ASIENTOS=80;
	private final int PRECIO = 80000000;
	private final int AUTONOMIAKM = 4000;
	private final int CONSUMOLITROKM = 11;
	public static final int NUMERODEFILAS = 20;
	public static final int NUMERODECOLUMNAS = 4;
	private final int NUMEROFILASVIP = 5; //De la 1 a la 5
	private final int CAPACIDADVEHICULOS = 0;

  public String PlaneType="Airbus";

  public Airbus(){
    super();
  }

  public Airbus(String m, String f){
    super(m, f);

  }
  @Override
  public String toString(){
    return "Avion tipo: "+this.PlaneType+"\n"+"Matricula: "+this.matricula+"\n"
          +"Fecha construccion: "+this.fecha_creacion+"\n"+"Capacidad: "+this.ASIENTOS;
  }
}
