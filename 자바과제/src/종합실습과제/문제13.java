package ���սǽ�����;

import java.util.Scanner;

public class ����13 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String a= sc.next();
		
		System.out.printf("�����ڵ�: %s\n", a);
		
		if(a.charAt(3)=='1') {
			System.out.println("�μ�: �ѹ���");
		}
		else if(a.charAt(3)=='2') {
			System.out.println("�μ�: �λ��");
		}
		else {
			System.out.println("�μ�: ������");
		}
	}

}
