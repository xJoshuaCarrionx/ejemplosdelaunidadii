package variablesdatos;

public class AmbitoVariables {
	private static int y=99;
	public static void main(String[] args) {
		int x=y;
		{
			//x=d;
			int j=100;
			System.out.println("El valor de j= "+j+"y de x= "+x);
			int d=100;
			x=d;
		}
		//System.out.println("El valor de j="+j);
		//System.out.println("El valor de d="+d);
        System.out.println("El valor de x="+x);
	}

}
