package lesson10;

public enum Mounthes {

	APRIL(30, Season.AUTUMN),
	
	AUGUST,
	
	DECEMBER,
	
	FEBRUARY,
	
	JANUARY,

	JULY,
	
	JUNE,
	
	MARCH,

	MAY,
	
	NOVEMBER,
	
	OCTOBER,
	
	SEPTEMBER;
	
	private int numberOfDays;
	private Season seanon;
	
	private Mounthes(int numberOfDays, Season seanon) {
		this.numberOfDays = numberOfDays;
		this.seanon = seanon;
	}
	
	
}
