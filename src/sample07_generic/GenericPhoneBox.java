package sample07_generic;

public class GenericPhoneBox<T extends Phone> {
	// 타입 파라미터의 종류를 제한하고 싶을 때 클래스를 상속 받는다.
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
}
