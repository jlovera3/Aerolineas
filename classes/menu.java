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
				buscarVuelo();
				break;
						case 2: 
				consultaBillete();
				break;
						case 3: 
				eliminaBillete();
				break;
						case 4: 
				listaVuelos;
				break;
						case 5: 
				listaEmpleados();
				break;
						case 6: 
				listaClientes();
				break;
						case 7: 
				listaFlota();
				break;
						case 8: 
				calculaSalariosTotal();
				break;
						case 9: 
				calculaRentabilidad();
				break;
						case 0: 
				salir();
				break;
				default:
				System.out.println("Esa no es una opcion");

			}
		}while(opcion!=0);