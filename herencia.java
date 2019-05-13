/*
	Escriba una jerarquía de herencia para las clases Cuadrilatero ,
	Trapezoide , Paralelogramo , Rectangulo y Cuadrado . Use Cuadrilatero como la
	superclase de la jerarquía. Cree y use una clase Punto para representar los 
	puntos en cada figura. Agregue todos los niveles que sea posible a la 
	jerarquía. Especifique las variables de instancia y los métodos para cada
	clase. Las variables de instancia private de Cuadrilatero deben ser los pares
	de coordenadas x-y y para los cuatro puntos finales del Cuadrilatero . Escriba
	un programa que cree instancias de objetos de sus clases, y que imprima el área 
	de cada objeto (excepto Cuadrilatero ).
*/
public class Main {
	public static void main(String[] args) {
	
	}
}
class abstract Cuadrilatero {
	protected Punto p1;
	protected Punto p2;
	protected Punto p3;
	protected Punto p4;
	
	public Cuadrilatero 
	public abstract void printArea(){
	
	}
	public static double distancia(Punto p, Punto q) {
		return Math.sqrt(Math.pow(q.x - p.x, 2) + Math.pow(q.y - p.y, 2));
	}
}
class Trapezoide extends Cuadrilatero {
	public Trapezoide(int x1, )
}
class Paralelogramo extends Cuadrilatero {
	public void printArea(){
	
	}
}
class Rectangulo extends Paralelogramo {
	public void printArea(){
	
	}
}
class Cuadrado extends Rectangulo {
	public void printArea(){
		System.out.printf("El area del cuadrilatero es: %f", &)
	}
}
class Punto {
	private final double x;
	private final double y;
	
	public Punto(double x0, double y0) {
		x = x0;
		y = y0;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
}
