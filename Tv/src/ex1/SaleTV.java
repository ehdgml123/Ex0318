package ex1;

public class SaleTV extends TV{
	
	int price;
	
	public SaleTV() {
		// TODO Auto-generated constructor stub
	}
	
	public SaleTV(String model, int size, int channel, int price) {
		super(model, size, channel);
		this.price =price;
	}
	
	@Override
   public void channerUp() {
		int s = getChannel()+1;
		if(s >10)
			s=1;
		setChannel(s);
	}
	
	
	@Override
    public void channerDown() {
		int s = getChannel()-1;
		if(s < 10)
			s=1;
		setChannel(s);
	}
	
	
	
	
	public void play() {
		channerUp();
		System.out.printf("판매 TV 채널 %d 번의 프로를 플레이 합니다.\n", getChannel());
	}
	
	public void sale() {
		System.out.println(getModel()+ "모델의 상품을 판매합니다"+ price + " 지불해주세요");
	}
	
	@Override
	public String toString() {
        return "판매 상품 정보 모델명: " + model +"가격"+price+ ", 크기: " + size;
    }
	
	
	

}
