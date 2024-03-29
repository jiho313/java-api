package sample08_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp3 {

	public static void main(String[] args) {
		// ArrayList객체의 주요 API
		
		// 인터페이스를 기준으로 객체 생성하기 클래스 형변환, 메소드 재정의, 다형성 관련
		// List객체 생성하기
		ArrayList<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = List.of("jone", "eddy", "adam", "jane", "liz"); 
//		ArrayList<String> list4 = List.of("박정아","문정원","배유나"); // List<String>타입의 객체를 ArrayList<String>타입의 참조변수에 대입할 수 없다. 부모는 자식 타입에 대입할 수 없다.
		
		// List객체에 객체 추가하기
		list1.add("김유신");
		list1.add("강감찬");
		list1.add("강감찬");
		list1.add("이순신");
		list1.add("강감찬");
		list1.add("류관순");
		list1.add("안중근");
		
		// List객체 객체 추가하기
//		list3.add("alexsandra");	// List.of()로 생성한 List객체는 수정할 수 없다.
		
		// List객체에 저장된 객체의 갯수를 조회하기
		int len = list1.size();
		System.out.println("List객체에 저장된 객체의 갯수 -> " + len);
		
		// List객체가 비어있는지 조회하기
		boolean empty1 = list1.isEmpty();
		boolean empty2 = list2.isEmpty();
		System.out.println("첫번째 List객체 비어있는가? -> " + empty1);
		System.out.println("두번째 List객체 비어있는가? -> " + empty2);
		
		// List객체의 모든 객체 삭제하기
		System.out.println("첫번째 List객체의 모든 객체 삭제하기");
		list1.clear();
		System.out.println("List객체에 저장된 객체의 갯수 -> " + list1.size());
		
	}
}
