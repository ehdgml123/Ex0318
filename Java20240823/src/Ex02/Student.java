package Ex02;

//final class Student -> Student 클래스 상속불가
//public final class Student extends Person 
public class Student extends Person{
	
	
	private String school;
	private String StudentID;
	
	public Student() {
		
	}
	
	
	// 매개변수 로 받는 인자 값 
//	public Student(String school, String StudentID) {
//   		this.school = school;
//		this.StudentID = StudentID; 
//		
//	}
	
	public Student(String name,int age,String school, String StudentID) {
		super(name, age); // 상위클래스(Person) 생성자 호출 구분
		this.school = school;
		this.StudentID = StudentID; 
		
	}
	
	@Override // @: 어노테이션, @Override -> 상위클래스 메소드를 하위클래스가 재정의했다
	public void introduce() {
		// 부모 클래스 에 잇는 introduce 메소드 sysout 을 재정의 할수있다.(한마디 로 복사)
		super.introduce();
		System.out.printf("학교는 %s이고, 학변은%s 입니다.\n", school, StudentID);
		
	}
	
	
	
	public void study() {
		System.out.println(name + "이(가) 공부하고 있습니다");
	}
	

}
