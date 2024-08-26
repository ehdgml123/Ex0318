package Ex2;

class Animal{
    
	  private String name; // 멤버변수, 인스턴스 변수 => 생성된 객체들이 개별적 가지고 있음
	  
	  private static int count; // 정적변수, 클래스변수  => 공유차원
	  
	  public Animal() {
		 this("동물");
	  }
	  
	  //생성자()
	  public Animal(String name) {
		  this.name = name;
	  }
	
	 void soeak() {
		 
	 }
	 
	 void info() {  // 메소드, 인스턴스 메소드 
		 
		 System.out.println(name+"입니다."); 
		 count++;   // 정적변수 가능
		 staticInfo();  // 정적 메소드 가능
	 }
	 
	 
	  // 멤버변수 는 접근금지, 정적변수 접근 가능
	 static void staticInfo() { // -> 정적 메소드, 클래스 메소드             
		 // name = "동물" -> 사용불가
		 count++; // 정적변수 이므로 접근 가능
		// intfo(); -> 사용불가
	 }
	
}


public class Animalmain {

	public static void main(String[] args) {
	
		int num = 10;
		
	    Animal animal = new Animal("동물");  // 객체생성, 인스턴스생성
	 
	     animal.info();
	     
	     Animal animal2 = new Animal();
	     animal.info();

	}

}
