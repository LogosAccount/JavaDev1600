package lesson5;

public class Main {

	public static void main(String[] args) {
		String s1 = "Java";
		String sa = new String("Java");
		String s2 = "java";
		System.out.println(s1.charAt(1));
		System.out.println(s1.codePointAt(1));
		System.out.println(s1.codePointBefore(1));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains("ja"));
		System.out.println(s1.endsWith("Ja"));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equalsIgnoreCase(s2));
		System.out.println(s1.hashCode());
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.intern() == sa.intern());
		
		String file = "file.txt";
		
		String fileExtension = file.substring(file.lastIndexOf("."), file.length());
		if(fileExtension.equals(".txt")){
			
		}
		System.out.println(s1.substring(0, 2));
		System.out.println(s1.isEmpty());
		char[] array = s1.toCharArray();
		s1.trim();
		StringBuffer sbuf = new StringBuffer();
		StringBuilder sbild = new StringBuilder();
		sbuf.append("Hello ");
		sbuf.append("World!");
		System.out.println(sbuf.toString());
		
		int number = 10;
		
		int result = multiply(number);
		System.out.println(multiply(40));
		System.out.println(result);
		
	}
	
	public static void multiply(int number) {
		System.out.println("iojdfng");
	}
	
	
	

}
