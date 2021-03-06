import classes.*;
import java.util.Scanner;
import java.util.ArrayList;


/*
TO DO:

- Terminar menu
- Terminar cliente nuevo linea 220~
- Terminar "ir atras" lineas 200~
- Fix bugs

*/


public class Menu{
	public Scanner teclado=new Scanner(System.in);
	public int opcion;
	public int opcion1;
	public int opcion2;
	public int opcion3;
	public int opcion4;
	public int opcion5;

	public ArrayList<String> vuelosDisponibles = new ArrayList<String>();
	public ArrayList<String> asientosDisponibles = new ArrayList<String>();
	public ArrayList<String> clientes = new ArrayList<String>();
	public String origen;
	public String destino;
	public String dniCliente;
	public char[] col={'A','B','C','D','F','G'};
	public Flight vueloSeleccionado;
	public String asientoSeleccionado;

	public Company Iberia;

	public Client clients[]=new Client[20];
  public Plane planes[]=new Plane[3];
  public Pilot pilots[]=new Pilot[2];
  public Tripulation crew[]=new Tripulation[6];
  public Airport aero[]=new Airport[10];
  public Flight flights[]=new Flight[6];

public Menu(){
	try{
		  planes[0]=new Airbus("IBA0001","08/03/2008","Airbus");
		  planes[1]=new Airbus("IBA0002","27/02/2011","Airbus");
		  planes[2]=new Boing("IBB0001","05/12/2013","Boing");

		  pilots[0]=new Pilot(30101010,"Juan","Martinez Santos","14/01/1985","Spain");
		  pilots[1]=new Pilot(30202020,"Jack","Reacher","24/11/1978","EEUU");


		  crew[0]=new Tripulation(30303030,"Jack","Nicholson","05/12/1967","England");
		  crew[1]=new Tripulation(30404040,"Francisco","Carrasquilla","15/10/1993","Spain");
		  crew[2]=new Tripulation(30505050,"Frodo","Bolson","25/12/1867","Hobbiton");
		  crew[3]=new Tripulation(30606060,"Mary","Poppins","05/02/1957","England");
		  crew[4]=new Tripulation(30707070,"Dolores","Rodriguez","09/04/1947","Spain");
		  crew[5]=new Tripulation(30808080,"Julia","Delgado","24/07/1966","Spain");

		  aero[0]=new Airport("Cordoba", "COR");
		  aero[1]=new Airport("Madrid", "MAD");
		  aero[2]=new Airport("Barcelona", "BCN");
		  aero[3]=new Airport("Valencia", "VAL");
		  aero[4]=new Airport("Bilbao", "BIL");
		  aero[5]=new Airport("New York", "NYC");

		  flights[0]=new Flight(aero[0], aero[1], planes[0], pilots, crew, 80, 50, "0800");
		  flights[1]=new Flight(aero[1], aero[2], planes[0], pilots, crew, 50, 40, "0930");
		  flights[2]=new Flight(aero[1], aero[3], planes[1], pilots, crew, 60, 45, "1100");
		  flights[3]=new Flight(aero[3], aero[4], planes[1], pilots, crew, 60, 45, "1230");
		  flights[4]=new Flight(aero[1], aero[5], planes[2], pilots, crew, 600, 620, "1900");

			clients[0]=new Client("1","Jaime","Lovera","14/01/1996","Espania");
			clients[1]=new Client("2","David","Monserrat","01/01/1996","Espania");
			clients[2]=new Client("3","Rafa","Feo","14/01/1996","Espania");
			clients[3]=new Client("4","Juanito","blabla","01/01/1996","Espania");


			Iberia=new Company("Iberia", "IBE", "Carlos", "Serrano", "14/02/2019");
			hireTripulation();
			hirePilot();
			addPlane();
			addFlight(flights);
			addAero();
			addClients();

		}catch(NullPointerException e){
			System.out.println("Que cagada mas grande");
		}
}
	public void addAero(){
	  for(int i=0; i<Airport.amountOfAirports; i++){
			if(aero[i]!=null){
				Iberia.addAero(aero[i]);
			}
		}
	}

	public void addClients(){
		for(int i=0; i<Client.amountOfClients; i++){
			if(clients[i]!=null){
				Iberia.addClient(clients[i]);
			}
		}
	}

	public void hireTripulation(){
	  for(int i=0; i<Tripulation.amountOfTripulation; i++){
			if(crew[i]!=null){
				Iberia.hireEmployee(crew[i]);
			}
		}
	}

	public void hirePilot(){
		boolean done=false;
	  for(int i=0; i<Pilot.amountOfPilots; i++){
			if(pilots[i]!=null){
				Iberia.hireEmployee(pilots[i]);
			}
		}
	}

	public void addPlane(){
	  for(int i=0; i<Plane.amountOfPlanes; i++){
			if(planes[i]!=null){
				Iberia.addPlane(planes[i]);
			}
		}
	}

