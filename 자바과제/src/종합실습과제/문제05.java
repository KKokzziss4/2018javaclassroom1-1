package 종합실습과제;

import java.util.Scanner;

public class 문제05 {
	public static void main(String[] args) {
		int a;
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		System.out.println("시간(초):"+a);
		System.out.printf("%02d시간%02d분%02d초",a/3600,(a%3600)/60,(a%3600)%60);
	}

}
