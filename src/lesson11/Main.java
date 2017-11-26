package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Iterable<Double> iterable = new ArrayList<>();
		Collection<Double> collection = new ArrayList<>();
		List<Double> list = new ArrayList<>();
		
		list.add(2d);
		list.add(3d);
		list.add(4d);
		list.add(0, 5d);
		list.addAll(Arrays.asList(20d, 30d, 50d));
		System.out.println(list.contains(20d));
		System.out.println(list.get(3));
		System.out.println(list.isEmpty());
		list.remove(0);
		list.set(0, 6d);
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("For i");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Foreach");
		for(Double doubleThatIGetEveryTime : list){
			System.out.println(doubleThatIGetEveryTime);
		}
		
		System.out.println("Foreach java 8");
		list.forEach(doubleThatIGetEveryTime -> System.out.println(doubleThatIGetEveryTime));
		
		double double2;
		for (int i = 0; i < list.size(); i++) {
			double2 = list.get(i);
			if(double2 == 20d){
				list.remove(double2);
			}
		}
		
//		for (Double double1 : list) {
//			if(double1 == 20d){
//				list.remove(double1);
//			}
//		}
//		System.out.println(list);
		list.add(20d);
//		
		list.removeIf(double1 -> double1 == 20d);
		
		System.out.println(list);
		
		List<Double> list2 = list.subList(2, list.size());
		System.out.println(list2);
		randomMethod(list);
	}

	private static void randomMethod(Collection<Double> list) {
		
	}

}
