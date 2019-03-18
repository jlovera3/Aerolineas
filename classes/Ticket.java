package classes;

public class Ticket{
  public Flight f;
  public String seat;

  //Constantes
  public static final Flight FLIGHT_DEF=null;
  public static final String SEAT_DEF="Asiento sin asignar";

  public static int amountOfTickets=0;
  /**
  *	Constructor que no recibe nada y se encarga de asignar un vuelo y asiento
  * por defecto
  */
  public Ticket(){
    this.f= FLIGHT_DEF;
    this.seat= SEAT_DEF;
    amountOfTickets++;
  }
  /**
  *	Constructor que recibe el vuelo y asiento.
  */
  public Ticket(Flight f, String seat){
    this.f= f;
    this.seat= seat;
    amountOfTickets++;
  }

  @Override
  public String toString(){
    return "Ha elegido el vuelo: "+this.f.toString()+"\n"+" Dispone del asiento: "+this.seat;
  }
}
