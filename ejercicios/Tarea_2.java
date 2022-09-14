package ejercicios;
public class Tarea_2 {
	public static void main(String[] args) {
		double a,b,c, respuesta;
		Boolean es_Verdadero=false;
		a = 10.0;
		b = 3.0;
		c = 14.0;
		respuesta = 0.0;
		respuesta = (a*b + 2*b);
		es_Verdadero = (b<a || a>14);
		System.out.println("(a*b + 2*b)=" + respuesta);
		System.out.println("b<a||a>14=" + es_Verdadero);
	}
}
