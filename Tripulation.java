package proyecto.classes;

public class Tripulation extends Employee{
  public int salary=40000;
  public int hoursWorked;
  public String work="steward";

  public Tripulation(){
    super();
  }
  public Tripulation(int dni, String name, String apellido,
  String date, String nation, int sala){
    super(dni, name, apellido, date, nation);
  }

}
