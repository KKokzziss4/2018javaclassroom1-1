package ���սǽ�����;

import java.util.Scanner;

public class ����21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		System.out.printf("�ڿ���n: %d",n);
		int i;
		int sum=0;
		for(i=1;i<=n; i++) {
			sum +=i*i;
			
			
		}
		System.out.printf("\n���: %d", sum);
	}

}
