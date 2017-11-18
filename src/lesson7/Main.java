package lesson7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.walk(0);
		
		Person person2 = new Person("23", "Pavlo", 4);
		person2.walk(5);
		
		
		
		System.out.println(person);
		System.out.println(person2);
		
		
		
		
		
//		int[] array = createArray(10);
//		insertRandomValues(array);
//		print(array);
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Put first number");
//		int a = sc.nextInt();
//		System.out.println("Put second number");
//		int b = sc.nextInt();
//		
//		System.out.println("Please put action(* / + -) available");
//		String choise = sc.nextLine();
//		
//		actionDueToSelected(a, b, choise);
	}
	
	private static void actionDueToSelected(int a, int b, String choise) {
		switch(choise){
		case "*":
			System.out.println(multiply(a, b));
			break;
		case "+":
			System.out.println(multiply(a, b));
			break;
		default :
			System.out.println("Wrong choise");
			break;
	}
	
		
	}

	private static int multiply(int a, int b) {
		return a * b;
	}

	public static int[] createArray(int size){
		return new int[size];
	}
	
	public static int[] insertRandomValues(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = random(5, 10);
		}
		return array;
	}
	
	public static int random(int from, int to) {
		return (int) (Math.random()*(to - from) + from);
	}
	
	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
