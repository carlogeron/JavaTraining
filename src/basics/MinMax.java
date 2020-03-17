package basics;

public class MinMax {
	public static void main (String args []) {
	int[] num = {1, 2, 3, 4, 5};
	System.out.println("Minimum: " + Min(num));
	System.out.println("Maximum: " + Max(num));
	}
	
	public static int Min(int[] arr) {
		int min = arr[0];
		for (int i= 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				
			}
		}
		return min;
	}
	
	
	public static int Max(int[] arr) {
		int max = arr[0];
		for (int i= 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				
	}
	
		}return max;
		
	
}
}
