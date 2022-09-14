package newpaqueteuno;
import newpaqueteuno.subpaquete.ClaseB;
import newpaquetedos.ClaseUno;
public class Importa2 {
	public static void main(String[] args) {
		ClaseUno cUno=new ClaseUno();
		System.out.println(cUno.toString());
		
		newpaqueteuno.subpaquete.ClaseA cA=new newpaqueteuno.subpaquete.ClaseA();
		System.out.println(cA.toString());
		
		ClaseB cB=new ClaseB();
		System.out.println(cB.toString());
		
		ClaseUno cUnoNuevo=new ClaseUno();
		System.out.println(cUnoNuevo.toString());
	}
}
