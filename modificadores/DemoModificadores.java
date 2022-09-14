package modificadores;

public class DemoModificadores {
	Integer variableInstancia=10;
	static Integer variableEstatica=15;
	private void probar(){
		variableInstancia=10;
		Integer variableLocal=10;
		System.out.println("Dentro del metodo no estatico probar()");
	}
	public static void probarEstatico(){
		Integer OtraVariableLocal=50;
		System.out.println("Dentro del metodo estatico probarEstatico()");
	}
	public static void main(String[] args){
		DemoModificadores objeto=new DemoModificadores();
		DemoModificadores otroObjeto=new DemoModificadores();
		System.out.println("Dentro del metodo main()");
		objeto.probar();
		probarEstatico();
		objeto.variableInstancia=100;
		otroObjeto.variableInstancia=500;
		
		variableEstatica=25;
		DemoModificadores.variableEstatica=30;
	}
}
