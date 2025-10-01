package ch04.sec05;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		System.out.println("정수: " + num);
		
		System.out.print("실수 입력: ");
		double d = sc.nextDouble();
		
		System.out.print("한 단어 입력: ");
		String word = sc.next();
		
		sc.nextLine();
		
		System.out.print("한줄 입력: ");
		String line = sc.nextLine();
		
		System.out.println("정수: " + num);
        System.out.println("실수: " + d);
        System.out.println("단어: " + word);
        System.out.println("한 줄: " + line);
		
	}

}
