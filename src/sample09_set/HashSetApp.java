package sample09_set;

import java.util.HashSet;

public class HashSetApp {

	public static void main(String[] args) {
		// HashSet의 주요 API
		HashSet<String> names = new HashSet<>();
		
		// 객체 저장하기
		// String을 담았고 String객체는 해시코드, 이퀄즈 메소드가 재정의 되어있기 때문에 같은게 들어있으면
		// Set자료구조 클래스에서 해시코드를 비교하여 중복으로 판단하고 제외시킨다. Wrapper클래스(기본자료형)도 마찬가지다.
		names.add("김유신");
		names.add("강감찬");
		names.add("강감찬");
		names.add("강감찬");
		names.add("이순신");
		names.add("류관순");
		names.add("안중근");
		
		// 저장된 객체의 갯수를 조회하기
		int count = names.size();
	
		System.out.println("저장된 객체의 갯수 -> " + count);
		// HashSet객체에 지정된 객체가 존재하는지 조회하기
		boolean isExist = names.contains("이순신");
		System.out.println("이순신이 포함되어 있는가? -> " + isExist);
		
		// 향상된 for문으로 저장된 객체를 반복처리하기
		System.out.println("### 향상된 for문으로 저장된 객체를 조회하기"); 
		for (String name : names) {
			System.out.println("이름 -> " + name);
		}
		
		// 저장된 객체 삭제하기
		names.remove("강감찬");
		
		// 향상된 for문으로 저장된 객체를 반복처리하기
		System.out.println("### 삭제 후 저장된 이름 확인하기");
		for (String name : names) {
			System.out.println("이름 -> " + name);
		}
		
	}
}
