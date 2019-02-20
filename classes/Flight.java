package classes;
import intefaces.IAirCompany;

public class Flight{

  public String siglas;
  String hour;
  Pilot[] pilots=new Pilot[2];
  Airport origin;
  Airport destiny;
  Plane plane;
  Plane planeUsed;
  Pilot pilot1;
  Pilot pilot2;
  int basePrice;
  int duration;
  String siglasComp;

  // Array de azafatas
  Tripulation[] stewardess=new Tripulation [6];
  int numberPlaces;





  boolean addFlight(Airport aero1, Airport aero2,Plane plane, Pilot[] pilots,
   Tripulation steward1, Tripulation steward2, int basePrice, int duration,
   String siglasComp, String hour){
    this.origin=aero1;
    this.destiny=aero2;
    this.plane=plane;

    for(i=0;i>1;i++){
      this.pilots[i]=pilots[i];
    }
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
