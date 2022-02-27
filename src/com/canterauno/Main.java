package com.canterauno;

import java.util.InputMismatchException;
import java.util.Scanner;

import Punto_Cinco.Drogueria;
import Punto_Cuatro.Tienda;
import Punto_Diez.Banco;
import Punto_Diez.Cliente;
import Punto_Dos.Punto_Dos;
import Punto_Ocho.Panaderia;
import Punto_Ocho.Pasteles;
import Punto_Seis.Autos;
import Punto_Seis.Taller;
import Punto_Siete.Calculos;
import Punto_Tres.Punto_Tres;
import Punto_Uno.Punto_Uno;

public class Main {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opc;
		
		while (!salir) {
			System.out.println("=========================");
			System.out.println(" TALLER DE CONDICIONALES");
			System.out.println("=========================");
			System.out.println("1--EDAD PERSONA (adulto)");
			System.out.println("2--EDAD PERSONA (niños)");
			System.out.println("3--MENSAJE SEGUN EDAD");
			System.out.println("4--VIDEO TIENDA");
			System.out.println("5--DROGERIA");
			System.out.println("6--TALLER DE MOTOS");
			System.out.println("7--CALCULAR IMC");
			System.out.println("8--PASTELERIA");
			System.out.println("9--CULCULO DE AREA");
			System.out.println("10--BANCO");
			System.out.println("11--SALIR");
			
			try {
				System.out.println("ESCOJA LA OPCION A EJECUTAR");
				opc = sn.nextInt();
				
				switch (opc) {
				case 1: 
					Punto_Uno ejercicioUno = new Punto_Uno();
					ejercicioUno.Uno();
					break;
				
				case 2:
					Punto_Dos ejercicioDos = new Punto_Dos();
					ejercicioDos.dos();
					break;
					
				case 3:
					Punto_Tres ejercicioTres = new Punto_Tres();
					ejercicioTres.tres();
					break;
					
				case 4:
					Scanner snn = new Scanner(System.in);
					boolean salirTaller = false;
					int opcion;
					String nombre;
					String comentario=null;
					Tienda videotienda = new Tienda (3);
					while (!salirTaller) {
						
						System.out.println("1. Consultar peliculas");
						System.out.println("2. Alquilar pelicula");
						System.out.println("3. Recibir pelicula");
						System.out.println("4. SALIR");

						
						try {
							System.out.println("Escoje la opcion");
							opcion = snn.nextInt();
							
							switch (opcion) {
							case 1:
								videotienda.listar();
								break;
							
							case 2:
								System.out.println("Ingrese el nombre de la pelicula a alquilar");
								nombre = snn.next();
								videotienda.bucar(nombre);
								break;
								
							case 3:
								System.out.println("Ingrese el nombre de la pelicula a entregar");
								nombre = snn.next();
								videotienda.entregar(nombre,comentario);
								
								break;
								
							case 4:
								System.out.println("Salida exitosa");
								salirTaller=true;
								break;
												
							default:
								System.out.println("solo numeros entre 1 y 6");
							}
							
						} catch (InputMismatchException e) {
							System.out.println("debes insertar un numero");
							sn.next();
						}
					}				
					break;
					
					
				case 5:
					Scanner sn5 = new Scanner(System.in);
					boolean salir5 = false;
					int opc5;
					String nombre5;
					double cantidad;
					Drogueria farmacia = new Drogueria(3);
					while (!salir5) {
						
						System.out.println("1. Consultar inventario");
						System.out.println("2. Comprar Producto");
						System.out.println("3. Consultar Precio");
						System.out.println("4. Devolver producto");
						System.out.println("5. SALIR");

						
						try {
							System.out.println("Escoje la opcion");
							opc5 = sn5.nextInt();
							
							switch (opc5) {
							case 1:
								System.out.println("Los productos disponibles son");
								farmacia.Mostrar();
								break;
							
							case 2:
								System.out.println("Ingrese el medicamento a comprar");
								nombre5=sn5.next();
								System.out.println("Ingrese la cantidad del medicamento a comprar");
								cantidad=sn5.nextDouble();
								farmacia.Buscar(nombre5,cantidad);
								break;
								
							case 3:
								System.out.println("Ingrese el medicamento a comprar");
								nombre5=sn5.next();
								farmacia.BuscarPrecio(nombre5);
								break;
							case 4:
								System.out.println("Ingrese el medicamento a devolver");
								nombre5=sn5.next();
								
								break;					
							case 5:
								System.out.println("Salida exitosa");
								salir5=true;
								break;
												
							default:
								System.out.println("solo numeros entre 1 y 6");
							}
							
						} catch (InputMismatchException e) {
							System.out.println("debes insertar un numero");
							sn5.next();
						}
						
					}


					break;
					
				case 6:
					Scanner sn6 = new Scanner(System.in);
					Taller autos =new Taller();
					boolean salir6=false;
					int opc6;
					
					do {
						System.out.println("==========================");
						System.out.println("BIENVENIDO AL TALLER EL MAQUNISTA");
						System.out.println("1. INGRESA VEHICULO");
						System.out.println("2. LISTAR VEHICULOS QUE ESTAN EN EL TALLER");
						System.out.println("3. RETIRAR VEHICULO");
						System.out.println("4. ARREGLOS");
						System.out.println("5. SALIR");
						opc6=sn6.nextInt();
						
						switch (opc6) {
						case 1:
							Autos auxa;
							String placa;
							String ingreso;
							String observaciones;
							System.out.println("==============================");
							System.out.println(" INGRESO DE VEHICULO AL TALLER");
							System.out.println("==============================");
							System.out.println("ingrese la placa del vehiculo");
							placa = sn6.next();
							System.out.println("feccha de ingreso DD/MM/AA");
							ingreso= sn6.next();
							System.out.println("Ingrese las daños del vehiculo");
							observaciones = sn6.next();
							auxa = new Autos(placa, ingreso, observaciones,"EN REPARACION","EN RAPARACION");
							autos.agregar(auxa);
							sn6.nextLine();
							break;
							
						case 2:
							if(autos.validacion()) {
								
							}else {
								System.out.println("=====================================");
								System.out.println(" LOS VEHICULOS QUE ESTAN EN EL TALLER");
								System.out.println("=====================================");
								System.out.println("PLACA  |   FECHA  |  OBSERVACIONES");
								autos.mostrar();
							}
							break;
							
						case 3:
							String p;
							if(autos.validacion()) {
							
							}else {
								System.out.println("=====================================");
								System.out.println("             RETIRAR VEHICULO"        );
								System.out.println("=====================================");
								System.out.println("INGRESE LA PLACA DEL VEICULO A RETIRAR");
								p=sn6.next();
								autos.retirar(p);
							}
							break;
							
						case 4:
							if (autos.validacion()) {
								
							} else {
								System.out.println("=====================================");
								System.out.println("LOS REPUESTOS QUE SE HAN VENDIDO SON" );
								System.out.println("=====================================");
								autos.repuestos();
							}							
							break;
							
						case 5:
							System.out.println("SALIDA EXITOSA");
							salir6=true;
							break;
						default:
							System.out.println("solo numeros entre 1 y 4");
						}
						
					} while (!salir6);
				
					break;
					
				case 7:
					Calculos Imc = new Calculos();
					Imc.menu();
					break;
					
				case 8:
					Panaderia pan = new Panaderia();
					Scanner sn8 = new Scanner(System.in);
					boolean salir8=false;
					int opc8;
					Pasteles aux8;
					do {
						
						System.out.println("==========================");
						System.out.println("BIENVENIDO A LA REPOSTERIA");
						System.out.println("==========================");
						System.out.println("1. AGREGAR NUEVO SABOR AL INVENTARIO");
						System.out.println("2. AGREGAR CANTIDAD A SABOR EXISTENTE");
						System.out.println("3. LISTAR PASTELES");
						System.out.println("4. REALIZAR PEDIDO");
						System.out.println("5. MOSTRAR VENTAS");
						System.out.println("6. SALIR");
						System.out.println("ESCOJA LA OPCION A REALIZAR");
						opc8=sn8.nextInt();
						
						switch (opc8) {
						case 1:
							String decoracion;
							String sabor;
							int porciones;
							Double valor;
							System.out.println("=====================================");
							System.out.println("INGRESA UN NUEVO PASTEL AL INVENTARIO");
							System.out.println("=====================================");
							System.out.println("Ingresa el sabor");
							sabor=sn8.next();
							System.out.println("Ingresa las porciones");
							porciones = sn.nextInt();
							System.out.println("Ingrese la decoracion");
							decoracion = sn.next();
							aux8 = new Pasteles(sabor, decoracion, porciones);
							pan.agregar(aux8);
							
							break;
							
						case 2:
							if(pan.validacion()) {
								
							}else {
								String sabore;
								System.out.println("=====================================");
								System.out.println("INGRESA UN NUEVO PASTEL AL INVENTARIO");
								System.out.println("=====================================");
								System.out.println("Ingresa el sabor");
								sabore=sn8.next();
								pan.buscar(sabore);
							
							}
							break;
							
						case 3:
							if(pan.validacion()) {
							
							}else {
								pan.mostrar();		
							}
							
							break;
							
						case 4:
							if (pan.validacion()) {
								
							} else {
								boolean exit=true;
								int opci ;
								String saborb;
								int llevar;
								do {
									System.out.println("==========================");
									System.out.println("REALIZANDO COMPRA");
									System.out.println("==========================");
									System.out.println("1. AGREGAR PRODUCTO A TU COMPRA");
									System.out.println("2. SALIR");
									opc=sn.nextInt();
									switch (opc) {
									case 1:
										System.out.println("=====================================");
										System.out.println("IGRESA EL SABOR DEL PRODUCTO A LLEVAR");
										saborb=sn.next();
										System.out.println("IGRESA LA CANTIDAD A LLEVAR");
										llevar=sn.nextInt();
										pan.BuscarC(saborb, llevar);
										break;
									case 2:
										System.out.println("SALIDA EXITOSA");
										exit=false;
										break;
									default:
										System.out.println("SOLO SE PERMITEN NUMEROS ENTRE 1 Y 2");
									}
									
								} while (!exit);
								
							}							
							break;
							
						case 5 :
							if (pan.validacion()) {
								
							} else {
								pan.mostrarventas();
							}	
							break;	
							
						case 6:
							System.out.println("SALIDA EXITOSA");
							salir8=true;
							break;	
						default:
							System.out.println("solo numeros entre 1 y 6");
						}
						
					} while (!salir8);
					break;
					
				case 9:
					Punto_Nueve.Calculos nueve = new Punto_Nueve.Calculos();
					boolean salir9=false;
					int opc9;
					
					do {
						Scanner sc9 = new Scanner(System.in);
						System.out.println("========================================================");
						System.out.println("Selecciona la figura del la cual deseas calcular el area");
						System.out.println("========================================================");
						System.out.println("1. RECTANGULO");
						System.out.println("2. TRIANGULO");
						System.out.println("3. TRAPECIO");
						System.out.println("4. SALIR");
						
						opc9=sc9.nextInt();
						
						switch (opc9) {
						case 1:
							int ba;
							int alt;
							System.out.println("===================================");
							System.out.println("CALCULAREMOS EL AREA DEL RECTANGULO");
							System.out.println("ESCRIBE LA BASE (cm)");
							ba = sn.nextInt();
							
							System.out.println("ESCRIBE LA ALTURA (cm)");
							alt= sn.nextInt();
							nueve.rectangulo(ba, alt);
							break;
							
						case 2:
							int baT;
							int altT;
							System.out.println("===================================");
							System.out.println("CALCULAREMOS EL AREA DEL TRIANGULO");
							System.out.println("ESCRIBE LA BASE (cm)");
							baT = sn.nextInt();
							
							System.out.println("ESCRIBE LA ALTURA (cm)");
							altT= sn.nextInt();
							nueve.triangulo(baT, altT);
							break;
							
						case 3:
							int base_a;
							int base_b;
							int altura;
							System.out.println("===================================");
							System.out.println("CALCULAREMOS EL AREA DEL TRAPECIO");
							System.out.println("ESCRIBE LA BASE MAYOR EN (cm)");
							base_a = sn.nextInt();
							System.out.println("ESCRIBE LA BASE MENOR EN (cm)");
							base_b = sn.nextInt();
							System.out.println("ESCRIBE LA ALTURA (cm)");
							altura= sn.nextInt();
							nueve.trapecio(base_a, base_b, altura);
							break;
							
						case 4:
							System.out.println("SALIDA EXITOSA");
							salir9=true;
							break;	
							
						default:
							System.out.println("solo numeros entre 1 y 4");
						}
						
					} while (!salir9);
					break;
					
				case 10:
					Scanner sn10 = new Scanner(System.in);
					Banco banco =new Banco();
					boolean salir10=false;
					int opc10;
					
					do {
						Scanner sc10 = new Scanner(System.in);
						System.out.println("==========================");
						System.out.println("BIENVENIDO A SU BANCO FIEL");
						System.out.println("1. INGRESAR NUEVO CLIENTE");
						System.out.println("2. VER CLIENTES DEL BANCO");
						System.out.println("3. INGRESAR VALOR");
						System.out.println("4. RETIRAR");
						System.out.println("5. CONSULTAR SALDO");
						System.out.println("6. SALIR");
						System.out.println("ESCOJA LA OPCION A REALIZAR");
						opc10=sc10.nextInt();
						
						switch (opc10) {
						case 1:
							Cliente aux;
							String nombrecliente;
							int cedula;
							Double valor;
							System.out.println("==============================");
							System.out.println("REGISTRA UN NUEVO CLIENTE");
							System.out.println("==============================");
							System.out.println("Ingresa el nombre del cliente");
							nombrecliente = sn10.next();
							System.out.println("Ingresa la cedula del cliente");
							cedula = sn.nextInt();
							System.out.println("Ingrese el valor con el que apertura la cuenta");
							valor = sn.nextDouble();
							aux = new Cliente(nombrecliente, cedula, valor);
							banco.ingresarcliente(aux);

							break;
							
						case 2:
							banco.mostrar();
							break;
							
						case 3:
							if(banco.validacion()) {
							
							}else {
								Integer cedulaC;
								Double valorC;
								System.out.println("==============================");
								System.out.println("CONSIGNAR VALOR A LA CUENTA");
								System.out.println("==============================");
								System.out.println("Cedula del cliente a consignarle");
								cedulaC = sn10.nextInt();
								System.out.println("Ingrese el Valor a consignar");
								valorC = sn.nextDouble();
								if (valorC < 0) {
									System.out.println("CONSIGNACION FALLIDA VALOR DEBE SER MAYOR A 1 PESO");
								}else {
									System.out.println("CONSIGNACION EXITOSA");
									banco.ingresar(cedulaC, valorC);
								}
							}
							
							break;
							
						case 4:
							if (banco.validacion()) {
								
							} else {
								Integer cedulaR;
								Double valorR;
								System.out.println("==============================");
								System.out.println("     RETIRAR DE LA CUENTA");
								System.out.println("==============================");
								System.out.println("Cedula del cliente a retirar");
								cedulaR = sn10.nextInt();
								System.out.println("Ingrese el Valor a retirar");
								valorR = sn.nextDouble();
								banco.retirar(cedulaR, valorR);
							}							
							break;
							
						case 5:
							if (banco.validacion()) {
								
							} else {
								int cons;
								Double valorR;
								System.out.println("==============================");
								System.out.println("      CONSULTAR SALDO ");
								System.out.println("==============================");
								System.out.println("Cedula del cliente a consultar");
								cons = sn10.nextInt();
								banco.consultarsaldo(cons);
							}		
							break;
							
						case 6:
							System.out.println("SALIDA EXITOSA");
							salir10=true;
							break;
						
						default:
							System.out.println("solo numeros entre 1 y 6");
						}
						
					} while (!salir10);
					
					
					
					break;
					
				case 11:
					System.out.println("salida exitosa");
					salir=true;
					break;
					
				default:
					System.out.println("solo numeros entre 1 y 10");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("debes insertar un numero");
				sn.next();
			}
			
		}
		System.exit(0);

	}

}