	public void addFlight(Flight[] flights){
	  for(int i=0; i<Flight.amountOfFlights; i++){
			if(flights[i]!=null){
				Iberia.addFlight(flights[i]);
			}
		}
	}


  //Aqui va el menu:

public void mostrarMenu(){

try{
	do{
		System.out.println("");
		System.out.println("##########################################");
		System.out.println("########    Aerolineas Ryancry    ########");
		System.out.println("##########################################");
		System.out.println("");
		System.out.println("---------------------------------------");
		System.out.println("1 Buscar vuelo ");
		System.out.println("---------------------------------------");
		System.out.println("2 Consultar Billete ");
		System.out.println("---------------------------------------");
		System.out.println("3 Eliminar Billete ");
		System.out.println("---------------------------------------");
		System.out.println("4 Listar Vuelos ");
		System.out.println("---------------------------------------");
		System.out.println("5 Listar Empleados ");
		System.out.println("---------------------------------------");
		System.out.println("6 Listar Clientes ");
		System.out.println("---------------------------------------");
		System.out.println("7 Listar Flota");
		System.out.println("---------------------------------------");
		System.out.println("8 Calcular Salarios totales");
		System.out.println("---------------------------------------");
		System.out.println("9 Calcular la rentabilidad de un vuelo");
		System.out.println("---------------------------------------");
		System.out.println("0 Salir ");
		System.out.println("---------------------------------------");
/*	System.out.println("Hay instanciados "+Flight.amountOfFlights+" vuelos");
	System.out.println("Hay instanciados "+Pilot.amountOfPilots+" pilotos");
	System.out.println("Hay instanciados "+Client.amountOfClients+" clientes");
	System.out.println("Hay instanciados "+Airport.amountOfAirports+" aeropuertos");
	System.out.println("Hay instanciados "+Ticket.amountOfTickets+" tickets");
	System.out.println("Hay instanciados "+Employee.amountOfEmployees+" empleados");*/

	opcion = teclado.nextInt();

	switch (opcion) {

						case 1:
								asientosDisponibles.clear();
								buscarVuelo();
								new Scanner(System.in).nextLine();
								break;
						case 2:
								consultaBillete();
								new Scanner(System.in).nextLine();
								break;
						case 3:
								eliminaBillete();
								new Scanner(System.in).nextLine();
								break;
						case 4:
								Iberia.listFlight();
								new Scanner(System.in).nextLine();
								break;
						case 5:
								Iberia.listEmployee();
								new Scanner(System.in).nextLine();
								break;
						case 6:
								Iberia.listClient();
								new Scanner(System.in).nextLine();
								break;
						case 7:
								Iberia.listAero();
								new Scanner(System.in).nextLine();
								break;
						case 8:
								Iberia.printSalary();
								new Scanner(System.in).nextLine();
								break;
						case 9:
								Iberia.listFlight();
								System.out.println("Selecciona un Vuelo escribiendo su ID para ver su rentabilidad, o 0 para volver");
								opcion1=teclado.nextInt();
								if(opcion1!=0){
									for(int i=0; i<Flight.amountOfFlights; i++){
										if(flights[i].equals(opcion1-1)){
											Iberia.getRentabilityOfFlight(flights[i]);
										}
									}
								}
								new Scanner(System.in).nextLine();
								break;
						case 0:
				salirPrograma();
				break;
				default:
				System.out.println("Esa no es una opcion");

			}
		}while(opcion!=0);
	}catch(Exception e){
		System.out.println("Error "+e);
		teclado.nextLine();
		mostrarMenu();
	}
	}



		public void buscarVuelo(){
			boolean done = false;
			do{
				teclado.nextLine();
			System.out.println("Introduzca un aeropuerto de origen o 0 para volver");
			origen = teclado.nextLine();
			if(!origen.equals("0")){
			System.out.println("Introduzca un aeropuerto de destino o 0 para volver");
			destino = teclado.nextLine();
			if(!destino.equals("0")){

			vuelosDisponibles = Iberia.searchFlight(origen, destino);

			if(vuelosDisponibles.size()!=0){
				done=true;
				for(int i=0; i<vuelosDisponibles.size(); i++){
					if(vuelosDisponibles.get(i)!=null){
						System.out.println((i+1)+" "+vuelosDisponibles.get(i));
					//vueloSeleccionado = vuelosDisponibles.get(i);
					}
				}
				seleccionaVuelo();
			}else{
				System.out.println("No hay vuelos disponibles para ese origen y destino");
			}
		}else{
			mostrarMenu();
		}
	}else{
		mostrarMenu();
	}
	}while(!done);
}

public void seleccionaVuelo(){
				System.out.println("Seleccione un vuelo escribiendo su ID o vuelva al menu intruduciendo 0");
				opcion2 = teclado.nextInt();
				if(opcion2!=0){
				vueloSeleccionado=flights[opcion2-1];
					for(int i=0; i<Flight.amountOfFlights; i++){
						if(flights[i].equals(flights[opcion2-1])){
							System.out.println("Seleccionado el vuelo "+flights[i].toString());
							System.out.println("Los asientos del vuelo son: ");
							flights[i].printSeats();
							asientosDisponibles = Iberia.getFreeSeatsFromFlight(flights[i]);
						}
					}
				}else if(opcion2==0){
					mostrarMenu();
				}else{
					System.out.println("No es una opcion valida");
					seleccionaVuelo();
				}
			//Llamo a getFreeSeats con el Vuelo del que quiero los asientos y
				teclado.next();
				imprimeAsientos();
			}


