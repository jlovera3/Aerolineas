package classes;

public class Airport{

	static private final String NOMBRE_DEF="";
	static private final String SIGLAS_DEF="";

 	protected String nombreAero="";
	protected String siglas="";


  public Airport(){
    this.nombreAero = NOMBRE_DEF;
		this.siglas = SIGLAS_DEF;
  }

  public Airport(String n, String s){
    this.nombreAero = n;
		this.siglas = s;
  }
}
