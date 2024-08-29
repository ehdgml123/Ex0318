package ex12;


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
	
	 
	 //Box<? super B> => 와일드 카드 하한 제한 => box 대입 할수 있는 대상은 B 거나 B 상위 클래스
	// 기능 => set 만 가능 => 저장
	 public static void peekBox(Box<? super B> box) {
		 System.out.println(box);
		 box.getObj();
		 box.setObj(new B());
	 }
	
}





public class 하한제한와일드카드01{

	public static void main(String[] args) {
	
	   Box<A> a = new Box();
	   Box<B> b = new Box();
	   Box<C> c = new Box();
	   Box<Object> o = new Box();
	 
	   
	   
	   // b 기준 하위클래스만 
	   BoxFactory.peekBox(a);
	   BoxFactory.peekBox(b);
	//   BoxFactory.peekBox(c);
	   BoxFactory.peekBox(o);
		
		
	}
	 
}
