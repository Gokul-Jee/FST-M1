package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		int[] arrayNum= {10,77,10,54,-11,10};
		System.out.println("Original Array: " + Arrays.toString(arrayNum));
		int find=10;
		int sum=30;
		int temp=0;
		boolean check=false;
		
		for (int x:arrayNum) {
			if (x==find) {
				temp += x;
			}
		}
		
		if (temp==sum) {
			check=true;
			System.out.println("Is the sum of all the 10's in the array is exactly 30? "+check);
		}
			
		
		
	}
}
