package test_package;

public class DataType {
	
	public static void main(String[] args) {
		
		String str = new String("hello java");
		StringBuffer sb = new StringBuffer("hello java");

		sb.replace(0,1,"H"); //StringBuffer sb 객체의 값 자체가 바뀐다
		String str2 = str.replace('h','H'); //String str2 라는 새로운 객체 생성

		System.out.println(sb);
		System.out.println(str);
		System.out.println(str2);

	}

}
