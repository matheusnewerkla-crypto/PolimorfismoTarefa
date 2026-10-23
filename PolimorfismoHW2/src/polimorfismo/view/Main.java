package polimorfismo.view;

import polimorfismo.model.*;

public class Main {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		
		c.somar(1, 2);
		c.somar(1, 2, 4);
		c.somar(6.7, 6.9);
	}

}
