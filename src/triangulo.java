/**
 * Autor:Alfonso Nevado Navarro
 * Descripción:En esta clase estamos definiendo diferentes atributos,constructores y metodos del triangulo.
 * Fecha:29/11/18
 */

public class triangulo {
	
	//MIEMBRO ESTATICO 
	static int numerotriangulo=0;//LE DAMOS UN VALOR.
	
	
	//ATRIBUTOS	
	private int Alto; //Aqui no hacen falta valores por que luego en el constructor ya tomará un valor
	private int Ancho;
	private double angulo;
	
	//CONSTRUCTOR
		triangulo(){
			Alto=1;
			Ancho=1;
			numerotriangulo++;
		}
	//CONSTRUCTOR
		triangulo(int alt,int anc,double ang){
			Alto=alt;
			Ancho=anc;
			numerotriangulo++;
		}
	//METODO
		public int getAlto() {
			return this.Alto;
		}
		
		public int getAncho() {
			return this.Ancho;
		}
		
		public double getAngulo() {
			return this.angulo;
		}
		
		public triangulo setAlto(int alt) {
			this.Alto=alt;
			return this;
		}
		
		public triangulo setAncho (int anc) {
			this.Ancho=anc;
			return this;
		}
		public triangulo setAngulo (double ang) {
			this.angulo=ang;
			return this;
		}
		
		public static int contador () { //METODO PARA CONTAR LOS RECTANGULOS
			return numerotriangulo++; 
			
		}
		public static void eliminar() {
			if(numerotriangulo>0)
				numerotriangulo--;
		}
		public void perimetro() {
			double a, b, beta_1, x, y, perimetro;
			double anguloradianes = Math.toRadians(angulo);
			a = Alto/Math.sin(anguloradianes);
			beta_1 = angulo;
			x = (a*a)/Ancho;
			y = Ancho-x;
			double beta_1radianes = Math.toRadians(beta_1);
			b = y/Math.sin(beta_1radianes);
			perimetro = a + b + Ancho;
			System.out.println("El perimetro del triángulo es: "+ perimetro);
			
		}
		public void area() {
			int area;
			area=(Ancho*Alto)/2;
			System.out.println("El area del triangulo es:"+area);
		}
}
