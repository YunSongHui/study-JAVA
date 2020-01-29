package test_package;

public class DataType {
	
	public static void main(String[] args) {
		
		//StringBuffer 사용
		StringBuffer sb = new StringBuffer(); //객체 생성
		
		sb.append("hello"); 		//문자열 추가
		sb.append(" "); 			//문자열 추가
		sb.append("jump to java");  //문자열 추가
		sb.append(" !"); 			//문자열 추가
		
		System.out.println(sb.toString()); //toString() : String 자료형으로 변경
		
		
		//String 사용
		String temp = ""; //객체 생성
		
		temp += "hello"; 		//객체 생성(String 자료형에 + 연산이 있을 때마다 새로운 String 객체 생성)
		temp += " "; 			//객체 생성
		temp += "jump to java"; //객체 생성
		temp += " !"; 			//객체 생성
		
		System.out.println(temp);
	}

}
