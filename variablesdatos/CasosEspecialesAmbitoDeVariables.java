package variablesdatos;

public class CasosEspecialesAmbitoDeVariables {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		System.out.println("i="+i);
		//System.out.println("i final ="+i);
		int j=0;
		for(int i=0;i<10;i++) {
		System.out.println("i="+i);
		j +=1;
		}
		//System.out.println("i final ="+i);
		System.out.println("j final ="+j);
	}
	public void hacerAlgo(int i) {
		System.out.println("i ="+i);
	}

}
