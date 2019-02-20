import classes.*;

public static void main(String[args]){
	//Entrada teclado para menu
	Scanner teclado=new Scanner(System.in);
	int opcion;
	
	
  //inicialización de nuestra flota, empleados y vuelos de la compañia
  Company Iberia=new Company("Iberia", "IBE", "Carlos", "Serrano", "14/02/2019");

  Plane[] planes=new Plane[3];
  Pilot[] pilots=new Pilot[2];
  Tripulation[] crew=new Tripulation[6];
  Airport[] aero=new Airport[6];

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

  aero[0]=new Airport();
  aero[1]=new Airport();
  aero[2]=new Airport();
  aero[3]=new Airport();
  aero[4]=new Airport();
  aero[5]=new Airport();

  //Contratacion de empleados
  Iberia.hireEmployee((Employee)pilot1);
  Iberia.hireEmployee((Employee)pilot2);
  Iberia.hireEmployee((Employee)steward1);
  Iberia.hireEmployee((Employee)steward2);
  Iberia.hireEmployee((Employee)steward3);
  Iberia.hireEmployee((Employee)stewardess1);
  Iberia.hireEmployee((Employee)stewardess2);
  Iberia.hireEmployee((Employee)stewardess3);

  Flight flights[0]=new Flight (aero1, aero2, plane1, pilots, crew[0], crew[1], 80, 50, 0800);
  Flight flights[1]=new Flight (aero1, aero2, plane1, pilots[], crew[0], crew[1], 80, 50, 0800);

//otra
  //Aqui va el menu:
  
  
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



}
