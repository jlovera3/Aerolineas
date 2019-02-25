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

  //METODOS DE EMPLEADOS
  public void hireEmployee(Empleado emp){
    boolean hired=false;
    if(emp instanceof Tripulation){
      for(int i=0; i<amountOfTripulation&&!hired; i++){
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
      for(int i=0; i<amountOfPilots&&!hired; i++){
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

  }

  public void listEmployee(){
    for(int i=0; i<amountOfPilots; i++){
      System.out.println(pilots[i].toString());
    }
    for(int i=0; i<amountOfTripulation; i++){
      System.out.println(crew[i].toString());
    }
  }

  public Employee searchEmployee(String named){
    boolean found=false;
    Employee sol=null;
    for(int i=0; i<amountOfTripulation&&!found; i++){
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
    for(int i=0; i<amountOfTripulation&&!found; i++){
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
    for(int i=0; i<amountOfPlanes&&!added; i++){
      if(planes[i]==null){
        planes[i]=p;
        added=true;
        System.out.println("The plane has been added");
      }
    }
    if(hired==false){
      System.out.println("The plane could not be added");
    }
  }

  void listPlane();
  boolean removePlane();
  Plane searchPlane();

  public void addFlight(Flight f){
    boolean added=false;
    for(int i=0; i<amountOfFlights&&!added; i++){
      if(flights[i]==null){
        flights[i]=f;
        added=true;
        System.out.println("The flight has been added");
      }
    }
    if(hired==false){
      System.out.println("The flight could not be added");
    }
  }
  public void listFlight(){
    //metodo que llama a toString de Flight y muestra por partalla
    //los atributos de cada vuelo de nuestro array.
    for(int i=0; i<amountOfFlights; i++){
      System.out.println(flights[i].toString());
    }
  }

  /*Metodo que recibe dos aeropuertos de origen y destino y
  muestra por pantalla los vuelos disponibles entre esos dos aeropuertos
  *Tambien tiene que mostrar los vuelos aunque sea con escalas
  */
  public Flight searchFlight(String a, String b){
    boolean any=false;
    Flight vuelosSolucion[]=new Flight[amountOfFlights];
    int j=0;
    System.out.println("Vuelos directos: ");
    for(int i=0; i<amountOfFlights;i++){//para vuelos directos
      if(flights[i].origen.nombreAero==a && flights[i].destiny.nombreAero==b){
        System.out.println(flights[i].toString());
        any=true;
        vuelosSolucion[j]=flights[i];
        j++;
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
    return vuelosSolucion;
  }

  public boolean removeFlight(){

  }

//METODOS DE TICKET
  boolean buyTicket();
  boolean removeTicket();
  Flight searchTicket();

//METODOS DE CLIENTE
  boolean addClient();
  void listClient();
  Client searchClient();
  boolean removeClient();

  getFreeSeatsFromFlight();
  getRentabilityOfFlight();
}
