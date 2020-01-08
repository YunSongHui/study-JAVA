package test_package;

public class TestMain {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		int a = 5;
		int b = 10;
		System.out.println(a+b); //a+b=15
		
		a++;
		b--;
		System.out.println(a); //a=6
		System.out.println(b); //a=9
		
		a--; //a=5
		System.out.println(a++); //값 참조 후에 증감 적용, a=5
		System.out.println(a); //a=6
		
		a--; //a=5
		System.out.println(++a); //값 참조 전에 증감 적용, a=6
		System.out.println(a); //a=6
	}

}
