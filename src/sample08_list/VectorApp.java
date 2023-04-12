package sample08_list;

import java.util.ArrayList;
import java.util.Vector;

public class VectorApp {

	public static void main(String[] args) {
		VectorSample sample1 = new VectorSample(); // 멀티스레드 환경은 벡터
		ArrayListSample sample2 = new ArrayListSample(); // 단일 스레드 환경은 리스트
		
//		Thread t1 = new Thread(sample1, "t1");
//		Thread t2 = new Thread(sample1, "t2");
//		Thread t3 = new Thread(sample1, "t3");
//		Thread t4 = new Thread(sample1, "t4");
//		Thread t5 = new Thread(sample1, "t5");
		
		Thread t1 = new Thread(sample2, "t1");
		Thread t2 = new Thread(sample2, "t2");
		Thread t3 = new Thread(sample2, "t3");
		Thread t4 = new Thread(sample2, "t4");
		Thread t5 = new Thread(sample2, "t5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		
//		sample1.insertNumber();
//		sample2.insertNumber();
		
	}
	
	static class VectorSample implements Runnable{
		Vector<Integer> numbers = new Vector<>();
		
		public void run( ) {
			for (int i=0; i<1000; i++) {
//				System.out.println("vectorsample -> " + i);
				System.out.println(Thread.currentThread().getName() + " -> " + i);
				numbers.add(i);
			}
		
		}
	}
	
	static class ArrayListSample implements Runnable{
		ArrayList<Integer> numbers = new ArrayList<>();
		public void run( ) {
			for (int i=0; i<1000; i++) {
//				System.out.println("arraylistsample -> " + i);
				System.out.println(Thread.currentThread().getName() + " -> " + i);
				numbers.add(i);
			}
		}
	}
}
