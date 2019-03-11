package classes;

abstract public class Plane {

	private final String MATRICULA_DEF="";
	private final String SIGLAS_DEF="";
	private final String FECHA_CREACION_DEF="0/0/0";

	protected String matricula;
 	protected String siglas;
	protected String fecha_creacion;
	public static int amountOfPlanes=0;
	public String PlaneType;

	public Plane (){
		this.matricula = MATRICULA_DEF;
		this.siglas = SIGLAS_DEF;
		this.fecha_creacion = FECHA_CREACION_DEF;
		this.PlaneType="";
		this.amountOfPlanes++;
	}

	public Plane (String m, String f, String type){
		String firstThreeChars;
		this.matricula = m;
		if (m.length() > 3)
		{
			firstThreeChars =m.substring(0, 3);
		}
		else
		{
			firstThreeChars = m;
		}
		this.siglas = firstThreeChars;
		this.fecha_creacion = f;
		this.PlaneType=type;
		this.amountOfPlanes++;
	}
	abstract public String toString();
}
