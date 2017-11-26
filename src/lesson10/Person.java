package lesson10;

public class Person {
	
	private int age;
	private String name;
	private Gender gender;
	
	public Person(int age, String name, Gender gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
	}

	public void personsNailsLength(){
		gender.nailsLenght();
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", gender=" + gender
				+ "]";
	}
	
	
	
	
	
	
}
