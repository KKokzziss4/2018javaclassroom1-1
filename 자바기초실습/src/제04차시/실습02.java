package 제04차시;
import java.io.*;
public class 실습02.java {
	public static void main(String[] args) {
		int bt;
		try {
			while(( bt = System.in.read()) != -1){
				System.out.println((char)bt);
				}
			}catch(IOException e) {
		System.err.println(e);
		}
	}
}


