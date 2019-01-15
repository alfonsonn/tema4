
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejecutor_ejemplo_rectangulo {

	public static void main(String[] args) {
		Scanner t =new Scanner (System.in);
		
		int opc=0,a=1,b=1;//LAS IGUALO AL 0 PARA CUANDO PID QUE LO SAQUE SCANNER
		
		rectangulo uno=null; //DECLARAR VARIABLE 1 Y EN VEZ DE DECLARARLO COMO INT LA COGER UNO (EL PROGRAMA ENTERO) 
		
		System.out.println("ESTO ES UN MENU PARA CREAR,MODIFICAR,BORRAR O SALIR");
			do {
					try{
						
					
						System.out.println("-------------------");
						System.out.println("0-SALIR");
						System.out.println("1-CREAR");
						System.out.println("2-MODIFICAR");
						System.out.println("3-BORRAR");
						System.out.println("4-MOSTRAR");
						System.out.println("-------------------");
						
					}
					catch (Exception e) {
						opc=5;
					}
						
						opc=t.nextInt(); //vuelvo a llamar a mi scanner para recoger el numero introducido por le usuario
						
						switch (opc) {
							case 0:
								System.out.println("GRACIAS POR USAR EL PROGRAMA.");
							break;
							
							case 1: //OPCION DE CREAR UN RECTANGULO.
								System.out.println("Creación de un rectangulo");
								
								try {
									System.out.println("Alto: ");
									 a = t.nextInt();
									
									System.out.println("Ancho");
									 b = t.nextInt();
									
									uno = new rectangulo(a,b);
								}
								catch(Exception e) {
									//System.out.println("Error de tipo: "+e.getMessage());
									//e.printStackTrace();
									t.next();
									uno = new rectangulo(); 
								}
								
									System.out.println("Valor del alto: " +uno.getAlto()); 
									System.out.println("Valor del ancho: " +uno.getAncho());
							break;
							
							case 2: //OPCIÓN DE MODIFICAR UN RECTANGULO.
								if(uno.contador()>0){
										
									
									do{
										try {
											System.out.println("1-MODIFICAR ALTO. ");
											System.out.println("2-MODIFICAR ANCHO. ");
											opc = t.nextInt();
										}
										catch(Exception e) {
											t.next();
											opc=0; 
										}
									}while((opc!=1)&&(opc!=2));
											
										if(opc==1) {
											try {
												System.out.println("Nuevo Alto: ");
												a = t.nextInt();
												
												uno.setAlto(a);
												
											}
											catch (Exception e) {
												t.next();
											}
										}
										else {
											try {
												System.out.println("Nuevo Ancho: ");
												b=t.nextInt();
												
												uno.setAncho(b);	
											}
											catch (Exception e) {
												t.next();
											}
										}
										System.out.println("Valor del alto: " + a ); 
										System.out.println("Valor del ancho: " + b  );
								}
								else {
									System.out.println("No existe ningun rectangulo.");
								}
							break;
								
							case 3:
								if(uno.contador()>0) {
									
									uno.eliminar();
									System.out.println("Se ha borrado un rectangulo.");
									break;
								}
								else {
									System.out.println("No existe ningun rectangulo.");
								}
							break;	
							
							case 4:
								System.out.println("El numero de rectangulos es: " +uno.contador());
							break;
							
							default:
								System.out.println("OPCIÓN INCORRECTA.");
						}	
			}while(opc!=0);	
	}
}
	
