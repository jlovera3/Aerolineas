package classes;


public class Flight{

  public String siglas;
  public String hour;
  public Pilot[] pilots=new Pilot[2];
  public Tripulation[] crew=new Tripulation[6];

  public Airport origin;
  public Airport destiny;
  public Plane plane;
  public int basePrice;
  public int duration;
  public String siglasComp;
  public char[][] seats;
  public char[] col={'A','B','C','D','F','G'};
  private List<String> freeSeats = new ArrayList<String>();

  public static int amountOfFlights=0;

    //Constructor de 6 crew

    Flight(Airport aero1, Airport aero2,Plane plane, Pilot[] pilots,
     Tripulation[] stewardess, int basePrice, int duration,
     String siglasComp, String hour){
      this.origin=aero1;
      this.destiny=aero2;
      this.plane=plane;
        if(plane instanceof Boing){
          this.seats[this.Boing.NUMERODEFILAS][this.Boing.NUMEROCOLUMNAS];
        }else{
          this.seats[this.Airbus.NUMERODEFILAS][this.Airbus.NUMEROCOLUMNAS];
        }
      for(i=0;i<2;i++){
        this.pilots[i]=pilots[i];
        this.pilots[i].addHours(duration/60);
      }
      for(i=0;i<2;i++){
        this.crew[i]=stewardess[i];
        this.crew[i].addHours(duration/60);
      }
      this.basePrice=basePrice;
      this.duration=duration;
      this.generaSiglas();
      this.iniciaSeats();
      amountOfFlights++;

    }


    //Constructor de 2 crew

  Flight(Airport aero1, Airport aero2,Plane plane, Pilot[] pilots,
   Tripulation steward1, Tripulation steward2, int basePrice, int duration,
   String siglasComp, String hour){
    this.origin=aero1;
    this.destiny=aero2;
    this.plane=plane;
    //Una vez recibido el tipo de avión, se le asigna un tamaño al array seat
        if(plane instanceof Boing){
          this.seats[this.Boing.NUMERODEFILAS][this.Boing.NUMEROCOLUMNAS];
        }else{
          this.seats[this.Airbus.NUMERODEFILAS][this.Airbus.NUMEROCOLUMNAS];
          }

    for(i=0;i>1;i++){
      this.pilots[i]=pilots[i];
      this.pilots[i].addHours(duration/60);
    }
    this.crew[0]=steward1;
    this.crew[1]=steward2;
    this.crew[0].addHours(duration/60);
    this.crew[1].addHours(duration/60);

    this.basePrice=basePrice;
    this.duration=duration;
    this.generaSiglas();
    this.iniciaSeats();
    amountOfFlights++;
  }
  /** Inicia todas las plazas, situando una "o" en todos los asientos
	*/
    public void iniciaSeats(){
      if(plane.PlaneType="Boing"){
        for(i=0;i<this.Boing.NUMERODEFILAS;i++){
            for(j=0;j<this.Boing.NUMEROCOLUMNAS;j++){
                  seats[i][j]="o";
                }
        }
    }

    if(plane.PlaneType="Airbus"){
      for(i=0;i<this.Airbus.NUMERODEFILAS;i++){
          for(j=0;j<this.Airbus.NUMEROCOLUMNAS;j++){
                seats[i][j]="o";
              }
      }
    }

}
/**
*	Este método se encarga de situar una "x" en los asientos que han sido
* ocupados.
*	@param numeroFila: Entero que identifica el numero total de filas
* @param numeroColumna: Entero que identifica el numero total de columnas
* @return Devuelve el numero de asientos ocupados
*/
public boolean ocuppySeat(int numeroFila, int numeroColumna){
  boolean added=true;
  seats[numeroFila][numeroColumna]="x";
  /* Hay que incrementar el precio de la entrada si es VIP
     pero desconozco si lo vamos a hacer desde aquí o desde
     otra clase
  */
  return added;
    }

    /**
    *	Este método se encarga de situar una "o" en los asientos que estan libres
    * y de imprimir por pantalla al asiento libre.
    *	@param numeroFila: Entero que identifica el numero total de filas
    * @param numeroColumna: Entero que identifica el numero total de columnas
    * @return Devuelve un String con el identificador del asiento libre
    */
    public ArrayList getFreeSeats(){
          int cont=0;
          if(Plane.PlaneType="Boing"){
            for(i=0;i<this.Boing.NUMERODEFILAS;i++){
              for(j=0;j<this.Boing.NUMEROCOLUMNAS;i++){
                if(seat[i][j]=="o"){
                  freeSeats(cont) = i+col[j];
                  cont++;
                }
              }
            }
          }

          if(Plane.PlaneType="Airbus"){
            for(i=0;i<this.Airbus.NUMERODEFILAS;i++){
              for(j=0;j<this.Airbus.NUMEROCOLUMNAS;i++){
                if(seat[i][j]=="o"){
                  freeSeats(cont) = i+col[j];
                  cont++;

                }
              }
            }
          }

      return freeSeats;
    }

        public void printSeats(){
          int cont=0;
          if(Plane.PlaneType="Boing"){
            System.out.println("  A B C D E F"+"\n");
            for(i=0;i<this.Boing.NUMERODEFILAS;i++){
              System.out.println(i+1);
              for(j=0;j<this.Boing.NUMEROCOLUMNAS;i++){
                System.out.println(seat[i][j]);
                }
              System.out.println("\n");
              }
            }
          }

          if(Plane.PlaneType="Airbus"){
            System.out.println("  A B C D E F");
            for(i=0;i<this.Airbus.NUMERODEFILAS;i++){
                System.out.println(i+1);
              for(j=0;j<this.Airbus.NUMEROCOLUMNAS;i++){
                System.out.printl(seat[i][j]);
                }
              }
            }
          }

      return cont;
    }

  public String generaSiglas(){
    StringBuilder micadena=new StringBuilder(siglasComp);
        micadena.append(hour);
        micadena.append(destiny);

  }

  //precioBase se tiene que modificar porque aun no hemos creado ticket
  @Override
  public String toString{
  return "Identificador: "+this.generaSiglas()+"\n"+"Origen: "+this.origin+"\n"
  +"Destino: "+this.destiny+"\n"+"Avion: "+this.plane.matricula+"\n"+"Precio"+
  this.precioBase+"\n"+"Duracion: "+this.duration
  }

}
