package assignments;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
				System.out.print("예금액>");
				int deposit = Integer.parseInt(sc.nextLine());
				balance += deposit;
				
			} else if(strNum.equals("2")) {
				System.out.print("출금액>");
				int withdraw = Integer.parseInt(sc.nextLine());
				if (balance < withdraw) {
					System.out.println("잔고가 부족합니다.");
				} else {
					balance -= withdraw;
				}
				
			} else if(strNum.equals("3")) {
				System.out.println("잔고>" + balance);
				
			} else if(strNum.equals("4")) {
				run = false;
				
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
