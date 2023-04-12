package sample03_string;

public class StringApp1 {

	public static void main(String[] args) {
		
		// String 객체 생성하기
		// 1. 문자열 리터럴을 이용해서 String객체를 생성하고 초기화하기
		String str1 = "홍길동";
		String str2 = "홍길동";
		// 2. new 키워드를 이용해서 String객체를 생성하고, 생성자 메소드로 초기화하기
		String str3 = new String("홍길동"); // 보통 사용되지 않음
		String str4 = new String("홍길동");
		
		// 생성된 객체의 주소값 비교하기
		
		// 동일성 비교 - 주소값 비교		
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		
		// 동등성 비교 - 내용 비교
		// 여기서 equals()메소드는 Object클래스에서 String 클래스로 상속받아 재정의되었다.
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str3));
	}
}
