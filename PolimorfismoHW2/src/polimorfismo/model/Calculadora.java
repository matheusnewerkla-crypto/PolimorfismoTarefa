package polimorfismo.model;

public class Calculadora {
	public static void somar(int x, int y) {
		int resultado = x + y;
		System.out.println(x + "+" + y + "=" + resultado);
		
	}
	
	public static void somar(int x, int y, int z) {
		int resultado = x + y + z;
		System.out.println(x + "+" + y +"+" + z + "=" + resultado);
	}
	
	public static void somar(double x, double y) {
		double resultado = x + y;
		System.out.println(x + "+" + y + "=" + resultado);
	}

}
