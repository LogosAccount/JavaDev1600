package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] array = {2, 6, 8, 7, 5, 1, 11};
		
		for (int i = 0; i < array.length; i++) {
			if( array[i] % 2 == 0){
				System.out.println(array[i]);
			}
		}
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your name, please");
//		String name = sc.nextLine();
//		System.out.println("Enter your age, please");
//		int age = sc.nextInt();
//		System.out.println("Thank you " + name + " your age is: " + age);
		
//		double exp = Math.E;
//		double random = Math.round((Math.random()*10 + 2));
//		System.out.println(random);
//		System.out.println(exp);
//		
//		
//		int arrayLength = 3;
//		
//		String[] stringArray = new String[8];
//		
//		stringArray[0] = "Hello World";
//		
//		
//		int[] array = new int[arrayLength];
//		array[0] = 5;
//		array[1] = 7;
//		array[2] = 8;
//		
////		int[] array = {5, 7, 8, 10};
//		
////		array[4] = 8;
////		System.out.println(array[8]);
//		
//		for(int index = 0; index < array.length; index++){
//			array[index] = 6;
//			System.out.println(array[index]);
//		}
		
	}
}
