package classes;
import interfaces.IAirCompany;
import classes.*;


abstract public class Company implements IAirCompany{
  //Valores por defecto de las variables
  public static final String COMP_NAME_DEF="Nameless company";
  public static final String SIGLAS_DEF="AAA";
  public static final String CEON_DEF="None";
  public static final String CEOS_DEF="";
  public static final String CREAT_DATE_DEF="01/01/2000";
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
  public Client[] clients=new Cliente[amountOfClients];
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

  //METODOS DE EMPLEADOS
  public void hireEmployee(Employee emp){
    boolean hired=false;
    if(emp instanceof Tripulation){
      for(int i=0; i<Tripulation.amountOfTripulation&&!hired; i++){
        if(crew[i]==null){
          crew[i]=emp;
          hired=true;
          System.out.println("The employee named "+emp.name+" "+emp.surname+" has been hired");
        }
      }
      if(hired==false){
        System.out.println("The employee named "+emp.name+" "+emp.surname+" could not be hired");
      }
    }else if(emp instanceof Pilot){
      for(int i=0; i<Pilot.amountOfPilots&&!hired; i++){
        if(pilots[i]==null){
          pilots[i]=emp;
          hired=true;
          System.out.println("The employee named "+emp.name+" "+emp.surname+" has been hired");
        }
      }
      if(hired==false){
        System.out.println("The employee named "+emp.name+" "+emp.surname+" could not be hired");
      }
    }
  }

  public boolean fireEmployee(String name){
    boolean fired=false;
    for(int i=0; i<Tripulation.amountOfTripulation&&!fired; i++){
      if(crew[i].name==name){
        crew[i]=null;
        fired=true;
      }
    }
    for(int i=0; i<Pilot.amountOfPilots&&!fired; i++){
      if(pilots[i].name==name){
        pilots[i]=null;
        fired=true;
      }
    }
    return fired;
  }

  public void listEmployee(){
    for(int i=0; i<Pilot.amountOfPilots; i++){
      System.out.println(pilots[i].toString());
    }
    for(int i=0; i<Tripulation.amountOfTripulation; i++){
      System.out.println(crew[i].toString());
    }
  }

  public Employee searchEmployee(String named){
    boolean found=false;
    Employee sol=null;
    for(int i=0; i<Tripulation.amountOfTripulation&&!found; i++){
      if(crew[i].name==named){
        sol=crew[i];
        found=true;
      }else if(pilots[i].name==named){
        sol=pilots[i];
        found=true;
      }
    }
    return sol;
  }

  public int totalSalary(String name){
    boolean found=false;
    int money;
    for(int i=0; i<Tripulation.amountOfTripulation&&!found; i++){
      if(crew[i].name==name){
        money=crew[i].totalSalary();
        found=true;
      }else if(pilots[i].name==name){
        money=pilots[i].totalSalary();
        found=true;
      }
    }
    return money;
  }

  //METODOS DE AVION
  public void addPlane(Plane p){
    boolean added=false;
    for(int i=0; i<Plane.amountOfPlanes&&!added; i++){
      if(planes[i]==null){
        planes[i]=p;
        added=true;
        System.out.println("The plane has been added");
      }
    }
    if(added==false){
      System.out.println("The plane could not be added");
    }
  }

  public void listPlane(){
    for(int i=0; i<Plane.amountOfPlanes; i++){
      System.out.println(planes[i].toString());
    }
  }

  public boolean removePlane(String matric){
    boolean removed=false;
    for(int i=0; i<Plane.amountOfPlanes&&!removed; i++){
      if(planes[i].matricula==matric){
        planes[i]=null;
        removed=true;
      }
    }
    return removed;
  }
/*
*Hemos eliminado aquí el metodo searchPlane ya que no le vemos utilidad por ahora
*/
  public void addFlight(Flight f){
    boolean added=false;
    for(int i=0; i<Flight.amountOfFlights&&!added; i++){
      if(flights[i]==null){
        flights[i]=f;
        added=true;
        flights[i].iniciaSeats();
        System.out.println("The flight has been added");
      }
    }
    if(added==false){
      System.out.println("The flight could not be added");
    }
  }
  public void listFlight(){
    //metodo que llama a toString de Flight y muestra por partalla
    //los atributos de cada vuelo de nuestro array.
    for(int i=0; i<Flight.amountOfFlights; i++){
      System.out.println(flights[i].toString());
    }
  }

  /*Metodo que recibe dos aeropuertos de origen y destino y
  muestra por pantalla los vuelos disponibles entre esos dos aeropuertos
  *Tambien tiene que mostrar los vuelos aunque sea con escalas
  *
  */
  public ArrayList searchFlight(String a, String b){
    boolean any=false;
    List<String> vuelosDisponibles = new ArrayList<String>();
    for(int i=0; i<Flight.amountOfFlights;i++){//para vuelos directos
      if(flights[i].origin.nombreAero==a && flights[i].destiny.nombreAero==b){
        vuelosDisponibles.add(flights[i].toString());
        any=true;
      }
    }
    /*System.out.println("Vuelos con escala: ");
    for(int i=0;i<amountOfFlights;i++){//para vuelos con escala
      for(int j=0;j<amountOfFlights;j++){
        if(i!=j){
          if(flights[i].origen.nombreAero==a && flights[j].destiny.nombreAero==b){
            System.out.println("- "+flights[i].toString());
            System.out.println("- Vuelo con escala en "+flights[i].destiny.nombreAero);
            System.out.println("- "+flights[j].toString());
            any=true;
          }
        }
      }
    }*/
    if(any==false){
      System.out.println("No se han encontrado vuelos");
    }
    return vuelosDisponibles;
  }

  public boolean removeFlight(int num){
    boolean removed=false;
    if(num<Flight.amountOfFlights&&num>-1){
      flights[num]=null;
      removed=true;
    }
    return removed;
  }

//METODOS DE TICKET
  public boolean buyTicket(String dni, Flight f, String asiento){
      boolean bought=false;
      
  }
  boolean removeTicket(){

  }
  Flight searchTicket(){

  }

//METODOS DE CLIENTE
  public boolean addClient(Client c){
    boolean added=false;
    if(c instanceof Client){
      for(int i=0; i<Client.amountOfClients; i++){
        if(clients[i]==null){
          clients[i]=c;
          added=true;
        }
      }
    }
    return added;
  }

  public void listClient(){
    for(int i=0; i<Client.amountOfClients; i++){
      System.out.println(clients[i].toString());
    }
  }

  public Client searchClient(String dni){
      Client miCliente;
      for(int i=0; i<Client.amountOfClients; i++){
        if(clients[i].DNI==dni){
          miCliente=clients[i];
        }
      }
      return miCliente;
  }
  public boolean removeClient(Client c){
    boolean removed=false;
    if(c instanceof Client){
      for(int i=0; i<Client.amountOfClients; i++){
        if(clients[i]==c){
          clients[i]=null;
          removed=true;
        }
      }
    }
    return removed;
  }

  public void getFreeSeatsFromFlight(){}
  public void getRentabilityOfFlight(){}
}
