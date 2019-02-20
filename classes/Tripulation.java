package proyecto.classes;

public class Tripulation extends Employee{
  public int salary=40000;
  public float hoursWorked;
  public String work="steward";

  public Tripulation(){
    super();
  }
  public Tripulation(int dni, String name, String apellido,
  String date, String nation, int sala){
    super(dni, name, apellido, date, nation);
  }
  public void addHours(float h){
    hoursWorked+=h;
    salary+=1000;
  }
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
