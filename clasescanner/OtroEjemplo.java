package clasescanner;
import java.util.Scanner;
public class OtroEjemplo {
	static Scanner lector=new Scanner(System.in);
	public static void main(String[] args) {
		int primerNum;
		int segundoNum;
		char letra;
		double z;
		
		primerNum=4;
		segundoNum=2*primerNum+6;
		z=(primerNum+1)/2.0;
		letra='O';
		segundoNum=lector.nextInt();
		z=lector.nextDouble();
		primerNum=(int)(z)+8;
		segundoNum=segundoNum+1;
		primerNum=primerNum+(int)(letra);
		
		System.out.println(primerNum);
		System.out.println(segundoNum);
		System.out.println(letra);
		System.out.println(z);
	}
}
