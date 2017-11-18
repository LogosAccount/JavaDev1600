package lesson6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// for (int i = 0; i < 3; i++) {
		// System.out.println("i = " + i);
		// for (int j = 0; j < 20; j++) {
		// if (j % 2 == 0) {
		// continue;// to next iteration
		// }
		// System.out.println("   j = " + j);
		// }
		// System.out.println("");
		// }
		//
		// boolean t = true;
		// first: {
		// second: {
		// third: {
		// System.out.println("print before break");
		// if (t) {
		// break second;
		// }
		// System.out.println("probably won't get to it 3");
		// }
		// System.out.println("probably won't get to it 2 ");
		// }
		// }

		// outer: {
		// for (int i = 0; i < 3; i++) {
		// System.out.println("i = " + i);
		// inner: {
		// for (int j = 0; j < 100; j++) {
		// if (j == 4) {
		// break outer;// to next iteration
		// }
		// System.out.println("   j = " + j);
		// }
		// System.out.println("");
		// }
		// }
		// }

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please enter students mark(available A, B, C, D, E):");
		String studentsMark = sc.nextLine();

//		int successReport = checkStudentsMark(studentsMark);
//		printSuccess(successReport);
		
		
	}
	
	private static int random(int from, int to){
		return (int) (Math.random()*(to-from) + from);
	}

//	private static void printSuccess(int successReport) {
//		switch(successReport) {
//		case 1:
//			System.out.println("Final resut: success");
//			break;
//		case 0:
//			System.out.println("Final result: fail");
//			break;
//		default:
//			System.out.println("Something wrong");
//			break;
//		}
//	}
//
//	private static int checkStudentsMark(String studentsMark) {
//		switch (studentsMark) {
//		case "A":
//			System.out.println("Great mark");
//			return 1;
//		case "B":
//			System.out.println("Good mark");
//			return 1;
//		case "C":
//			System.out.println("Normal mark");
//			return 1;
//		case "D":
//		case "E": 
//			System.out.println("Very very bad");
//			return 0;
//		default: 
//			System.out.println("Something happend");
//			return -1;
//		}
//	}
}
