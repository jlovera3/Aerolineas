package classes;

public class Airbus extends Plane{

  private final int ASIENTOS=80;
	private final int PRECIO = 80000000;
	private final int AUTONOMIAKM = 4000;
	private final int CONSUMOLITROKM = 11;
	public static final int A_NUMERODEFILAS = 20;
	public static final int A_NUMERODECOLUMNAS = 4;
	public static final int A_NUMEROFILASVIP = 5; //De la 1 a la 5
	public static final int A_CAPACIDADVEHICULOS = 0;


  public Airbus(){
    super();
  }

  public Airbus(String m, String f, String type){
    super(m, f, type);

  }
  @Override
  public String toString(){
    return "Avion tipo: "+this.PlaneType+"\n"+"Matricula: "+this.matricula+"\n"
          +"Fecha construccion: "+this.fecha_creacion+"\n"+"Capacidad: "+this.ASIENTOS;
  }
}
