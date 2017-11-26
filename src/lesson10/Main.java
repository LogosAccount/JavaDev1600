package lesson10;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
//		StringWithVersion str = new StringWithVersion("abc", 1);
//		int[] array = {1, 2, 3};
//		IntArrayWithVersion intArray = new IntArrayWithVersion(array, 3);
//		
//		WithVersion<String> strWithVersion = new WithVersion<String>("abc", 2);
//		WithVersion<int[]> intArrayVersioned = new WithVersion<int[]>(array, 4);
//		
//		Person p = new Person(23, "Petro", Gender.MALE);
//		Person g = new Person(22, "Ivanka", Gender.FEMALE);
//		
//		g.personsNailsLength();
//		p.personsNailsLength();
//		
//		
//		Gender[] genders = Gender.values();
//		for (int i = 0; i < genders.length; i++) {
//			System.out.println(genders[i]);
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter persons age");
		int age = sc.nextInt();
		System.out.println("Please enter persons name");
		String name = sc.next();
		System.out.println("Enter gender");
		String gender = sc.next();
		
		Person p = new Person(age, name, Gender.valueOf(gender));
		
		System.out.println(p);
		sc.close();
	}

}
