/**
 * Autor:Alfonso Nevado Navarro
 * Descripción:En esta clase estamos definiendo diferentes atributos,constructores y metodos del circulo.
 * Fecha:29/11/18
 */
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner t =new Scanner (System.in);
		
		int opc=0,a=1,b=1;//LAS IGUALO AL 0 PARA CUANDO PID QUE LO SAQUE SCANNER
		double c=1.0;
		double r =1.0;
		
		rectangulo uno = null; //DECLARAR VARIABLE 1 Y EN VEZ DE DECLARARLO COMO INT LA COGER UNO (EL PROGRAMA ENTERO) 
		triangulo dos = null;
		circulo tres = null;
		
		System.out.println("-------------------------");
		System.out.println("MENU PARA CREAR,MODIFICAR");
		System.out.println("-------------------------");
		do {
			try {
				System.out.println("0-SALIR");
				System.out.println("1-CREAR");
				System.out.println("2-MODIFICAR");
				System.out.println("3-PERIMETRO");
				System.out.println("4-AREA");
				
				System.out.println("-------------------");
				opc=t.nextInt(); //vuelvo a llamar a mi scanner para recoger el numero introducido por le usuario
			}
			catch (Exception e) {
				opc=6;//CADA DO DENTRO DE LOS CASOS 
				t.nextInt();
				System.out.println("ERROR...");
			}
				switch (opc) {
					case 0:
						System.out.println("GRACIAS POR USAR EL PROGRAMA.");
					break;
					case 1:
						do {
							System.out.println("Opción de crear.");
							System.out.println("1-triangulo");
							System.out.println("2-rectangulo");
							System.out.println("3-circulo");
							opc=t.nextInt();
						}while((opc<1) ||(opc>3));
							

						switch(opc) {
						case 1:
							System.out.println("Ancho del triangulo?");
							a=t.nextInt();
							System.out.println("Alto del triangulo?");
							b=t.nextInt();
							System.out.println("Angulo del triangulo?");
							c=t.nextDouble();
							
							dos=new triangulo(a,b,c);
						break;
						case 2:
							System.out.println("Ancho del rectangulo?");
							a=t.nextInt();
							System.out.println("Alto del rectangulo?");
							b=t.nextInt();
							
							uno=new rectangulo(a,b);
						break;
						case 3:
							System.out.println("Introduce el radio.");
							r=t.nextDouble();
						break;
						default:
							System.out.println("Introduce 1 2 o 3.");
						break;
						}
					break;
					
					case 2:
						do {
							System.out.println("Opción de modificar.");
							System.out.println("1-triangulo");
							System.out.println("2-rectangulo");
							System.out.println("3-circulo");
							opc=t.nextInt();
						}while((opc<1) ||(opc>3));
						
					do {
						switch(opc) {
						case 1:
							System.out.println("Nuevo Ancho del triangulo?");
							a=t.nextInt();
							System.out.println("Nuevo Alto del triangulo?");
							b=t.nextInt();
							System.out.println("Nuevo Angulo del triangulo?");
							c=t.nextDouble();
							
							dos=new triangulo(a,b,c);
						break;
						case 2:
							System.out.println("Nuevo Ancho del rectangulo?");
							a=t.nextInt();
							System.out.println("Nuevo Alto del rectangulo?");
							b=t.nextInt();
							
							uno=new rectangulo(a,b);
						break;
						
						default:
							System.out.println("Introduce 1 2 o 3.");
						break;
					
						case 3:
							dos.perimetro();
							System.out.println("El perimetro del rectangulo es: "+uno.perimetro());
							System.out.println("El perimetro del circulo es: "+tres.perimetro());
						break;
					
						case 4:
							dos.area();
							System.out.println("El area del rectangulo es: "+uno.area());
							System.out.println("El area del circulo es: "+tres.area());
							break;
						}
					}while((opc<0) ||(opc>4));
				}
		}while(opc!=0);	
	}
}

