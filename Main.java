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


public class Main{
	public Scanner teclado=new Scanner(System.in);
	public int opcion;
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

	public Company Iberia=new Company("Iberia", "IBE", "Carlos", "Serrano", "14/02/2019");

  public Plane[] planes=new Plane[3];
  public Pilot[] pilots=new Pilot[6];
  public Tripulation[] crew=new Tripulation[10];
  public Airport[] aero=new Airport[6];
  public Flight[] flights=new Flight[5];

public static void Main(String[] args){

  planes[0]=new Airbus("IBA0001","08/03/2008");
  planes[1]=new Airbus("IBA0002","27/02/2011");
  planes[2]=new Boing("IBB0001","05/12/2013");

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

  flights[0]=new Flight(aero[0], aero[1], planes[0], pilots, crew[0], crew[1], 80, 50, "0800");
  flights[1]=new Flight(aero[1], aero[2], planes[0], pilots, crew[2], crew[3], 50, 40, "0930");
  flights[2]=new Flight(aero[1], aero[3], planes[1], pilots, crew[4], crew[5], 60, 45, "1100");
  flights[3]=new Flight(aero[3], aero[4], planes[1], pilots, crew[0], crew[1], 60, 45, "1230");
  flights[4]=new Flight(aero[1], aero[5], planes[2], pilots, crew, 600, 620, "1900");

	hireTripulation();
	hireEmployee();
	addPlane();
	addFlight();
	mostrarMenu();

}



	protected void hireTripulation(){
		boolean done=false;
	  for(int i=0; i<Tripulation.amountOfTripulation&&!done; i++){
			if(crew[i]!=null){
				Iberia.hireEmployee(crew[i]);
				done=true;
			}
		}
	}

	protected void hirePilot(){
		boolean done=false;
	  for(int i=0; i<Pilot.amountOfPilots&&!done; i++){
			if(pilots[i]!=null){
				Iberia.hireEmployee(pilots[i]);
				done=true;
			}
		}
	}

	protected void addPlane(){
		boolean done=false;
	  for(int i=0; i<Plane.amountOfPlanes&&!done; i++){
			if(planes[i]!=null){
				Iberia.addPlane(planes[i]);
				done=true;
			}
		}
	}

	protected void addFlight(){

		boolean done=false;
	  for(int i=0; i<Flight.amountOfFlights&&!done; i++){
			if(flights[i]!=null){
				Iberia.addFlight(flights[i]);
				done=true;
			}
		}
	}


  //Aqui va el menu:

protected void mostrarMenu(){
	do{
	System.out.print("1 Buscar vuelo ");
	System.out.print("2 Consultar	Billete ");
	System.out.print("3 Eliminar	Billete ");
	System.out.print("4 Listar	Vuelos ");
	System.out.print("5 Listar	Empleados ");
	System.out.print("6 Listar	Clientes ");
	System.out.print("7	Listar	Flota ");
	System.out.print("8 Calcular	Salarios	total	 ");
	System.out.print("9 Calcular	la	rentabilidad	de	un	vuelo ");
	System.out.print("0 Salir ");
	opcion = teclado.nextInt();
	switch (opcion) {
						case 1:
				buscarVuelo();
				break;
						case 2:
				consultaBillete();
				break;
						case 3:
	//		eliminaBillete();
				break;
						case 4:
	//		listaVuelos();
				break;
						case 5:
	//		listaEmpleados();
				break;
						case 6:
	//		listaClientes();
				break;
						case 7:
	//		listaFlota();
				break;
						case 8:
	//		calculaSalariosTotal();
				break;
						case 9:
		//		calculaRentabilidad();
				break;
						case 0:
				salirPrograma();
				break;
				default:
				System.out.println("Esa no es una opcion");

			}
		}while(opcion!=0);
	}



		public void buscarVuelo (){
			boolean done = false;
			do{
			System.out.println("Introduzca un aeropuerto de origen o 0 para volver");
			origen = teclado.nextLine();
			System.out.println("Introduzca un aeropuerto de destino o 0 para volver");
			destino = teclado.nextLine();

			vuelosDisponibles = Iberia.searchFlight(origen, destino);
			for(int i=0; i<vuelosDisponibles.size()-1&&!done; i++){

				if(vuelosDisponibles.get(i)!=null){
					System.out.println((i+1)+" "+vuelosDisponibles.get(i));
					//vueloSeleccionado = vuelosDisponibles.get(i);
				}else{
					done = true;
				}
			}

				System.out.println("Seleccione un vuelo escribiendo su ID o vuelva atrás intruduciendo 0");
				opcion2 = teclado.nextInt();
				if(opcion2!=0){
					for(int i=0; i<Flight.amountOfFlights; i++){
						if(flights[i].equals(opcion2)){
							System.out.println("Selecionado vuelo "+flights[i].toString());
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

	public void imprimeAsientos(){												//los guardo en una lista
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
	int opcion3;
	int opcion4;
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
