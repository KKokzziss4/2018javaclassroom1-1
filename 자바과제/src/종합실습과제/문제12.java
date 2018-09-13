package 종합실습과제;

import java.util.Scanner;

public class 문제12 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		
		System.out.printf("두 과목 점수: %d, %d\n", a,b);
		
		if( ((a+b)/2)>=60 && a>=40 && a>=40) {
			System.out.println("결과: 합격");
			
		}
		
		else if( ((a+b)/2)>=60 && a<40 || a<40) {
			System.out.println("결과: 불합격(과락)");
		}
		
		else {
			System.out.println("결과: 불합격");
		}
	}

}
