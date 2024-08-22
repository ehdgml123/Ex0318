package Ex07;

 class myClass {

		// 클래스 변수(정적변수) - 모든 인스턴스 가 공유하는 변수
		static String classVariable = "This is an instance variable";
		
		// 인스턴스 변수, 각 객체가 고유하게 가질 수 있는 변수입니다.
		String instanceVariable;
		
		// 생성자 -객체가 생성될때 호출됨(인스턴스 변수를 초기화 하는 역)
		myClass(String instanceVariable){
			this.instanceVariable = instanceVariable;
		}
		
	// 인스턴스 메소드	-> 인스터스변수, 인스턴스메소드, 클래스 변수, 클래스메소드 다 접근가능
   void instanceMethod() {
	   System.out.println("This is an instance method");
	   System.out.println("Instance variable:"+ instanceVariable);
	   System.out.println("Class variable:" + classVariable);
	   
	   // 정적 메소드 호출
	   myClass.classMethod();
   }
   
   // 클래스 메소드 (정적 메소드)--> 접근 가능영역은 클래스변수(정적변수), 클래스메소드만 가능
// --> 인스턴스메소드 , 인스턴스변수 접근 불가
   static void classMethod() {
	    System.out.println("This is a class method");
	    System.out.println("Class variable :" + classVariable);
	    
	    // 인스턴스 생성 후 인스턴스 메서드 호출
	    myClass myInstance = new myClass("Instance variavle from class method");
	    		myInstance.instanceMethod();;
   }

	}


// 설명
 /*
  * static String classVariable = "This is an instance variable";
  * */
  