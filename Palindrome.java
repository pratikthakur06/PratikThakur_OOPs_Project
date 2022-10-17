package gl.oops.project;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean checkPalindrome(String str, int start, int end) {
		if(start==end)
			return true;
		if((str.charAt(start)) != (str.charAt(end)))
			return false;
		if(start < end+1)
			return checkPalindrome(str, start+1, end-1);
		return true;
	}
	
	public static boolean isPalindrome(String str) {
		int len = str.length();
		if(len==0 || len==1)
			return true;
		return checkPalindrome(str,0,len-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println(isPalindrome(str));
		sc.close();
	}
}
