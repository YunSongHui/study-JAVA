package test_package;

public class DataType {
	
	public static void main(String[] args) {
		
		//배열이란 자료형의 종류가 아닌 자료형의 집합을 의미
		int[] odds = {1,3,5,7,9}; //배열은 자료형[]으로 표현
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		
		//배열 값 접근
		System.out.println(odds[2]); //배열의 0번째 값부터 세어 3번째 값 출력
		
		//배열의 길이는 .length를 사용
		for (int i=0; i<weeks.length; i++) {
			System.out.println(weeks[i]);
		}
		
	}
	
}
