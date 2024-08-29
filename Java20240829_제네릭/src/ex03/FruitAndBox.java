package ex03;


class Apple{

	
	
	@Override
	public String toString() {
		
		return  "I am an apple";
	}
	
}

class Orange{
	
	@Override
	public String toString() {
		
		return "I am an orange";
	}
	
}


class Box<T>{    // 제네릭 기반의 클래스 정의
	
	private T obj;
	
	

	public T getobj() {
		return obj;
	}

	public void setobj(T obj) {
		this.obj = obj;
	}
	
	
	
	
	
}





public class FruitAndBox {

	public static void main(String[] args) {
		
		
		// 박스 클래스 에 <T> 타입이 <Apple> 타입으로 변경 됨 
		Box<Apple> aBox = new Box<Apple>();
		aBox.setobj(new Apple());
		Apple ap = aBox.getobj();
		System.out.println(ap);
		
		
		Box<Orange> oBox = new Box<Orange>();
		oBox.setobj(new Orange());
		Orange op = oBox.getobj();
		System.out.println(op);
		
		Box<String> sBox = new Box();
		sBox.setobj("korea");
		String str = sBox.getobj();
		System.out.println(str);
		
		
		
		
		
//		Box aBox = new Box();
//		
//		aBox.setobj(new Apple());
//		
//		Apple ap = (Apple)aBox.getobj();
//		
//		System.out.println(ap);
	     
		

	}

}
