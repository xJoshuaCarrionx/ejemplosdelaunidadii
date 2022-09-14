package introjava;
public class ComparacionesCadenas {
	public static void main(String[] args) {
		String s1=new String("Hola");
		String s2=new String("Hola");
		String s3=s1;
		
		System.out.println("s1 ==s2 => \t\t"+(s1 == s2));
		System.out.println("s1 ==s3 => \t\t"+(s1 == s3));
		
		System.out.println("s1.equals(s2) -> \t"+(s1.equals(s2)));
		System.out.println("s1.equals(s3) -> \t"+(s1.equals(s3)));
		
		StringBuilder sb1=new StringBuilder("Hola");
		StringBuilder sb2=new StringBuilder("Hola");
		StringBuilder sb3=sb1;
		
		System.out.println("sb1 ==sb2 => \t\t"+(sb1 == sb2));
		System.out.println("sb1 ==sb3 => \t\t"+(sb1 == sb3));
		
		System.out.println("sb1.equals(sb2) -> \t"+(sb1.equals(sb2)));
		System.out.println("sb1.equals(sb3) -> \t"+(sb1.equals(sb3)));
		
		
	}
}
