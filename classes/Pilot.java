package proyecto.classes;

public class Pilot extends Employee{
  public int salary=100000;
  public float hoursWorked;
  public String work="pilot";

  public Pilot(){
    super();
  }
  public Pilot(int dni, String name, String apellido,
  String date, String nation){
    super(dni, name, apellido, date, nation);
  }
  public void addHours(float h){
    hoursWorked+=h;
    salary+=5000;
  }
}
