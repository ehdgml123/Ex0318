package Ex07;

public class ClassB extends ClassA {
	 int b;
	
	public ClassB() {
		
	}
	
	public ClassB(int a,int b) {
		super(a);
		this.b = b;
	}
	
	public ClassB(int b) {
	//	super(0);
		this.b = b;
	}
	
	int getB() {
		return b;
	}
	
	@Override
	void info() {
		System.out.print(b + "");
	}

}
