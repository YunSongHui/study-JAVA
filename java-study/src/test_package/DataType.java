package test_package;

public class DataType {
	
	public static void main(String[] args) {
		
		String f = "Hello Java";
		System.out.println(f.replaceAll("Java","World")); //a.replaceAll("text1","text2") 문자열 a 중 특정 문자 text1 을 text2로 변환한다 
		System.out.println(f.replaceAll("a","e")); //동일한 문자가 있을 경우 모두 바뀐다
		
		System.out.println(f.toUpperCase()); //문자열을 모두 대문자로 바꾼다
		System.out.println(f.toLowerCase()); //문자열을 모두 소문자로 바꾼다
		
	}

}
