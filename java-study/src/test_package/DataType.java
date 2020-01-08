package test_package;

public class DataType {
	
	public static void main(String[] args) {
		
		int base = 150;
		double height = 153.6;
		boolean isTall = height > base; //부울 자료형에 대입되는 값은 참(true) 또는 거짓(false)만 가능
		
		if  (isTall) { //isTall이 true일때
			System.out.println("I am tall."); //출력
		}
		else System.out.println("No..."); //false일때 출력
		
		
		
		char a = 'a'; //한 개의 문자형 변수. 문자값을 ''로 감싸주어야 함
		char b = 97; //아스키코드값에 대입하는 문자를 문자형으로 출력
		char c = '\u0061'; //유니코드값에 대입하는 문자를 문자형으로 출력
		
		System.out.println(a); //a 출력
		System.out.println(b); //a 출력
		System.out.println(c); //a 출력
		
		
		
		
		
	}

}
