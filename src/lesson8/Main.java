package lesson8;

public class Main {

	
	public static void main(String[] args) {
		Hunter hunter = new Hunter(30, "Vasia");
		Hunter hunter2 = new Hunter(30, "Orest");
		Gatherer gatherer =  new Gatherer(25, "Petro");
		
		hunter.run();
		gatherer.run();
		
		System.out.println(hunter2.getCountOfHunters());
	}
}
