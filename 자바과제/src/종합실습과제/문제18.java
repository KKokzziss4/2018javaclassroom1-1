package 종합실습과제;

import java.util.Scanner;

public class 문제18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int b = a.charAt(0);
		
		int z ='Z';
		for(char i= (char)b; b<=z ; b++) {
			System.out.printf("%c ",b);
		}
	}

}
