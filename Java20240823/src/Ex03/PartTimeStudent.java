package Ex03;

// 학생 중 알바하는 학생
public class PartTimeStudent extends Student{

	
	String job;
	String pay;
	
	public PartTimeStudent() {
		
	}
	
   public PartTimeStudent(String name, int age, String school, String StudentID, String job, String pay ) {
	   super(name, age, school, StudentID);
	   this.job = job;
	   this.pay = pay;
   }
	
	public void work() {
		System.out.println("근무 중!");
		System.out.printf("이름:%s,나이는%d , 학교는:%s , 학교번호:%s 구내서점:%s , 가격:%s\n",name,age,school,StudentID,job,pay );
	}
	
	public void job() {
		System.out.printf("아르바이트는 %s, 시간당%s", job, pay);
	}
	
	
}
