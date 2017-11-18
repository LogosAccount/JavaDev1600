package lesson7;

public class Person {
	
	String age;
	String name;
	int birthdayDay;
	
	Person() {
		
	}
	
	Person(String age, String name, int birthdayDay) {
		this.age = age;
		this.name = name;
		this.birthdayDay = birthdayDay;
	}
	
	public void walk(int distance){
		System.out.println("Hi my name " + name + " I just walk " + distance + "km" );
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	
	
}


