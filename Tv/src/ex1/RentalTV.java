package ex1;



public class RentalTV extends TV implements Rentable  {

	 int price;
	 
	  public RentalTV() {
		
	 }
	  
	  public RentalTV(String model, int size, int channel, int price) {
			super(model, size, channel);
			this.price = price; 
		}
	  
	  
	  public void play() {
			channerUp();
			System.out.printf("판매 TV 채널 %s 번의 프로를 플레이 합니다.", getChannel());
		}
	  
	  
	
	
	@Override
	public void rent() {
		System.out.printf(getModel()+ "\n모델의 상품을 대여합니다"+price+ "을 지불해주세요");
		
	}
	
	@Override
	public String toString() {
		 return "대여 상품 정보 모델명: " + model +"가격"+price+ ", 크기: " + size;
    }

	
 
	
}
