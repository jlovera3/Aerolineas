package proyecto.classes;

public class Pilot extends Employee{
  public int salary=100000;
  public int hoursWorked;
  public String work="pilot";

  public Pilot(){
    super();
  }
  public Pilot(int dni, String name, String apellido,
  String date, String nation){
    super(dni, name, apellido, date, nation);
  }

}
