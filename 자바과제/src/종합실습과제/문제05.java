package ���սǽ�����;

import java.util.Scanner;

public class ����05 {
	public static void main(String[] args) {
		int a;
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		System.out.println("�ð�(��):"+a);
		System.out.printf("%02d�ð�%02d��%02d��",a/3600,(a%3600)/60,(a%3600)%60);
	}

}
