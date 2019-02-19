package interfaces;

public interface IAirCompany{
  boolean hireEmployee();
  boolean fireEmployee();
  void listEmployee();
  Employee searchEmployee();
  int totalSalary();

  boolean addPlane();
  void listPlane();
  boolean removePlane();
  Plane searchPlane();

  boolean addFlight();
  void listFlight();
  Flight searchFlight();
  boolean removeFlight();

  boolean buyTicket();
  boolean removeTicket();
  Flight searchTicket();

  boolean addClient();
  void listClient();
  Client searchClient();
  boolean removeClient();

  getFreeSeatsFromFlight();
  getRentabilityOfFlight();
}
