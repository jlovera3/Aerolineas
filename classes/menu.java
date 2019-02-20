		Scanner teclado=new Scanner(System.in);
		int opcion;

do{
System.out.print("1 Buscar vuelo ");
System.out.print("2 Consultar	Billete ");
System.out.print("3 Eliminar	Billete ");
System.out.print("4 Listar	Vuelos ");
System.out.print("5 Listar	Empleados ");
System.out.print("6 Listar	Clientes ");
System.out.print("7	Listar	Flota ");
System.out.print("8 Calcular	Salarios	total	 ");
System.out.print("9 Calcular	la	rentabilidad	de	un	vuelo ");
System.out.print("0 Salir ");
opcion=teclado.nextInt();
switch (teclado) {
						case 1: 
				suma();
				break;
						case 2: 
				suma();
				break;
						case 3: 
				suma();
				break;
						case 4: 
				System.out.println("Ha elegido dividir");
				suma();
				break;
						case 5: 
				suma();
				break;
						case 6: 
				suma();
				break;
						case 7: 
				suma();
				break;
						case 8: 
				suma();
				break;
						case 9: 
				suma();
				break;
						case 0: 
				suma();
				break;
				default:
				System.out.println("Incorrecto");

			}
		}while(opcion!=0);