package classes;
import java.util.ArrayList;

public class Client{

	private final String DNI_DEF="";
	private final String NOMBRE_DEF="";
	private final String APELLIDOS_DEF="";
	private final String FECHA_NAC="";
	private final String NACION_DEF="";

	public String DNI;
	public String nombre;
	public String apellidos;
	public String fechaNac;
	public String nacionalidad;
  public ArrayList<String> tickets = new ArrayList<>();

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


			public void addTicket (Flight thisF, String seat){
				Ticket miticket=new Ticket(thisF, seat);
				tickets.add(miticket.toString());
			}

			public boolean removeTicket (int position){
				boolean removed=false;
				if(tickets.get(position)!=null){
					tickets.remove(position);
					removed=true;
				}
				return removed;
			}


		public void listTickets(){
			for(int i=0; i<tickets.size();i++){
				System.out.println("--------------------------------");
				System.out.println("Identificador: "+i+" ; "+tickets.get(i));
			}
		}

		@Override
		public String toString(){
			return "Dni: "+this.DNI+" nombre: "+this.nombre+this.apellidos;
		}

}
