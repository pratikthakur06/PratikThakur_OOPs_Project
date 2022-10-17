package gl.oops.project;

import java.util.Scanner;

public class PowerXOverN {
	
	public static int calcPower(int x, int n) {
		int result = 1;
		while(n>0) {
			if(n%2 != 0)
				result = result*x;
			x = x*x;
			n = n>>1;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println(calcPower(x,n));
		sc.close();
	}
}
