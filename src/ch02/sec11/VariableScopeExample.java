package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		int v2 = 0; //선언 후 초기화를 해줘야 함. 선언만 하고 if 블록에서 초기화할 시 if문이 false일 때는 초기화를 못하니까 오
		
		if (v1 > 10) {
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
	}

}
