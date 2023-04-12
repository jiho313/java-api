package sample08_list;

import java.util.ArrayList;

public class ArrayListApp1 {

	public static void main(String[] args) {
		
		// 배열과 ArrayList<E>의 비교
		
		// 문자열을 저장할 수 있는 배열객체와 ArrayList객체 생성하기
		String[] arr = new String[5];
		ArrayList<String> list = new ArrayList();
		
		// 배열객체에 문자열 저장하기 - 배열객체에 값을 저장하기 위해서는 항상 인덱스를 알고 있어야 한다.
		arr[0] = "Jhon";
		arr[1] = "Jane";
		arr[2] = "Alexandra";
		arr[3] = "Julia";
		arr[4] = "David";
//		arr[5] = "Eddy";
//		arr[6] = "Liz";
		
		// ArrayList객체에 문자열 저장하기 - 인덱스를 사용하지 않고 ArrayList객체에 값을 저장할 수 있다.
		list.add("Jhon");
		list.add("Jane");
		list.add("Alexandra");
		list.add("Julia");
		
		// 배열에 저장된 값 출력하기 - 값을 넣지 않은 인덱스를 포함하여 배열의 끝까지 출력함
		// enhanced-for문의 배열의 처음부터 끝까지 모든 요소를 반복처리한다.
		// arr[4]은 null이기 때문에 반복문을 실행하여 arr[4]까지 도달하여 실행하려 했을 때 에러가 발생한다.
		System.out.println("### 배열객체에 저장된 값 출력하기");
		for (String value : arr) {
			if (value == null) {
				break;
			}
			System.out.println(value + " -> " + value.toUpperCase());
		}
		System.out.println();
		
		// ArrayList객체에 저장된 값 출력하기 - 저장한 것 만큼만 출력함
		// enhanced-for문은 ArrayList에 저장된 요소의 갯수만큼만 반복처리한다.
		System.out.println("### ArrayList객체에 저장된 값 출력하기");
		for(String value : list) {
			System.out.println(value + " -> " + value.toUpperCase());
		}
	}
}
