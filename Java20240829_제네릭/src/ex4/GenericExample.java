package ex4;

public class GenericExample {

	public static void main(String[] args) {
		
		Product<Tv, String> product = new Product<Tv, String>();
		
		
	   product.setKind(new Tv());
	   product.setModel(new String());
	   
	   Tv tv = product.getKind();
	   String tvModel =product.getModel();
	   
	   System.out.println("-----------------------------------");
	   
	   
	   Product<Car, Integer> product2 = new Product<Car, Integer>();
	   
	   product2.setKind(new Car());
	   product2.setModel(10);
	   
	  Car car =  product2.getKind();
	 
	  
	  Integer carModel = product2.getModel();
	  
	  

	}

}
