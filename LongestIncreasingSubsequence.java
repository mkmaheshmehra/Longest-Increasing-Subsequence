package traning.simplilearn.assignment_4;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
	public void longestIncreasingSubsequence(int [] array) {
		int [] temp = new int[array.length];
		int longest_length = 0;
		for(int i = 0; i < array.length; i++) {
			temp[i] = 1;
		}
		
		for(int i = 1; i < array.length; i++) {
			for(int j = 0; j < i; j++) {
				if(array[i] > array[j] && temp[j] <= temp[i]) {
					temp[i] = 1 + temp[j];
					longest_length = temp[i];
				}
			}
		}
		System.out.println("Longest increasing subsequence is : " + longest_length);
		
	}
	
	public static void main(String[] args) {
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scanner.nextInt();
		int [] array = new int[size];
		System.out.println("Please insert elements in array : ");
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		lis.longestIncreasingSubsequence(array);
		scanner.close();
	}
}
