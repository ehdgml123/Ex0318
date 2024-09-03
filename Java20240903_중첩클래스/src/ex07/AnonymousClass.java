package ex07;



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
	
//		class Printer implements Printable{   // 멤버로컬클래스
//
//			@Override
//			public void print() {
//				System.out.println(message);
//			}
//			
//		}
		
		
//		 Printable p = new Printable() {        // 익명 클래스          // Printable 를 구현한 클래스지만 이름이 없는 것 
//			
//			@Override
//			public void print() {
//				System.out.println(message);
//			}
//		};
//		
//		return p;
//	}
		
		return new Printable() {  // 익명클래스 

			@Override
			public void print() {
				System.out.println(message);
			}
		};
	
	}
	
}

public class AnonymousClass{
	
	
	public static void main(String[] args) {
	
		Papers papers = new Papers("이 문장을 출력");
		
		Printable p = papers.getPrintable();
		p.print();
		
	}
	
	
}