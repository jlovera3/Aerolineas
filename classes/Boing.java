package classes;

public class Boing extends Plane{

  private final int ASIENTOS=300;
	private final int PRECIO = 280000000;
	private final int AUTONOMIAKM = 8000;
	private final int CONSUMOLITROKM = 12;
	public static final int B_NUMEROFILAS = 50;
	public static final int B_NUMEROCOLUMNAS = 6;
	public static final int B_NUMEROFILASVIP = 10; //De la 1 a la 5
	public static final int B_CAPACIDADVEHICULOS = 4;

  public String PlaneType="Boing";


  public Boing(){
    super();
  }

  public Boing(String m, String f, String PlaneType){
    super(m, f, PlaneType);

  }
  @Override
  public String toString(){
    return "Avion tipo: "+this.PlaneType+"\n"+"Matricula: "+this.matricula+"\n"
          +"Fecha construccion: "+this.fecha_creacion+"\n"+"Capacidad: "+this.ASIENTOS;
  }
}
