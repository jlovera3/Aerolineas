package proyecto.classes;

public class Pilot extends Employee {
  public int salary=100000;
  public float hoursWorked;
  public String work="pilot";
  public static int amountOfPilots=0;
  public Pilot(){
    super();
    this.amountOfPilots++;
  }
  public Pilot(int dni, String name, String apellido,
  String date, String nation){
    super(dni, name, apellido, date, nation);
    this.amountOfPilots++;
  }
  public void addHours(float h){
    hoursWorked+=h;
    salary+=5000;
  }
  @Override
  public int totalSalary(){
    return this.salary;
  }
  @Override
  public String toString(){
    return "Empleado numero: "+this.employeeNumber+", Ocupacion: "+this.work+"\n"+
    " Nombre: "+this.name+" "+this.surname+"\n"+" Fecha nacimiento: "+
    this.bornDate+"\n"+" Pais: "+this.nationality+"\n";
  }
}
