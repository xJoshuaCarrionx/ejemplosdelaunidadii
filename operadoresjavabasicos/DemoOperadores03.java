package operadoresjavabasicos;
public class DemoOperadores03 {
	public static void main(String[] args) {
		// Operadores unarios
		int x=10;
		System.out.println("x="+x);
		--x; //Predecremento
		System.out.println("x="+x);
		//Predecremento, pero el valor decrementado
		//se muestro en la siguiente sentencia
		System.out.println("x="+ --x);
		System.out.println("x="+x);
	}
}
