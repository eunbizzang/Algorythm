package chap01;

import java.util.Scanner;

public class Min4 {

	static int min4(int a, int b, int c, int d) {
		
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("First number : "); int a = sc.nextInt();
	System.out.print("Second number : "); int b = sc.nextInt();
	System.out.print("Third number : "); int c = sc.nextInt();
	System.out.print("Fourth number : "); int d = sc.nextInt();
	
	System.out.println("min : " + min4(a,b,c,d));
	}
}
