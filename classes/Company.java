package proyecto.classes;

abstract public class Company implements IAirCompany{
  //Valores por defecto de las variables
  public static final COMP_NAME_DEF="Nameless company";
  public static final SIGLAS_DEF="AAA";
  public static final CEON_DEF="None";
  public static final CEOS_DEF="";
  public static final CREAT_DATE_DEF="01/01/2000";
  //Variables de la clase
  public String name;
  public String siglasComp;
  public String CEOname;
  public String CEOsurname;
  public String creationDate;
  public Pilot[] pilots=new Pilot[amountOfPilots];
  public Tripulation[] crew=new Tripulation[amountOfTripulation];
  public Plane[] planes=new Plane[amountOfPlanes];
  public Flight[] flights=new Flight[amountOfFlights];
  //Constructores de la clase company:
  public Company(){
    this.name=COMP_NAME_DEF;
    this.siglasComp=SIGLAS_DEF;
    this.CEOname=CEON_DEF;
    this.CEOsurname=CEOS_DEF;
    this.creationDate=CREAT_DATE_DEF;
  }
  public Company(String name, String siglas, String ceoN,
   String ceoS, String date){
    this.name=name;
    this.siglasComp=siglas;
    this.CEOname=ceoN;
    this.CEOsurname=ceoS;
    this.creationDate=date;
  }

  /*
  *@param emp
  * parametro
  */
  public void hireEmployee(Employee emp){
    boolean hired=false;
    for(int i=0; i<amountOfEmployees&&!hired; i++){
      if(employees[i]==null){
        employees[i]=emp;
        hired=true;
        System.out.println("The employee named "+emp.name+" "+emp.surname+" has been hired");
      }
    }
    if(hired==false){
      System.out.println("The employee named "+emp.name+" "+emp.surname+" could not be hired");
    }
  }

  boolean fireEmployee();

  public void listEmployee(){
    for(int i=0; i<amountOfEmployees; i++){
      employees[i].toString();
    }
  }

  Employee searchEmployee();
  public int totalSalary(Employee emp){

  }
  public boolean addPlane(Plane p){


  }
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
