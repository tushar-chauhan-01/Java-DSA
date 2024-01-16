/*
Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.
 */

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

		int sqr_root = (int) Math.sqrt(n);
		System.out.println(sqr_root);
	}
    
}
