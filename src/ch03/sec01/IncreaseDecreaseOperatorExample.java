package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z;
		
		x++; //10
		++x; 
		System.out.println("x=" + x); //12
		System.out.println("----------------------");
		
		y--;
		--y;
		System.out.println("y=" + y); //8
		System.out.println("----------------------");
		
		z = x++;
		System.out.println("z=" + z); //12 한번 값이 저장되면 이후 변화와 무관
		System.out.println("x=" + x); //13
		System.out.println("----------------------");
		
		z = ++x;
		System.out.println("z=" + z); //14
		System.out.println("x=" + x); //14
		System.out.println("----------------------");
		
		z = ++x + y++; 
		System.out.println("z=" + z); //23
		System.out.println("x=" + x); //15
		System.out.println("y=" + y); //9
	}

}
