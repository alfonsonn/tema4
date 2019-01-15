/***
 	Autor:Alfonso Nevado Navarro
 	
 	Fecha:28/11/18
 	
 	Descripcion:Programa para sacar la media de 10 notas usando arrays y try catch.
 	El usuario debe introducir una nota mayor que 0 y menor o igual a 10 para ser contada como VALIDA.
 ***/

import java.util.Scanner;
public class media {
	private static float [] medias1;
	final static int POS=10 ;		 //POSICIONES DEL ARRAY.USO DE VARIABLE STATIC POR QUE NO VA A CAMBIAR,ES FIJO EN TODA LA EJECUCION DE TU PROGRAMA.
	
	public static void main (String []args) {
		float media=0;
		
		Scanner teclado = new Scanner (System.in);
		
		medias1 = new float [POS];
				for(int i=0;i<POS;i++) {		//Leer los valores de la nota
					do {
						try { 					//POSIBLES ERRORES DE INTRODUCCION DEL USUARIO,POR ESO USAMOS TRY CATCH 
							System.out.println("Introduzca nota "+(i+1));
							medias1[i]= teclado.nextFloat();
						}catch(Exception e ) {
							System.out.println("ERROR al introducir la nota");
							teclado.next();
							medias1[i]=-1;
						}
							
					}while((medias1[i]<0.0)||(medias1[i]>10.0));
				}	
		for (int i=0;i<POS;i++) { 		//Hacer la media
			media=media+medias1[i];	
		}
		media=media/POS;
		System.out.println("La media de las notas es: " + media);
	}
	
}
