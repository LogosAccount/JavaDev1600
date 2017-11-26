package lesson10;

public enum Gender{
	
	//public static final Gender MALE = new Gender();
	//public static final Gender FEMALE = new Gender();
	
	MALE(0, "male") {
		@Override
		public void nailsLenght() {
			System.out.println("1 cm");
		}
	},
	
	FEMALE(1, "female") {
		@Override
		public void nailsLenght() {
			System.out.println("From 1 to infinity");
		}
	};
	
	private int index;
	private String stringValue;
	
	Gender(int index, String stringValue){
		this.index = index;
		this.stringValue = stringValue;
	}
	
	public abstract void nailsLenght();
}
