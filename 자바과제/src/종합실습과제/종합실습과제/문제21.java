package 종합실습과제;

import java.util.Scanner;

public class 문제21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		System.out.printf("자연수n: %d",n);
		int i;
		int sum=0;
		for(i=1;i<=n; i++) {
			sum +=i*i;
			
			
		}
		System.out.printf("\n결과: %d", sum);
	}

}
