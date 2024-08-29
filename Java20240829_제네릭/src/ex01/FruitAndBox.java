package ex01;


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


class AppleBox{
	
	private Apple ap;

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}
	
	
	
	
	
}


class OrangeBox{
	
	
	private Orange op;
	
	

	public Orange getOp() {
		return op;
	}

	public void setOp(Orange op) {
		this.op = op;
	}
	
	
}



public class FruitAndBox {

	public static void main(String[] args) {
		
		AppleBox Abox = new AppleBox();
		
		OrangeBox oBox = new OrangeBox();
		
		Abox.setAp(new Apple());
		oBox.setOp(new Orange());
		
		Apple ap = Abox.getAp();
		Orange op = oBox.getOp();
		
		System.out.println(ap);
		System.out.println(op);
		
	
		

	}

}
