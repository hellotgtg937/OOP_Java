package ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		int pieceUnit = 10;
		int number = 7;
		
		int result = apple * pieceUnit - number;
		System.out.println("사과 10조각에서 남은 조각: " + result);
		System.out.println("사과 1개에서 남은 양: " + (result / 10.0));
		

	}

}
