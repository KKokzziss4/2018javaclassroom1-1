package 종합실습과제;

import java.util.Scanner;

public class 문제07 {
	public static void main(String[] args) {
		int a, b;
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.printf("두 정수: %d,%d\n", a ,b);
		System.out.printf("a AND b: %d\n", a&b);
		System.out.printf("a OR b: %d\n", a|b);
		System.out.printf("NOT a: %d\n", ~a);
		System.out.printf("a XOR b: %d\n", a^b);
		System.out.printf("a NAND b: %d\n", ~(a&b));
		System.out.printf("a NOR b: %d\n", ~(a|b));
	}

}
