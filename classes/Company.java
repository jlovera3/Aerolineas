package proyecto.classes;

abstract public class Company implements IAirCompany{
  public String name;
  public String siglasComp;
  public Plane[] planes;
  public Pilot[] pilots;
  public Tripulation[] stewards;

  public Company(){
    this.name="Iberia";
    this.siglasComp="IBE";
  }


  public boolean hireEmployee(Employee emp){

  }
  
  boolean fireEmployee();
  void listEmployee();
  Employee searchEmployee();
  int totalSalary();

  boolean addPlane();
  void listPlane();
  boolean removePlane();
  Plane searchPlane();

  boolean addFlight();
  void listFlight();
  Flight searchFlight();
  boolean removeFlight();

  boolean buyTicket();
  boolean removeTicket();
  Flight searchTicket();

  boolean addClient();
  void listClient();
  Client searchClient();
  boolean removeClient();

  getFreeSeatsFromFlight();
  getRentabilityOfFlight();
}
