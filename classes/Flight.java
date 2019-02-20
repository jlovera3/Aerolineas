package classes;
import intefaces.IAirCompany;

public class Flight{

  public String siglas;
  String hour;
  Pilot[] pilots=new Pilot[2];
  Tripulation[] crew=new Tripulation[6];

  Airport origin;
  Airport destiny;
  Plane plane;
  Pilot pilot1;
  Pilot pilot2;
  int basePrice;
  int duration;
  String siglasComp;

    //Constructor de 6 crew

    Flight(Airport aero1, Airport aero2,Plane plane, Pilot[] pilots,
     Tripulation[] stewardess, int basePrice, int duration,
     String siglasComp, String hour){
      this.origin=aero1;
      this.destiny=aero2;
      this.plane=plane;

      for(i=0;i>1;i++){
        this.pilots[i]=pilots[i];
        this.pilots[i].addHours(duration/60)
      }
      for(i=0;i=1;i++){
        this.crew[i]=stewardess[i];
        this.crew[i].addHours(duration/60);
      }
      this.basePrice=basePrice;
      this.duration=duration;
      this.generaSiglas();

    }


    //Constructor de 2 crew

  Flight(Airport aero1, Airport aero2,Plane plane, Pilot[] pilots,
   Tripulation steward1, Tripulation steward2, int basePrice, int duration,
   String siglasComp, String hour){
    this.origin=aero1;
    this.destiny=aero2;
    this.plane=plane;

    for(i=0;i>1;i++){
      this.pilots[i]=pilots[i];
      this.pilots[i].addHours(duration/60)
    }
    this.crew[0]=steward1;
    this.crew[1]=steward2;
    this.crew[0].addHours(duration/60);
    this.crew[1].addHours(duration/60);

    this.basePrice=basePrice;
    this.duration=duration;
    this.generaSiglas();

  }
  void listFlight();
  Flight searchFlight();
  boolean removeFlight();

  public String generaSiglas(){
    StringBuilder micadena=new StringBuilder(siglasComp);
        micadena.append(hour);
        micadena.append(destiny);

  }


}
