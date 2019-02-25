import classes.*;

public class Main{
public static void Main(String[] args){
	//Entrada teclado para menu
	Scanner teclado=new Scanner(System.in);
	int opcion;
	int opcion2;
	int[] vuelosDisponibles;
	String origen;
	String destino;
	String dniCliente;


  //inicialización de nuestra flota, empleados y vuelos de la compañia
  Company Iberia=new Company("Iberia", "IBE", "Carlos", "Serrano", "14/02/2019");

  Plane[] planes=new Plane[3];
  Pilot[] pilots=new Pilot[6];
  Tripulation[] crew=new Tripulation[10];
  Airport[] aero=new Airport[6];
  Flight[] flights=new Flight[5];

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
}

	protected void hireTripulation(){
		int i=0;
		boolean done=false;
	  for(int i=0; i<amountOfTripulation&&!done; i++){
			if(crew[i]!=null){
				Iberia.hireEmployee(crew[i]);
				done=true;
			}
		}
	}

	protected void hirePilot(){
		int i=0;
		boolean done=false;
	  for(int i=0; i<amountOfPilots&&!done; i++){
			if(pilots[i]!=null){
				Iberia.hireEmployee(pilots[i]);
				done=true;
			}
		}
	}

	protected void addPlane(){
		int i=0;
		boolean done=false;
	  for(int i=0; i<amountOfPlanes&&!done; i++){
			if(planes[i]!=null){
				Iberia.addPlane(planes[i]);
				done=true;
			}
		}
	}

	protected void addFlight(){
		int i=0;
		boolean done=false;
	  for(int i=0; i<amountOfFlights&&!done; i++){
			if(flights[i]!=null){
				Iberia.addPlane(flights[i]);
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
	opcion=teclado.nextInt();
	switch (teclado) {
						case 1:
				buscarVuelo();
				break;
						case 2:
				consultaBillete();
				break;
						case 3:
				eliminaBillete();
				break;
						case 4:
				listaVuelos;
				break;
						case 5:
				listaEmpleados();
				break;
						case 6:
				listaClientes();
				break;
						case 7:
				listaFlota();
				break;
						case 8:
				calculaSalariosTotal();
				break;
						case 9:
				calculaRentabilidad();
				break;
						case 0:
				salir();
				break;
				default:
				System.out.println("Esa no es una opcion");

			}
		}while(opcion!=0);



		public void buscarVuelo (){
			System.out.println("Introduzca un aeropuerto de origen");
			origen = teclado.nextInt();
			System.out.println("Introduzca un aeropuerto de destino");
			destino = teclado.nextInt();

			vuelosDisponibles = Iberia.searchFlight(origen, destino);

			System.out.println("Seleccione un vuelo o vuelva atrás intruduciendo 0");
			opcion2 = teclado.nextInt();
			switch (teclado) {
				case 1:
					System.out.println("Digame su DNI para realizar la compra");
					dniCliente = teclado.nextInt();
					for ()

				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 0:

			}
		}
}
