package _2;

public class main {
	
	public static void main(String[] args) {
		
		int []arr = new int[100];
		
		arr[1] = 1;
		arr[2] = 2;
		
		for (int i = 3; i < arr.length; i++) {
				arr[i] = arr[i-1] + arr[i-2];
		}
		
		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}		
	}
}
