package ���սǽ�����;

import java.util.Scanner;

public class ����12 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		
		System.out.printf("�� ���� ����: %d, %d\n", a,b);
		
		if( ((a+b)/2)>=60 && a>=40 && a>=40) {
			System.out.println("���: �հ�");
			
		}
		
		else if( ((a+b)/2)>=60 && a<40 || a<40) {
			System.out.println("���: ���հ�(����)");
		}
		
		else {
			System.out.println("���: ���հ�");
		}
	}

}
