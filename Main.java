import classes.*;

public static void main(String[args]){
  //inicialización de nuestra flota, empleados y vuelos de la compañia
  Company Iberia=new Company("Iberia", "IBE", "Carlos", "Serrano", "14/02/2019");

  Airbus plane1=new Airbus("IBA0001","08/03/2008");
  Airbus plane2=new Airbus("IBA0002","27/02/2011");
  Boing plane3=new Boing("IBB0001","05/12/2013");

  Pilot pilot1=new Pilot(30101010,"Juan","Martinez Santos","14/01/1985","Spain");
  Pilot pilot2=new Pilot(30202020,"Jack","Reacher","24/11/1978","EEUU");

  Tripulation steward1=new Tripulation(30303030,"Jack","Nicholson","05/12/1967","England");
  Tripulation steward2=new Tripulation(30404040,"Francisco","Carrasquilla","15/10/1993","Spain");
  Tripulation steward3=new Tripulation(30505050,"Frodo","Bolson","25/12/1867","Hobbiton");
  Tripulation stewardess1=new Tripulation(30606060,"Mary","Poppins","05/02/1957","England");
  Tripulation stewardess2=new Tripulation(30707070,"Dolores","Rodriguez","09/04/1947","Spain");
  Tripulation stewardess3=new Tripulation(30808080,"Julia","Delgado","24/07/1966","Spain");
 int a;
  Airport aero1=new Airport();
  Airport aero2=new Airport();
  Airport aero3=new Airport();
  Airport aero4=new Airport();
  Airport aero5=new Airport();
  Airport aero6=new Airport();
  //Contratacion de empleados
  Iberia.hireEmployee((Employee)pilot1);
  Iberia.hireEmployee((Employee)pilot2);
  Iberia.hireEmployee((Employee)steward1);
  Iberia.hireEmployee((Employee)steward2);
  Iberia.hireEmployee((Employee)steward3);
  Iberia.hireEmployee((Employee)stewardess1);
  Iberia.hireEmployee((Employee)stewardess2);
  Iberia.hireEmployee((Employee)stewardess3);

  Flight flight1=new Flight (aero1, aero2, plane1, pilot1, pilot2, steward1,
   steward2, 80, 50, 0800);
  Flight flight2=new Flight()

//otra
  //Aqui va el menu:




}
