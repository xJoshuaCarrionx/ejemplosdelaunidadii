package operadoresjavabasicos;
public class DemoOperadores05 {
	public static void main(String[] args) {
		//operadores de desplazamiento
		int a=20;
		System.out.println("a="+a);
		System.out.println("a<<2 = ");
		//el desplazamineto hacia la izquierda es
		//20*2^2=20*4=8=0
		System.out.println(a<<2);
		System.out.println("a>>3 = ");
		//el desplazamiento hacia la derecha es
		//20/2^3=20/8=2.5
		System.out.println(a>>3);
	}
}
