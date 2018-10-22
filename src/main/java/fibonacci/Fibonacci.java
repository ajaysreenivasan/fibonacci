package fibonacci;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value: ");
		int input = sc.nextInt();
		sc.close();
		
		System.out.println(compute(input));
	}
	
	private static int compute(int value){
		if(value == 1)
			return 0;
		else if(value == 2)
			return 1;
		else
			return compute(value - 1) + compute(value - 2);
	}
}
