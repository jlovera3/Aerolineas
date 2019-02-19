package proyecto.classes;

public class Employee {

  public static final DNI_DEF=00000000;
  public static final NAME_DEF="Desconocido";
  public static final SURNAME_DEF="Sin Apellidos";
  public static final BORNDATE_DEF="01/01/2000";
  public static final NATIONALITY_DEF="NONE";

  public static int amountOfEmployees=0;
  public int DNI;
  public int employeeNumber;
  public String name;
  public String surname;
  public String bornDate;
  public String nationality;
  public String[] languages={"Spanish","English"};

  public Employee(int dni, String name, String apellido,
  String date, String nation){
    this.DNI=dni;
    this.name=name;
    this.surname=apellido;
    this.bornDate=date;
    this.nationality=nation;
    amountOfEmployees++;
    this.employeeNumber=amountOfEmployees;
  }

  public Employee(){
    this.DNI=DNI_DEF;
    this.name=NAME_DEF;
    this.surname=SURNAME_DEF;
    this.bornDate=BORNDATE_DEF;
    this.nationality=NATIONALITY_DEF;
    amountOfEmployees++;
    this.employeeNumber=amountOfEmployees;
  }

  public boolean hireEmployee(Employee emp){

  }
  boolean fireEmployee();
  public void listEmployee(){

  }
  Employee searchEmployee();
  int totalSalary();
  @override
  public String toString(){
    return "Empleado numero: "+this.employeeNumber+"\n"+" Nombre: "+this.name+" "+
    this.surname+"\n"+" Fecha nacimiento: "+this.bornDate+"\n"+" Pais: "+this.nationality;
  }
}
