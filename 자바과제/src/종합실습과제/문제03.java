package 종합실습과제;

import java.util.Scanner;
public class 문제03 {
	
	
	public static void main(String[] args) {
		int a;
		
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		
		System.out.println("섭씨온도(C):"+" "+a);
		System.out.printf("화씨온도(F): %.2f", ((float)a*1.8)+32);
		
	}

}
