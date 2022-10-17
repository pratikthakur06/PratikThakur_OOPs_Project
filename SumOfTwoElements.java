package gl.oops.project;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoElements {
	
	public static String findPairOfIndices(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int[] temp = new int[2];
		while(start<end) {
			if(arr[start]+arr[end]==target) {
				temp[0]=start;
				temp[1]=end;
				return Arrays.toString(temp);
			}
			if(arr[start]+arr[end]<target) 
				start++;
			else
				end--;
		}
		return "";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements in single line space separated: ");
		String[] stringArray = sc.nextLine().split(" ");
		int arr[] = new int[stringArray.length];
		for(int i=0; i<stringArray.length; i++) {
			arr[i] = Integer.parseInt(stringArray[i]);
		}
//		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the target value: ");
		int target = sc.nextInt();
		System.out.println(findPairOfIndices(arr,target));
		sc.close();
	}
}
