package proyecto.classes;

abstract public class Employee {

  public static final int DNI_DEF=00000000;
  public static final String NAME_DEF="Desconocido";
  public static final String SURNAME_DEF="Sin Apellidos";
  public static final String BORNDATE_DEF="01/01/2000";
  public static final String NATIONALITY_DEF="NONE";

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
  abstract public int totalSalary();
  abstract public String toString();
}
