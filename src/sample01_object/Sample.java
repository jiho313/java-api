package sample01_object;

import java.util.Objects;

/*
 * Sample은 Object를 상속받는 클래스다.
 * 	- Object 클래스에 정의된 메소드를 상속받는다.
 * 		* public Calss<?> getClass() { ... }
 * 		* public boolean equals(Object obj) { ... }
 * 		* public int hashCode() { ... }
 * 		* public String toString() { ... }
 * 		* protected Object clone() { ... }
 */

public class Sample implements Cloneable{ // 마크업은 상속만 받으면 됨 메소드 바디를 구현할 필요 없음

	private int no;
	private String name;
	
	public Sample() {}
	public Sample(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Sample copy() {
		try {
			Object obj = clone();
			return (Sample) obj; // Sample객체에 담기위해 형변환
		} catch(CloneNotSupportedException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	// 동등한 비교가 가능하도록 hashCode()와 equals() 재정의하기
	// 내가 지정한 객체의 값이 비교하는 값과 같다면 해시코드도 같게 만든다.
	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sample other = (Sample) obj;
		return Objects.equals(name, other.name) && no == other.no;
	}
	
	/*
	 * Object의 toString() 메소드 재정의하기
	 * 	- 객체가 현재 상태(멤버변수에 저장된 값)를 문자열로 반환하도록 재정의해서 사용한다.
	 * 
	 */
	@Override
	public String toString() {
		return "Sample [no=" + no + ", name=" + name + "]";
	}
	

}
