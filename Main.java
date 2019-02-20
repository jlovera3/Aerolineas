import classes.*;

public static void main(String[args]){
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
  Flight flight1=new Flight (aero1, aero2, plane1, pilots[], crew[0], crew[1], 80, 50, 0800);

//otra
  //Aqui va el menu:




}
