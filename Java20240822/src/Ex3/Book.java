package Ex3;

public class Book {

	String title;
	String author;
	int page;
	
	Book(){}
	
    Book(String title, String author){
		
		this.title = title;
		this.author = author;
		
	}
	
	Book(String title, String author, int page){
		
		this.title = title;
		this.author = author;
		this.page = page;
		
	//	page = this.page;  오류
	}
	
	void displayInfo(){
		 System.out.println("책:"+ title + "저자:"+ author+"페이지 수" + page);
	}

}
