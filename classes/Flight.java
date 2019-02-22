package proyecto.classes;


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
  public char[][] seats;
  public char[][] VIPseats;

    //Constructor de 6 crew

    Flight(Airport aero1, Airport aero2,Plane plane, Pilot[] pilots,
     Tripulation[] stewardess, int basePrice, int duration,
     String siglasComp, String hour){
      this.origin=aero1;
      this.destiny=aero2;
      this.plane=plane;
        if(plane instanceof Boing){
          this.VIPseats[this.Boing.NUMEROFILASVIP][this.Boing.NUMEROCOLUMNAS];
          this.seats[this.Boing.NUMERODEFILAS][this.Boing.NUMEROCOLUMNAS];
        }else{
          this.VIPseats[this.Airbus.NUMEROFILASVIP][this.Airbus.NUMEROCOLUMNAS];
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

    }


    //Constructor de 2 crew

  Flight(Airport aero1, Airport aero2,Plane plane, Pilot[] pilots,
   Tripulation steward1, Tripulation steward2, int basePrice, int duration,
   String siglasComp, String hour){
    this.origin=aero1;
    this.destiny=aero2;
    this.plane=plane;
    if(plane instanceof Boing){
      this.VIPseats[this.Boing.NUMEROFILASVIP][this.Boing.NUMEROCOLUMNAS];
      this.seats[this.Boing.NUMERODEFILAS][this.Boing.NUMEROCOLUMNAS];
    }else{
      this.VIPseats[this.Airbus.NUMEROFILASVIP][this.Airbus.NUMEROCOLUMNAS];
      this.seats[this.Airbus.NUMERODEFILAS][this.Airbus.NUMEROCOLUMNAS];
    }else{
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

  }

  public void iniciaSeats(){
    if(plane.PlaneType="boing"){
      for(i=0;i<this.Boing.NUMEROFILASVIP;i++){
        for(j=0;j<this.Boing.NUMEROCOLUMNAS;j++){
              VIPseats[i][j]="o";
            }
        }
      for(i=0;i<this.Boing.NUMERODEFILAS;i++){
          for(j=0;j<this.Boing.NUMEROCOLUMNAS;j++){
                seats[i][j]="o";
              }
      }

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
