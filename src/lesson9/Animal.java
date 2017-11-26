package lesson9;

public abstract class Animal {
	
	public void breath(int breathingPeriod) {
		System.out.println("My breathing period is " + breathingPeriod);
	}
	
	public abstract void breath();

}
