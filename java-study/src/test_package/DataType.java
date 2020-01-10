package test_package;

public class DataType {
	
	public static void main(String[] args) {
		
		String a = "hello"; 
		String b = "java";
		String c = "hello";
		
		System.out.println(a.equals(b));  //문자열 비교 시 무조건 equals를 사용해야 한다
		System.out.println(a.equals(c));
		
		
		
		String d = "hello"; //d와 e는 값은 같지만 서로 다른 객체
		String e = new String("hello"); //new는 객체를 만들 때 사용한다. 근데 그냥 String a = "text" 라고 쓰는게 편하다.
		
		System.out.println(d.equals(e)); //true
		System.out.println(d==e); //==는 두 개의 자료형이 동일한 객체인지를 판별하는 연산자이므로 false 리턴
		
	}

}
