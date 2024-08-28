package ex02;

public class Bclass extends Aclass {
	
	String b;
	
	public Bclass() {
		
	}
	
	public Bclass(String b) {
		 this.b = b;
	}
	
	@Override
	 void func() {
		  System.out.println("가나다");
	  }

}
