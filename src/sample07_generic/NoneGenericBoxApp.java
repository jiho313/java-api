package sample07_generic;

public class NoneGenericBoxApp {
	
	public static void main(String[] args) {
		
		// 문자열을 담을 수 있는 NoneGenericBox 객체 생성하기
		NoneGenericBox box1 = new NoneGenericBox();
		
		// 박스객체에 문자열 저장하기
		box1.setItem("홍길동");
		
		// 박스객체에 저장된 문자열 조회하기
		String value = (String) box1.getItem(); // 오브젝트 객체가 반환되기 때문에 (String)으로 클래스 형변환해줘야 함
		System.out.println("박스에 저장했던 값 -> " + value);
	}
}
