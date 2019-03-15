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

	do{
	System.out.println("\n");
	System.out.println("Aerolineas Cualquiermierda");
	System.out.println("\n");
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
	System.out.println("Hay instanciados "+Flight.amountOfFlights+" vuelos");
	System.out.println("Hay instanciados "+Pilot.amountOfPilots+" pilotos");
	System.out.println("Hay instanciados "+Client.amountOfClients+" clientes");
	System.out.println("Hay instanciados "+Airport.amountOfAirports+" aeropuertos");
	System.out.println("Hay instanciados "+Ticket.amountOfTickets+" tickets");
	System.out.println("Hay instanciados "+Employee.amountOfEmployees+" empleados");





	opcion = teclado.nextInt();
	switch (opcion) {

						case 1:
								buscarVuelo();
								new Scanner(System.in).nextLine();
								break;
						case 2:
								consultaBillete();
								new Scanner(System.in).nextLine();
								break;
						case 3:
	//		eliminaBillete();
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
										if(flights[i].equals(opcion2)){
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
	}



		public void buscarVuelo(){
			boolean done = false;
			do{
			System.out.println("Introduzca un aeropuerto de origen o 0 para volver");
			origen = teclado.next();
			System.out.println("Introduzca un aeropuerto de destino o 0 para volver");
			destino = teclado.next();

			vuelosDisponibles = Iberia.searchFlight(origen, destino);

			for(int i=0; i<vuelosDisponibles.size(); i++){
				if(vuelosDisponibles.get(i)!=null){
					System.out.println((i+1)+" "+vuelosDisponibles.get(i));
					//vueloSeleccionado = vuelosDisponibles.get(i);
				}else{
					done = true;
				}
			}

				System.out.println("Seleccione un vuelo escribiendo su ID o vuelva atras intruduciendo 0");
				opcion2 = teclado.nextInt();
				if(opcion2!=0){
					for(int i=0; i<Flight.amountOfFlights; i++){
						if(flights[i].equals(flights[opcion2-1])){
							System.out.println("Seleccionado vuelo "+flights[i].toString());
							System.out.println("Los asientos del vuelo son: ");
							flights[i].printSeats();
							asientosDisponibles = Iberia.getFreeSeatsFromFlight(flights[i]);
						}
					}
				}
			//Llamo a getFreeSeats con el Vuelo del que quiero los asientos y
				imprimeAsientos();
				done=true;
			}while(done!=true);
		}

	public void imprimeAsientos(){
			boolean siguiente = false;
			int opcion3;
		do{
				{ //Imprimimos los asientos disponibles
						boolean done = false;
					for(int i=0; i<asientosDisponibles.size()-1&&!done; i++){
						if(asientosDisponibles.get(i)!=null && !done){
							System.out.println((i+1)+" "+asientosDisponibles.get(i));
						}else{
							done = true;
						}
					}
				}
				System.out.println("Seleccione el asiento o vuelva atrás intruduciendo 0");
				opcion3 = teclado.nextInt();
				asientoSeleccionado = asientosDisponibles.get(opcion3-1);
				dniThings();
			}while(opcion3!=0 && !siguiente);
		}

public void dniThings(){
	String dniCliente;
	String nombreCliente;
	String apellidosCliente;
	String fechaCliente;
	String nacionalidadCliente;
	int opcion3=0;
	int opcion4=0;
	boolean comprado=false;
	boolean siguiente = false;
	boolean registrado=false;

		do{

			System.out.println("Introduzca su DNI");
			dniCliente = teclado.nextLine();
			Client c=Iberia.searchClient(dniCliente);
			if (c!=null){
				if(Iberia.buyTicket(dniCliente, vueloSeleccionado, asientoSeleccionado)){
					c.addTicket(vueloSeleccionado, asientoSeleccionado);
					System.out.println("Comprado. Su identificador es el");
					siguiente = true;
				}
			}else{
				System.out.println("Usted no esta registrado como cliente");
				System.out.println("Quiere registrarse ahora? Introduzca 1 si lo desea, 0 si no");
				opcion4 = teclado.nextInt();
					if (opcion4==1){
						System.out.println("Introduzca su nombre");
						nombreCliente = teclado.nextLine();
						System.out.println("Introduzca sus apellidos");
						apellidosCliente = teclado.nextLine();
						System.out.println("Introduzca su fecha de nacimiento");
						fechaCliente = teclado.nextLine();
						System.out.println("Introduzca su nacionalidad");
						nacionalidadCliente = teclado.nextLine();
						Client clienteNuevo = new Client(dniCliente, nombreCliente, apellidosCliente, fechaCliente, nacionalidadCliente);
						registrado=Iberia.addClient(clienteNuevo);
						if(registrado==true){
							System.out.println("Ahora está registrado, procedemos a comprar su billete para el vuelo "+this.vueloSeleccionado.toString()+" en el asiento "+this.asientoSeleccionado);
							comprado=Iberia.buyTicket(dniCliente, vueloSeleccionado, asientoSeleccionado);
							if(comprado==true){
								clienteNuevo.addTicket(vueloSeleccionado, asientoSeleccionado);
								siguiente = true;
						}else{
							System.out.println("Ha habido un problema. Contacte con soporte");
						}
					}else if(opcion4==0){
						salirPrograma();
					}else{
						System.out.println("No es una opcion valida");
						dniThings();
						}
					}
				}
			}while(opcion4!=0 && !siguiente);
				if (opcion4==0){
					salirPrograma();
		}
	}



	public void consultaBillete() {
		String pregunta;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce tu DNI");
		pregunta = teclado.nextLine();

	}

public void salirPrograma(){
		Scanner teclado=new Scanner(System.in);
		System.out.println("Volver al menu principal o salir? 1/Menu 0/Salir");
		int opcion5 = teclado.nextInt();
		if (opcion5==1 || opcion5==0){
			if (opcion5==1){
				mostrarMenu();
			}else{
				System.out.println("Gracias por usarnos!");
				}
			}
		}
	}
