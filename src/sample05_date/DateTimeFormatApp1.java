package sample05_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatApp1 {
	
	public static void main(String[] args) {
		
		/*
		 * java.text.SimpleDateFormat
		 *  - Date객체의 날짜와 시간정보를 지정한 형식의 문자열로 변환한다.
		 *  - 날짜형식의 문자열을 해석해서 Date객체로 변환한다.
		 *  
		 *  주요 API
		 *  	생성자
		 *  		SimpleDateFormat(String pattern)
		 *  			지정된 패턴으로 초기화된 SimpleDateFormat객체를 생성한다.
		 *  	메소드
		 *  		String format(Date date)
		 *  			Date객체의 날짜와 시간정보를 지정된 패턴의 문자열로 변환한다.
		 *  		Date parse(String text)
		 *  			지정된 날짜형식으로 작성된 문자열을 Date객체로 변환한다.
		 *  
		 *  주요 패턴 문자
		 *  	y	년도(year)
		 *  	M 	월(month)
		 *  	w	주(week of year)
		 *  	W	주(week of month)
		 *  	d	일(day of month: 1 ~ 31)
		 *  	D 	일(day of year: 1 ~ 365)
		 *  	E 	요일
		 *  	a	오전 혹은 오후
		 *  	H	시간(0 ~ 23)
		 *  	h	시간(1 ~ 12)
		 *  	m	분
		 *  	s	초
		 *  	S	밀리초
		 */
		
		// 시스템의 현재 날짜와 시간정보를 표현하는 Date객체 생성하기
		Date now = new Date();
		System.out.println("포맷팅하기 전 ->" + now); 
		
		// 날짜와 시간 패턴 지정하기
		String pattern1 = "yyyy-MM-dd";
		String pattern2 = "yyyy년 MM월 dd일";
		String pattern3 = "yyyy년 MM월 dd일 EEEE";
		String pattern4 = "HH:mm:ss";
		String pattern5 = "a h시 m분 s초";
		String pattern6 = "yyyy-MM-dd HH:mm:ss";
		String pattern7 = "yy년 M월 d일 EEEE a h시 m분 s초";
		
		// SimpleDateFormat객체를 생성하고 패턴 정보를 전달받아서 초기화하기
		// 선수 작업 적용하고픈 패턴으로 초기화 해줘야 한다.
		SimpleDateFormat sdf1 = new SimpleDateFormat(pattern1);
		SimpleDateFormat sdf2 = new SimpleDateFormat(pattern2);
		SimpleDateFormat sdf3 = new SimpleDateFormat(pattern3);
		SimpleDateFormat sdf4 = new SimpleDateFormat(pattern4);
		SimpleDateFormat sdf5 = new SimpleDateFormat(pattern5);
		SimpleDateFormat sdf6 = new SimpleDateFormat(pattern6);
		SimpleDateFormat sdf7 = new SimpleDateFormat(pattern7);
		
		// Date객체(날짜와 시간정보)를 지정된 패턴형식으로 문자열로 변환하기
		// 원하는 패턴으로 초기화된 SimpleDateFormat객체의 format메소드에 포맷전 Date객체 입력
		String text1 = sdf1.format(now);
		String text2 = sdf2.format(now);
		String text3 = sdf3.format(now);
		String text4 = sdf4.format(now);
		String text5 = sdf5.format(now);
		String text6 = sdf6.format(now);
		String text7 = sdf7.format(now);
		System.out.println("포맷팅된 날짜와 시간정보 -> " + text1);
		System.out.println("포맷팅된 날짜와 시간정보 -> " + text2);
		System.out.println("포맷팅된 날짜와 시간정보 -> " + text3);
		System.out.println("포맷팅된 날짜와 시간정보 -> " + text4);
		System.out.println("포맷팅된 날짜와 시간정보 -> " + text5);
		System.out.println("포맷팅된 날짜와 시간정보 -> " + text6);
		System.out.println("포맷팅된 날짜와 시간정보 -> " + text7);
	}

}
