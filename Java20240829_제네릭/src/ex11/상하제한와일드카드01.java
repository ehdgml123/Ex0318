package ex11;


class Box<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	@Override
	public String toString() {
		
		return obj.toString();
	}
	
}

class A{}
class B extends A{}
class C extends B{}

class BoxFactory{
	
	 
	 //(Box<? extends Number> => 와일드 카드 사용 제한
	 // 기능 => get 만 가능   => 호출
	 public static void peekBox(Box<? extends B> box) {
		 System.out.println(box);
		 box.getObj(); //-> 이것만 가능
	 }
	
}





public class 상하제한와일드카드01{

	public static void main(String[] args) {
	
	   Box<A> a = new Box();
	   Box<B> b = new Box();
	   Box<C> c = new Box();
	   
	   // b 기준 하위클래스만 
//	   BoxFactory.peekBox(a);
	   BoxFactory.peekBox(b);
	   BoxFactory.peekBox(c);
		
		
	}
	 
}
