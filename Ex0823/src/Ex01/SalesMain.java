package Ex01;

public class SalesMain extends Preson {
	
	String com;
	int pri;
	
	public SalesMain(String name,int age,String com, int pri) {
		// 부모클래스 생성자 호출
		super(name,age);
		this.com = com;
		this.pri = pri;
	}
	
	public void by() {		
		System.out.println(name + "구매자"+ age + "나이");
		System.out.println(com + "구매"+ pri + "가격은");
	}
	
	@Override
	public void in() {
		// 부모 클래스 메소드를 하위 클래스 에 재정의 하는것
		super.in();
	}

}
