package lesson4;

public class Main {

	public static void main(String[] args) {
		int[] mus = new int[99];
		for(int i = 0; i < mus.length; i++) {
			mus[i] = i + 1;
		}
		for(int i = 0; i < mus.length; i+=2) {
			System.out.print(" " + mus[i]);
		}
		
		
		
		int[] mu = new int[99];
		for(int y = mu.length-1; y >= 0; y--) {
			mu[y] = y + 1;
		}
		for(int y = mu.length-1; y >= 0; y-=2) {
			System.out.print(" " + mu[y]);
		}
	}
}
