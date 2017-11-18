package lesson8;

public class Hunter extends Human {

	private static int countOfHunters;
	
	public Hunter(int age, String name){
		super(age, name);
		countOfHunters++;
	}
	
	public void eatMeat(String meatName){
		System.out.println("Finally I get this " + meatName);
	}
	
	public void eatMeat() {
		run();
		System.out.println("");
	}
	
	public int getCountOfHunters(){
		return countOfHunters;
	}
}
