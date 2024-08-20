package Ex06;

public class book {

	public static void main(String[] args) {
	
		BookClass a1 = new BookClass();
		a1.필드 = "필드";
		a1.제목 = "가나다";
		a1.저자 = "김동희";
		a1.price = 1000;
		a1.재고수량 = 10;
		a1.판매(2);
		a1.입고(5);
		a1.총판매금액();
		a1.info();
		
	}

}

class BookClass{
	
	String 필드;
	String 제목;
	String 저자;
	int price;
	int 재고수량;
	int 판매누적수량;
	
	
	void 판매(int price1){
		재고수량 -= price1;
		판매누적수량 += price1;
		System.out.println("판매:" + price1);
	}
	void 입고(int price1){
		재고수량 += price1;
	}
	void 총판매금액(){
		System.out.println(판매누적수량 * price);
	}

    void info() {
    	 System.out.println("제목:"+제목 +",저자:"+저자+",가격"+price+",재고수량"+ 재고수량);
    }
	
}
