package gl.oops.project;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberPossible {
	
	public static String findLargestPossibleNumber(String[] arr) {
		Arrays.sort(arr, (a,b)->(b+a).compareTo(a+b));
		StringBuilder stringBuilder = new StringBuilder();
		for(String str:arr) {
			stringBuilder.append(str);
		}
		String result = stringBuilder.toString();
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements in single line space separated: ");
		String[] arr = sc.nextLine().split(" ");
		System.out.println(findLargestPossibleNumber(arr));
		sc.close();
	}
}
