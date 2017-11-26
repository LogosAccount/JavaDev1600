package lesson9;

public class Rectangle implements Figure{

	private int sizeX;
	private int sizeY;
	
	public Rectangle(int sizeX, int sizeY) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
	}

	@Override
	public void square() {
		System.out.println(sizeX*sizeY);
	}

	@Override
	public void perimeter() {
		System.out.println(2*(sizeX + sizeY));
	}

}
