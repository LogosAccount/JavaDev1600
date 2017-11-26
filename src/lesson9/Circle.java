package lesson9;

public class Circle implements Figure{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void square() {
		System.out.println(PI*radius*radius);
	}

	@Override
	public void perimeter() {
		System.out.println(2*PI*radius);
	}

}