	public void imprimeAsientos(){
			boolean siguiente = false;
		do{
				{ //Imprimimos los asientos disponibles
						boolean done = false;
					for(int i=0; i<asientosDisponibles.size()&&!done; i++){
						if(asientosDisponibles.get(i)!=null){
							System.out.println((i+1)+" "+asientosDisponibles.get(i));
						}
					}
				}
				System.out.println("Seleccione el asiento o vuelva atras intruduciendo 0");
				opcion3 = teclado.nextInt();
				if(opcion3!=0){
				asientoSeleccionado = asientosDisponibles.get(opcion3-1);
				dniThings();
			}else if(opcion3==0){
				seleccionaVuelo();
			}else{
				System.out.println("No es una opcion valida");
			}
			}while(opcion3!=0 && !siguiente);
		}

public void dniThings(){
	String dniCliente;
	String nombreCliente;
	String apellidosCliente;
	String fechaCliente;
	String nacionalidadCliente;
	boolean comprado=false;
	boolean siguiente = false;
	boolean registrado=false;
	Client c;

		do{

			System.out.println("Introduzca su DNI");
			dniCliente = teclado.next();
			c=Iberia.searchClient(dniCliente);
			if (c!=null){
				if(Iberia.buyTicket(dniCliente, vueloSeleccionado, asientoSeleccionado)==true){
					System.out.println("Comprado.");
					siguiente = true;
				}
			}else{
				System.out.println("Usted no esta registrado como cliente");
				System.out.println("Quiere registrarse ahora? Introduzca 1 si lo desea, 0 si no");
				opcion4 = teclado.nextInt();
					if (opcion4==1){
						System.out.println("Introduzca su dni");
						dniCliente = teclado.next();
						System.out.println("Introduzca su nombre");
						nombreCliente = teclado.next();
						System.out.println("Introduzca sus apellidos");
						apellidosCliente = teclado.next();
						System.out.println("Introduzca su fecha de nacimiento");
						fechaCliente = teclado.next();
						System.out.println("Introduzca su nacionalidad");
						nacionalidadCliente = teclado.next();
						Client clienteNuevo = new Client(dniCliente, nombreCliente, apellidosCliente, fechaCliente, nacionalidadCliente);
						clients[Client.amountOfClients]=clienteNuevo;
						System.out.println(clienteNuevo.toString());
						registrado=Iberia.addClient(clienteNuevo);
						if(registrado==true){
							System.out.println("Ahora esta registrado, procedemos a comprar su billete");
							comprado=Iberia.buyTicket(dniCliente, vueloSeleccionado, asientoSeleccionado);
							if(comprado==true){
								System.out.println("Ticket emparejado a su DNI");
								clienteNuevo.addTicket(vueloSeleccionado, asientoSeleccionado);
								siguiente = true;
						}else{
							System.out.println("Ha habido un problema emparejando el billete. Contacte con soporte.");
						}
					}else{
						System.out.println("Ha habido un problema registrandolo. Contacte con soporte.");

				}
					}else if(opcion4==0){
						salirPrograma();
					}else{
						System.out.println("No es una opcion valida");
						dniThings();
						}
					}
				}while(opcion4!=0 && !siguiente);
					if (opcion4==0){
						salirPrograma();
			}
		}




	public void consultaBillete() {
		Client c=null;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca su DNI");
		dniCliente = teclado.next();
		c=Iberia.searchClient(dniCliente);
		if (c!=null){
				c.listTickets();
			}else{
				System.out.println("No hay ningun ticket registrado con ese DNI");
			}
	}

	public void eliminaBillete() {
		Client c=null;
		String identificador;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca su DNI");
		dniCliente = teclado.next();
		c=Iberia.searchClient(dniCliente);
		if (c!=null){
		System.out.println("Introduzca el identificador de su pasaje");
		identificador = teclado.next();
			if(c.removeTicket(identificador)==true){
				System.out.println("Eliminado con exito");
			}else{
				System.out.println("No se ha podido eliminar porque no existe");
			}
		}else{
				System.out.println("No hay ningun usuario registrado con ese DNI");
			}
	}

public void salirPrograma(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Volver al menu principal o salir? 1/Menu 0/Salir");
		int opcion5 = teclado.nextInt();
		if (opcion5==1){
				mostrarMenu();
			}else{
				System.out.println("Gracias por usarnos!");
				if (opcion5==1){
				}
			}
		}


	}
