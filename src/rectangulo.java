/**
 * Autor:Alfonso Nevado Navarro
 * Descripción:En esta clase estamos definiendo diferentes atributos,constructores y metodos del rectangulo.
 * Fecha:29/11/18
 */
public class rectangulo {
	
	//MIEMBRO ESTATICO 
	static int numerorectangulo=0;//Le damos un valor 
	
	
	//ATRIBUTOS	
	private int Alto; //Aqui no hacen falta valores por que luego en el constructor ya tomará un valor
	private int Ancho;
	
	
	//CONSTRUCTOR
		rectangulo(){
			Alto =1;
			Ancho=1;
			numerorectangulo++;
		}
		
	//CONSTRUCTOR
		rectangulo (int alt,int anc){
			Alto=alt;
			Ancho=anc;
			numerorectangulo++;
		}
		
	//METODO
		public int getAlto() {
			return this.Alto;
		}
		
		public int getAncho() {
			return this.Ancho;
		}
		
		public rectangulo setAlto(int alt) {
			this.Alto=alt;
			return this;
		}
		
		public rectangulo setAncho (int anc) {
			this.Ancho=anc;
			return this;
		}		
		public static int contador () { //METODO PARA CONTAR LOS RECTANGULOS
			return numerorectangulo; //COMO ES STATIC NO ES NECESARIO EL THIS 
			
		}
		public static void eliminar() {
			if(numerorectangulo>0)
				numerorectangulo--;
		}
		public double  perimetro() {
			double peri;
			peri=((Ancho*Alto)*2);
			return peri;
			
		}
		public double area() {
			double are;
			are=(Ancho*Alto);
			return are;
		}
}
