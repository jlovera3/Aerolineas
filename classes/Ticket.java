package classes;

public class Ticket{
  public Flight f;
  public String seat;

  //Constantes
  public static final Flight FLIGHT_DEF=null;
  public static final String SEAT_DEF="Asiento sin asignar";

  /**
  *	Constructor que no recibe nada y se encarga de asignar un vuelo y asiento
  * por defecto
  */
  public Ticket(){
    this.f= FLIGHT_DEF;
    this.seat= SEAT_DEF;
  }
  /**
  *	Constructor que recibe el vuelo y asiento.
  *	@param fligth: String que identifica el vuelo indicado
  * @param seat: String que identifica el asiento deseado
  */
  public Ticket(Flight f, String seat){
    this.f= f;
    this.seat= seat;
  }

  @Override
  public String toString(){
    return "Ha elegido el vuelo: "+this.flight+"\n Dispone del asiento: "+this.seat;
  }
}
