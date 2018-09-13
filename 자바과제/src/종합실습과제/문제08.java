package 종합실습과제;

import java.util.Scanner;

public class 문제08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		
		System.out.println("정수: "+a);
		System.out.printf("절댓값: %d\n" ,a<0? a*-1:a);
		
	
	}

}
