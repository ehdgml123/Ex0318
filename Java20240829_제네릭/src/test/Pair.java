package test;

public class Pair<T, M> {
	
	private T First;
	private M Second;
	
	
	public T getFirst() {
		return First;
	}
	public void setFirst(T first) {
		First = first;
	}
	public M getSecond() {
		return Second;
	}
	public void setSecond(M second) {
		Second = second;
	}
	@Override
	public String toString() {
		return "Pair [First=" + First + ", Second=" + Second + "]";
	}
	
	

}
