package Ex6;

public class Singleton {

	
	// singleton 객체를 만들어 주고 static 으로 성언
	private static Singleton singleton = new Singleton();
	
	//이 클래스 밖에서는 new Singleton()으로 새로운 객체를 만들 수 없어
	public Singleton() {
		
	}
	
	// getInstance() 메소드 는 클래스를 사용할때 객체를 가져오는 방식
	// 메서드 를 호출하면 같은 객체 를 돌려준다
	public static Singleton getInstance() {
		
		 return singleton;
	}

	

}
