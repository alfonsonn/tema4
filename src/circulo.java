/**
 * Autor:Alfonso Nevado Navarro
 * Descripción:En esta clase estamos definiendo diferentes atributos,constructores y metodos del circulo.
 * Fecha:29/11/18
 */
public class circulo {
	 	//MIEMBRO ESTATICO 
		static int numerocirculo=0;//Le damos un valor 
		//ATRIBUTOS	
		private int radio;
		
		//CONSTRUCTOR
			circulo(){
			radio=1;
				numerocirculo++;
			}
			
		//CONSTRUCTOR
			circulo(int r){
				radio=r;
				numerocirculo++;
			}
		//METODO
			public int getRadio() {
				return this.radio;
			}
			
			public static int contador () { //METODO PARA CONTAR LOS CIRCULOS
				return numerocirculo++;  
				
			}
			public static void eliminar() {
				if(numerocirculo>0)
					numerocirculo--;
			}
			public double perimetro() {
				double peri;
				peri=2*Math.PI*radio;
				return peri;
			}
			public double area() {
				double are;
				are=Math.PI*(radio*radio);
				return are;
			}
	}

