package classes;

public class Tripulation extends Employee{

  public int salary=40000;
  public float hoursWorked;
  public String work="steward";

  public static int amountOfTripulation=0;

  public Tripulation(){
    super();
    this.amountOfTripulation++;
  }
  public Tripulation(int dni, String name, String apellido,
  String date, String nation, int sala){
    super(dni, name, apellido, date, nation);
    this.amountOfTripulation++;
  }
  public void addHours(float h){
    hoursWorked+=h;
    salary+=1000;
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
