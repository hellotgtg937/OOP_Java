package ch06.task01;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while (run) {
			System.out.println("[계좌생성 실행 결과]");
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("--------------------------------------------");
			System.out.println("선택 > ");
			
			int menu = scan.nextInt();
			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				accountList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
	
	private static void createAccount() {
		System.out.println("----------------");
		System.out.println("계좌생성");
		System.out.println("----------------");
		
		System.out.println("계좌번호: ");
		String no = scan.next();
		
		System.out.println("계좌주: ");
		String name = scan.next();
		
		System.out.println("초기입금액: ");
		int balance = scan.nextInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account(no, name, balance);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
		
	}
	
	private static void accountList() {
		System.out.println("----------------");
		System.out.println("계좌목록");
		System.out.println("----------------");
		
		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.println("계좌번호: " + account.getNo());
				System.out.println("계좌 주: " + account.getName());
				System.out.println("초기금액: " + account.getBalance());
				System.out.println();
			}
		}
	}
	
	private static void deposit() {
		System.out.println("----------------");
		System.out.println("예금");
		System.out.println("----------------");
		
		System.out.print("계좌번호: ");
		String no = scan.next();
		System.out.print("예금액: ");
		int money = scan.nextInt();
		
		Account account = findAccount(no);
		
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다...");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println(money + "원이 예금 되었습니다.");
	}
	
	private static void withdraw() {
		System.out.println("----------------");
		System.out.println("출금");
		System.out.println("----------------");
		
		System.out.print("계좌번호 > ");
		String no = scan.next();
		System.out.print("출금액> ");
		int money = scan.nextInt();

		Account account = findAccount(no);
		
		if(account == null) {
			System.out.println("해당 계좌가 존재하지 않습니다...");
			return;
		}
		
		account.setBalance(account.getBalance() - money);
		System.out.println(money + "원이 출금 되었습니다.");
	}

	
	private static Account findAccount(String no) {
		Account account = null;
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbNo = accountArray[i].getNo();
				if(dbNo.equals(no)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}















