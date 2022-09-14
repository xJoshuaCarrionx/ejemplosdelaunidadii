package clasescanner;
import java.util.Scanner;
public class PiesPulgadas {
	static Scanner Lector=new Scanner(System.in);
	public static void main(String[] args) {
		int pies;
		int pulgadas;
		System.out.println("Ingrese los valores de pies y pulgadas: ");
		pies=Lector.nextInt();
		pulgadas=Lector.nextInt();
		System.out.println("pies="+pies);
		System.out.println("pulgadas="+pulgadas);	
	}
}
