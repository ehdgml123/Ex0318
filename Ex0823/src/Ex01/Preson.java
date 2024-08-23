package Ex01;

public class Preson {
	
	String name;
	int age;
	
	public Preson() {
		
	}
	
	public Preson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void in() {
		System.out.println("이름은"+ name + "나이는"+ age);
	}
	
	public void dde() {
		System.out.println(name + "가 걷는다");
	}
	
	

}
