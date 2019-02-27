package proyecto.classes;

public class Cliente{

	private final String DNI_DEF="";
	private final String NOMBRE_DEF="";
	private final String APELLIDOS_DEF="";
	private final String FECHA_NAC="";
	private final String NACION_DEF="";

	protected String DNI;
	protected String nombre;
	protected String apellidos;
	protected String fechaNac;
	protected String nacionalidad;

	public static int amountOfClients=0;

	public Cliente(){
		this.dni = DNI_DEF;
		this.nombre = NOMBRE_DEF;
		this.apellidos = APELLIDOS_DEF;
		this.fechaNac = FECHA_NAC;
		this.nacionalidad = NACION_DEF;
		amountOfClients++;
	}

	public Cliente(String dni, String n, String a, String f, String nac){
		this.dni = dni;
		this.nombre = n;
		this.apellidos = a;
		this.fechaNac = f;
		this.nacionalidad = nac;
		amountOfClients++;
	}


}
