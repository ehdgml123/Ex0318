package Ex06;


class abc{
	  
	// 변수 생성
	private String name;
  
	private int age;
	
	private String phone;
	

   static String job = "대한민국 배우"; //정적변수
   
   static void change(String _job) {  //정적메소드
	   job = _job;
   }



public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getPhone() {
		return phone;
		
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




//호출
abc(String name, int age, String phone){
	this.name = name;
	this.age = age;
	this.phone = phone;
}

   

	
	// 매개변수 없는 값이 디폴트 생성자
	abc(){
		System.out.println("디폴트 생성자");
	}
	
   // this 자기 객체를 호출
	abc(String n){
//		name = n;
//		age = 10;
//		phone = "010-9999-9999";
		this(n,10,"000-9999-2222");
		
	}
	
	abc(String n, int a){
//		name = n;
//		age = a;
//		phone = "010-9999-9999";
		this(n,a,"000-1111-2222");
	}
	
	//read --> get+변수명
	void nameInfo() {
		System.out.println("이름:"+ name);
		
	}
	
	void nameChange(String _name) {
		this.name = name;
	}
	
	String getName() {    //getter
		return name;
	}
	
	void setName(String name) {        //setter
		 this.name = name;
	}
	
	
	
	
	// 값을 반환하지 않음을 의미. 이 메서드는 호출되면 어떤 값을 돌려주지 않고 작업만 수행합니다.
	void info() {
		System.out.printf("이름: %s, 나이: %d, 전화번호:%s\n", name , age, phone);
	}
	
	void 입실() {
		System.out.println("입실하다");
	}
	
	void 퇴실() {
		System.out.println("퇴실하다");
	}
	
	void 조회() {
		System.out.println("조퇴하다");
	}	
}
	
