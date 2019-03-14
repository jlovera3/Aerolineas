package classes;
import java.util.ArrayList;
import interfaces.IAirCompany;
import classes.*;


public class Company implements IAirCompany{
  private static Company myCompany;
  //Variables de la clase
  public String name;
  public String siglasComp;
  public String CEOname;
  public String CEOsurname;
  public String creationDate;
  public Pilot[] pilots=new Pilot[Pilot.amountOfPilots];
  public Tripulation[] crew=new Tripulation[Tripulation.amountOfTripulation];
  public Plane[] planes=new Plane[Plane.amountOfPlanes];
  public Flight[] flights=new Flight[Flight.amountOfFlights];
  public Client[] clients=new Client[Client.amountOfClients];
  //Constructores de la clase company:
  public  static Company setCompany(String name, String siglas, String ceoN,
   String ceoS, String date) {
     if (myCompany==null) {
        myCompany=new Company(name, siglas, ceoN, ceoS, date);
      }
    return myCompany;
  }
  public Company(){
    this.name="";
    this.siglasComp="";
    this.CEOname="";
    this.CEOsurname="";
    this.creationDate="";
  }
  public static Company getCompany() {
    return myCompany;
  }

  private Company(String name, String siglas, String ceoN,
   String ceoS, String date){
    this.name=name;
    this.siglasComp=siglas;
    this.CEOname=ceoN;
    this.CEOsurname=ceoS;
    this.creationDate=date;
  }

  //METODOS DE EMPLEADOS
  public void hireEmployee(Tripulation emp){
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
    }
  }

  public void hireEmployee(Pilot emp){
    boolean hired=false;
    if(emp instanceof Pilot){
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
    int money=0;
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
  public ArrayList<String> searchFlight(String a, String b){
    boolean any=false;
    ArrayList<String> vuelosDisponibles = new ArrayList<String>();
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
      Client c = searchClient(dni);
      c.addTicket(f, asiento);
      String[] splitted = asiento.split("\\s+");
      int fila=Integer.parseInt(splitted[0]);
      char colum=splitted[1].charAt(0);
      int columna=0;
      for(int i=0; i<6;i++){
        if(Flight.col[i]==colum){
          columna=i;
        }
      }
      bought=f.ocuppySeat(fila, columna);
          //necesito leer solo un numero hasta el espacio y despues del esacio un char
      return bought;
  }

  public  boolean removeTicket(){
    return true;
  }
  public Flight searchTicket(){
    return null;
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
      Client miCliente=null;
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
