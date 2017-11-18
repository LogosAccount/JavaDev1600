package lesson8;

public class Human {
	
	private int age;
	private String name;
	
	public Human(final int age, final String name) {
		this.age = setAge(age);
		this.name = setName(name);
	}

	public int getAge() {
		return age;
	}

	private int setAge(int age) {
		if(age < 0){
			return 0;
		}
		return age;
	}

	public String getName() {
		return name;
	}

	private String setName(String name) {
		if(!name.isEmpty() && name != null) {
			return name;
		}
		return "Not valid name";
	}
	
	public void run(){
		System.out.println("Run Vasia, run");
	}

	

}
