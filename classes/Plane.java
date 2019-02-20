

public class Plane (){
	
	private final String MATRICULA_DEF="";
	private final String SIGLAS_DEF="";
	private final String FECHA_CREACION_DEF="0/0/0";

	private String matricula;
	private String siglas;
	private String fecha_creacion;
	
	public Plane (){
		this.matricula = MATRICULA_DEF;
		this.siglas = SIGLAS_DEF;
		this.fecha_creacion = FECHA_CREACION_DEF;
		
		
	}
	
	public Plane (String m, String f){
		int firstThreeChars;
		
		this.matricula = m;
		
		if (m.length() > 3)
		{
			firstThreeChars = input.substring(0, 3);
		}
		else
		{
			firstThreeChars = m;
		}
		
		this.siglas = firstThreeChars;
		
		this.fecha_creacion = f;
		
	}
}