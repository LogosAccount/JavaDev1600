package lesson9;

import polimorphysmExample.Ballada;
import polimorphysmExample.Bart;
import polimorphysmExample.HeroBallada;
import polimorphysmExample.LovaBallada;
import polimorphysmExample.SimpleBallada;

public class Main {

	
	public static void main(String[] args) {
		
		Figure[] figures = {
				new Circle(3d),
				new Rectangle(3, 4)};
		
		Bart lutik = new Bart("Lutik");
		
		Ballada heroBallada = new HeroBallada();
		Ballada loveBallada = new LovaBallada();
		Ballada simpleBallada = new SimpleBallada();
		
		lutik.sing(heroBallada);
		lutik.sing(loveBallada);
		lutik.sing(simpleBallada);
		
		for (int i = 0; i < figures.length; i++) {
			figures[i].square();
		}
	
	}
}
