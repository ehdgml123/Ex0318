package test;

public class Container<T> {

	private T Item;
	


	public T getItem() {
		return Item;
	}

	public void setItem(T item) {
		Item = item;
	}
	
	public  boolean isEmpty(){
		if(Item == null) {
			return true;
		}
		
		return false;
	}

	
	
	
	
	
}
