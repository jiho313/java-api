package sample02_system;

public class SystemApp1 {
	
	public static void main(String[] args) {
		
	
	// String getenv(String name) 
	System.out.println("### 자바 경로 ###");
	String getEnv = System.getenv("JAVA_HOME");
	System.out.println(getEnv);
		
	System.out.println("### 시스템 프로퍼티 값 ###");
	// String getProperty(String name) - 지정된 이름의 시스템프로퍼티값을 반환한다.
	// Properties getProperties() - 시스템의 모든 프로퍼티값을 Properties객체에 담아서 반환한다.
	String fileSeparator =  System.getProperty("file.separator");
	System.out.println("폴더 구분 문자-> " +   fileSeparator);
	String lineSeperator = System.getProperty("line.separator");
	System.out.println("줄바꿈 문자 -> " + lineSeperator);
	// 줄바꿈 문자는 System.lineSeparator() 메소드를 실행해도 획득할 수 있다.
//	String lineSeparator = System.lineSeparator();
	
	}
}
