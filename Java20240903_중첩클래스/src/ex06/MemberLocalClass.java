package ex06;



/*
 * 멤버로컬클래스 생성
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
	
		class Printer implements Printable{   // 멤버로컬클래스

			@Override
			public void print() {
				System.out.println(message);
			}
			
		}
		
		
		return new Printer();  // 객체를 생성하는  목적
	}
	
	
	
}

public class MemberLocalClass{
	
	
	public static void main(String[] args) {
	
		Papers papers = new Papers("이 문장을 출력");
		
		Printable p = papers.getPrintable();
		p.print();
		
	}
	
	
}