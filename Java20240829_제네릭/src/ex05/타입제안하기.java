package ex05;


class A{
	
}

class B extends A{
	
}

class C extends A{
	
	
}

       // T 에 전달될 수 있는 대상은 A 거나 A 하위(자손) 클래스만 가능
class Box<T extends A>{
	
	private T obj;
	
	

	public T getObj() {
		return obj;
	}
	
	

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}




public class 타입제안하기 {

	public static void main(String[] args) {
		
		
		
		
		Box<A> aBox = new Box();
		Box<B> bBox = new Box();
		Box<C> cBox = new Box();
		
		aBox.setObj(new A());
		A a =aBox.getObj();

		aBox.setObj(new B());
		B b = (B)aBox.getObj();
		
		aBox.setObj(new C());
		C c = (C)aBox.getObj();
		
 //		Box<String> = new Box(); -> 오류
		
		
		

	}

}
