import java.util.Scanner;
public class Pri {
		
		public static void main(String[] args) {
			Scanner t =new Scanner (System.in);
			
			int opc=0,a=1,b=1;//LAS IGUALO AL 0 PARA CUANDO PID QUE LO SAQUE SCANNER
			
			rectangulo uno = null; //DECLARAR VARIABLE 1 Y EN VEZ DE DECLARARLO COMO INT LA COGER UNO (EL PROGRAMA ENTERO) 
			triangulo dos = null;
			circulo tres = null;
			
			System.out.println("-------------------------");
			System.out.println("MENU PARA CREAR,MODIFICAR");
			System.out.println("-------------------------");
				
				do {
						try {
							System.out.println("0-SALIR");
							System.out.println("1-TRIANGULO");
							System.out.println("2-RECTANGULO");
							System.out.println("3-CIRCULO");
							System.out.println("-------------------");
							opc=t.nextInt(); //vuelvo a llamar a mi scanner para recoger el numero introducido por le usuario
						}
						catch (Exception e) {
							opc=4;//CADA DO DENTRO DE LOS CASOS 
							t.nextInt();
							System.out.println("ERROR...");
						}
				}while((opc<0)||(opc>3));
				
							switch (opc) {
								case 0:
									System.out.println("GRACIAS POR USAR EL PROGRAMA.");
								break;
								
								case 1: //OPCION DE TRIANGULO.
									System.out.println("Has elegido la opcion de TRIANGULO.");
								do {
									do {
										try {
											System.out.println("-------------------");
											System.out.println("0-CREAR");
											System.out.println("1-MODIFICAR");
											System.out.println("2-PERIMETRO");
											System.out.println("3-AREA");
											System.out.println("4-SALIR");
											System.out.println("-------------------");
											opc=t.nextInt();
										}
										catch (Exception e) {
											
										}
									}while((opc<0)||(opc>3));
									
									switch (opc) {
										case 0:
											System.out.println("OPCIÓN DE CREAR UN TRIANGULO:");
											System.out.println("-----------------------------");
											
											System.out.println("Introduce la anchura:");
												a=t.nextInt();
												dos.setAncho(a);
											System.out.println("Introduce la altura:");
												b=t.nextInt();
												dos.setAlto(b); //LLAMADAS AL METODO
												
												dos=new triangulo(a,b); //LLAMADAS AL CONSTRUCTOR
										break;
								}while(opc!=4)
									
										
								do {
									case 1:
										System.out.println("OPCIÓN DE MODIFICAR UN TRIANGULO:");
										System.out.println("-----------------------------");
										
										System.out.println("Introduce el nuevo ancho: ");
											a=t.nextInt();
											dos.setAncho(a);
										System.out.println("Introduce el nuevo alto: ");
											b=t.nextInt();
											dos.setAlto(b);
											
											dos=new triangulo(a,b);
									break;
								}while(opc!=4)
										
								do {
									case 2:
										System.out.println("OPCIÓN DE PERIMETRO DEL TRIANGULO:");
										System.out.println("-----------------------------");
										
										dos=new triangulo(a,b);
									break;
								
								}while(opc!=4);	
										
										
										case 3:
											System.out.println("OPCIÓN DEL AREA DE UN TRIANGULO:");
											System.out.println("-----------------------------");
											
											dos=new triangulo(a,b);
											
										break;
											
									}
								break;
								
								case 2: //OPCIÓN DE RECTANGULO.
									System.out.println("Has elegido la opcion del RECTANGULO.");
									do {
										try {
											System.out.println("-------------------");
											System.out.println("0-CREAR");
											System.out.println("1-MODIFICAR");
											System.out.println("2-PERIMETRO");
											System.out.println("3-AREA");
											System.out.println("-------------------");
											opc=t.nextInt();
										}
										catch (Exception e) {
											
										}
									}while((opc<0) || (opc>3));
									
									switch (opc) {
										case 0:
											System.out.println("OPCIÓN DE CREAR UN RECTANGULO:");
											System.out.println("-----------------------------");
											
											System.out.println("Introduce la anchura:");
												a=t.nextInt();
											
											System.out.println("Introduce la altura:");
												b=t.nextInt();
												
												
											uno= new rectangulo (a,b);
												
										break;
										
										case 1:
											System.out.println("OPCIÓN DE MODIFICAR UN RECTANGULO:");
											System.out.println("-----------------------------");
											
											System.out.println("Introduce el nuevo ancho: ");
												a=t.nextInt();
												uno.setAncho(a);
											System.out.println("Introduce el nuevo alto: ");
												b=t.nextInt();
												uno.setAlto(b);
												
											uno =new rectangulo (a,b);
										break;
										
										case 2:
											System.out.println("OPCIÓN DE PERIMETRO DEL RECTANGULO:");
											System.out.println("-----------------------------");
											System.out.println("Perimetro del rectangulo :");
											
											System.out.println("El perimetro del rectangulo es "+uno.perimetro());
											
										
										break;
										
										case 3:
											System.out.println("OPCIÓN DEL AREA DEL RECTANGULO:");
											System.out.println("-----------------------------");
											System.out.println("El Area del rectangulo es " + uno.area());
											
											
										break;
									}
								break;
									
								case 3: //OPCIÓN DE CIRCULO.
									System.out.println("Has elegido la opcion del CIRCULO.");
									do {
										try {
											System.out.println("-------------------");
											System.out.println("0-CREAR");
											System.out.println("1-MODIFICAR");
											System.out.println("2-PERIMETRO");
											System.out.println("3-AREA");
											System.out.println("-------------------");
											opc=t.nextInt();
										}
										catch (Exception e) {
											
										}
									}while((opc <0)||(opc >3));
									
									switch (opc) {
									
										case 0:
											System.out.println("OPCIÓN DE CREAR UN CIRCULO:");
											System.out.println("-----------------------------");
											System.out.println("Introduce el radio: ");
											a=t.nextInt();
											tres.getRadio();
											
										break;
										
										case 1:
											System.out.println("OPCIÓN DE MODIFICAR UN CIRCULO:");
											System.out.println("-----------------------------");
											System.out.println("Introduce el nuevo radio: ");
											a=t.nextInt();
											tres.getRadio();
										break;
										
										case 2:
											System.out.println("OPCIÓN DE PERIMETRO DEL CIRCULO:");
											System.out.println("-----------------------------");
											System.out.println("Area del circulo es:"+ tres.perimetro());
											
										break;
										
										case 3:
											System.out.println("OPCIÓN DEL AREA DEL CIRCULO:");
											System.out.println("-----------------------------");
											System.out.println("Area del circulo es:"+tres.area());
										break;
									}
								break;
					
								default:
									System.out.println("OPCIÓN INCORRECTA VUELVE A INTRODUCIR.");
								break;
						}
		}
	}

