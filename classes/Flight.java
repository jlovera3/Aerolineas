package classes;
import intefaces.IAirCompany;

public class Flight{

  public String siglas;
  int hour;
  Airport origin;
  Airport destiny;
  Plane planeUsed;
  Pilot pilot1;
  Pilot pilot2;

  // Array de azafatas
  Tripulation [] stewardess=new Tripulation [6];
  int numberPlaces;
  



  boolean addFlight(int h){

  }
  void listFlight();
  Flight searchFlight();
  boolean removeFlight();

  public generaSiglas(){

  }
}
