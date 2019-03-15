package classes;

public class Airport{

	static private final String NOMBRE_DEF="";
	static private final String SIGLAS_DEF="";

 	protected String nombreAero="";
	protected String siglas="";

	public static int amountOfAirports=0;


  public Airport(){
    this.nombreAero = NOMBRE_DEF;
		this.siglas = SIGLAS_DEF;
		this.amountOfAirports++;
  }

  public Airport(String n, String s){
    this.nombreAero = n;
		this.siglas = s;
		this.amountOfAirports++;
  }

	public String toString(){
    return "Aeropuerto: "+this.nombreAero+", con las siglas: "+this.siglas;
  }
}
