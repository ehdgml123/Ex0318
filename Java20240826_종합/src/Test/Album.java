package Test;

public class Album extends Item {
	
	private String artist;
	
	public Album() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Album(String name,int price,String artist) {
		super(name,price);
		this.artist = artist;
	}
	
	public int getprice() {
		return price;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("-아티스트:"+artist);
	} 
	

}
