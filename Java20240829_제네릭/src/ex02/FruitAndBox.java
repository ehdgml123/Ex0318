package ex02;


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


class Box{
	
	private Object obj;
	
	

	public Object getobj() {
		return obj;
	}

	public void setobj(Object obj) {
		this.obj = obj;
	}
	
	
	
	
	
}





public class FruitAndBox {

	public static void main(String[] args) {
		
		Box aBox = new Box();   // 사과 담은 박스
		Box oBox = new Box();   // 오렌지 담은 박스
		
		aBox.setobj(new Apple());
		oBox.setobj(new Orange());
		
		 Apple ap= (Apple)aBox.getobj();    // 형변환해랴하는 불편함.....
		 
		 Orange op = (Orange)oBox.getobj();
		 
		 System.out.println(ap);
		 System.out.println(op);
	
		

	}

}
