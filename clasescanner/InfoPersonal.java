package clasescanner;
import java.util.Scanner;
public class InfoPersonal {
	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		String nombre, apellido;
		int edad; double peso;
		System.out.println("Ingrese su nombre: ");
		nombre=lector.next();
		System.out.println("Ingrese su apellido: ");
		apellido=lector.next();
		System.out.println("Ingrese su edad: ");
		edad=lector.nextInt();
		System.out.println("Ingrese su peso: ");
		peso=lector.nextDouble();
		
		System.out.println("Su nombre es "+nombre+" "+apellido);
		System.out.println("Edad= "+edad);
		System.out.println("Peso= "+peso+" libras");
		lector.close();
	}
}
