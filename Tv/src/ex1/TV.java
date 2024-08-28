package ex1;

public class TV {
	
	String model;
	
	int size;
	
	int channel;
	
	public TV() {
		
	}
	
	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	}
	
	public void channerUp() {
		
	} 
	
	public void channerDown() {
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	
	public void play() {
		channerUp();
		System.out.printf("판매 TV 채널 %s 번의 프로를 플레이 합니다.\n", getChannel());
	}
	
	
    public String toString() {
        return "판매 상품 정보  모델명: " + model + ", 크기: " + size ;
    }
	
	

}
