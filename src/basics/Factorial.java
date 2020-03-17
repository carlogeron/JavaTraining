package basics;

public class Factorial {
		//1! = 1
		//2! = 2 * 1! = 2 * 1
		//3! = 3 * 2! = 3 * 2 * 1! = 3 * 2 * 1
		//4! = 4 * 3! = 4 * 3 * 2! = 4 * 3 * 2 * 1! = 4 * 3 * 2 * 1
	public static void main (String[] args) {
		System.out.println(fact(5));
	}
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return fact(n-1) * n;
	}
		
		
	
		
}
