package ex05;



/*
 * 멤버이너클래스 생성
 * 
 * */

interface Printable{
	void print();
}

class Papers{
	
	private String message;
	
	public Papers(String message) {
		this.message = message;
	}
	
	public Printable getPrintable(){
		return new Printer();
	}
	
	public class Printer implements Printable{  // 멤버이너클래스

		@Override
		public void print() {
			System.out.println(message);
		}
		
	}
	
}

public class MemberInnerClass{
	
	
	public static void main(String[] args) {
	
		Papers papers = new Papers("이 문장을 출력");
		
		Printable p = papers.getPrintable();
		p.print();
		
	}
	
	
}