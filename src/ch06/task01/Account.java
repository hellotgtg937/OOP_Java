package ch06.task01;

public class Account {
	
	private String no;
	private String name;
	private int balance;
	
	public Account (String no, String name, int balance) {
		this.no = no;
		this.name = name;
		this.balance = balance;
	}
	
	public String getNo() {
		return no;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
