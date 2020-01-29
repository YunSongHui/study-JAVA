package test_package;

public class DataType {
	
	public static void main(String[] args) {
		
		StringBuffer mybuffer = new StringBuffer(); //객체 생성
		
		mybuffer.append("hello"); //append : 문자열추가
		mybuffer.append(" ");
		mybuffer.append("jump to java");
		mybuffer.append(" !");
		
		mybuffer.insert(0, "Oh "); //insert : 0번째 위치에 삽입
		
		System.out.println(mybuffer.toString()); //toString() : String자료형으로 변경
		
		System.out.println(mybuffer.substring(3,7)); //substring : 3번째 위치부터 7번째 위치까지의 문자열 출력
		
	}

}
