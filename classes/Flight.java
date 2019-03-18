package classes;
import java.lang.StringBuilder;
import java.util.ArrayList;
import  java.lang.Math;
import  java.util.Random;

public class Flight{

  public String hour;
  public Pilot[] pilots=new Pilot[2];
  public Tripulation[] crew=new Tripulation[6];

  public Airport origin;
  public Airport destiny;
  public Plane plane;
  public int basePrice;
  public int duration;
  public char[][] seats;
  public static final char[] col={'A','B','C','D','F','G'};
  public ArrayList<String> freeSeats = new ArrayList<String>();
  public int length;
  public int length1;

  public static int amountOfFlights=0;
  public int idVuelo;

    //Constructor de 6 crew

    public Flight(Airport aero1, Airport aero2, Plane plane, Pilot[] pilots,
     Tripulation[] stewardess, int basePrice, int duration,
      String hour){
      this.origin=aero1;
      this.destiny=aero2;
      this.plane=plane;
        if(plane.PlaneType=="Boing"){
          this.seats=new char [Boing.B_NUMEROFILAS][Boing.B_NUMEROCOLUMNAS];
          for(int i=0;i<6;i++){
            int num=generateRandomInt(Tripulation.amountOfTripulation);
            this.crew[i]=stewardess[num];
            this.crew[i].addHours(duration/60);
          }
        }else{
          this.seats=new char [Airbus.A_NUMERODEFILAS][Airbus.A_NUMERODECOLUMNAS];
          for(int i=0;i<2;i++){
            int num=generateRandomInt(Tripulation.amountOfTripulation);
            this.crew[i]=stewardess[num];
            this.crew[i].addHours(duration/60);
          }
        }

      for(int i=0;i<2;i++){
        this.pilots[i]=pilots[i];
        this.pilots[i].addHours(duration/60);
      }
      this.basePrice=basePrice;
      this.duration=duration;
      this.iniciaSeats();
      amountOfFlights++;
      this.idVuelo=amountOfFlights;
      System.out.println("Vuelo iniciado"+this.amountOfFlights);
    }

    public static int generateRandomInt(int upperRange){
        Random random = new Random();
        return random.nextInt(upperRange);
    }
  /** Inicia todas las plazas, situando una "o" en todos los asientos
	*/
    public void iniciaSeats(){
      if(this.plane.PlaneType=="Boing"){
        for(int i=0;i<Boing.B_NUMEROFILAS;i++){
            for(int j=0;j<Boing.B_NUMEROCOLUMNAS;j++){
                  seats[i][j]='o';
                }
        }
    }

    if(this.plane.PlaneType=="Airbus"){
      for(int i=0;i<Airbus.A_NUMERODEFILAS;i++){
          for(int j=0;j<Airbus.A_NUMERODECOLUMNAS;j++){
                seats[i][j]='o';
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
  boolean added=false;
  if(seats[numeroFila-1][numeroColumna]=='o'){
    seats[numeroFila-1][numeroColumna]='x';
    added=true;
  }
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
    public ArrayList<String> getFreeSeats(){
          int cont=0;
          if(this.plane.PlaneType=="Boing"){
            for(int i=0;i<Boing.B_NUMEROFILAS;i++){
              for(int j=0;j<Boing.B_NUMEROCOLUMNAS;i++){
                if(seats[i][j]=='o'){
                  if(i<Boing.B_NUMEROFILASVIP){
                  freeSeats.add(i+1+" "+col[j]+" "+" | VIP | "+this.basePrice*1.2);
                  cont++;
                }else{
                    freeSeats.add(i+1+" "+col[j]+" "+" | No VIP | "+this.basePrice);
                    cont++;
                  }
                }
              }
            }
          }

          if(this.plane.PlaneType=="Airbus"){
            for(int i=0;i<Airbus.A_NUMERODEFILAS;i++){
              for(int j=0;j<Airbus.A_NUMERODECOLUMNAS;j++){
                if(seats[i][j]=='o'){
                  if(i<Airbus.A_NUMEROFILASVIP){
                  freeSeats.add(i+1+" "+col[j]+" "+" | VIP | "+this.basePrice*1.2);
                  cont++;
                }else{
                    freeSeats.add(i+1+" "+col[j]+" "+" | No VIP | "+this.basePrice);
                    cont++;
                  }

                }
              }
            }
          }

      return freeSeats;
    }

        public void printSeats(){
          if(this.plane.PlaneType=="Boing"){
            System.out.println("  A B C D E F"+"\n");
            for(int i=0;i<Boing.B_NUMEROFILAS-1;i++){
              System.out.println("Imprimiendo 1 Boing - "+i);
              for(int j=0;j<Boing.B_NUMEROCOLUMNAS-1;i++){
                System.out.println("Imprimiendo 2 Boing - "+j);
                System.out.print(seats[i][j]);
                }
              System.out.println("\n");
              }
            }
          if(this.plane.PlaneType=="Airbus"){
            System.out.println("  A B C D E F");
            for(int i=0;i<Airbus.A_NUMERODEFILAS;i++){
              System.out.println("Imprimiendo 1 Airbus - "+i);
              for(int j=0;j<Airbus.A_NUMERODECOLUMNAS;j++){
                System.out.println("Imprimiendo 2 Airbus - "+j);
                System.out.println(seats[i][j]);
                }
              }
            }
    }
/*
  public String generaSiglas(){
    StringBuilder micadena=new StringBuilder();
        micadena.append(hour);
        micadena.append(destiny);
    return micadena.toString();
  }
*/
  //precioBase se tiene que modificar porque aun no hemos creado ticket
  @Override
  public String toString(){
  return "\n"+"--------------------------"+"\n"+"Id: "+this.idVuelo+"\n"+"Origen: "+this.origin.nombreAero+"\n"
  +"Destino: "+this.destiny.nombreAero+"\n"+"Avion: "+this.plane.matricula+"\n"+"Precio"+
  this.basePrice+"\n"+"Duracion: "+this.duration;
  }

  public boolean equals(int num){
    boolean igual=false;
    if(num==this.idVuelo){
      igual=true;
    }
    return igual;
  }

}
