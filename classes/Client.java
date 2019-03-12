package classes;

public class Client{

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
  protected List<String> tickets = new ArrayList<String>();

	public static int amountOfClients=0;

	public Client(){
		this.DNI = DNI_DEF;
		this.nombre = NOMBRE_DEF;
		this.apellidos = APELLIDOS_DEF;
		this.fechaNac = FECHA_NAC;
		this.nacionalidad = NACION_DEF;
		amountOfClients++;
	}

	public Client(String dni, String n, String a, String f, String nac){
		this.DNI = dni;
		this.nombre = n;
		this.apellidos = a;
		this.fechaNac = f;
		this.nacionalidad = nac;
		amountOfClients++;
	}


			public addTicket (Flight thisF, String seat){
					int contador=0;
					boolean done=false;
					if(!done){
					for(int i=0;i<tickets.size()-1;contador++){
						if(tickets(i) == null){
							tickets(i) = Ticket(thisF, seat);
						}else{
						contador++;
						}
					}
					done=true;
				}
			}
}
