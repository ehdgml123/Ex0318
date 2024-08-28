package ex1;

public class TvTest {

	public static void main(String[] args) {
		
		SaleTV sa = new SaleTV("SALETV", 40, 1, 300000);
		RentalTV re = new RentalTV("RENTALTV-10",42, 8 ,10000); 
		
		sa.channerUp();
		re.channerDown();
		
	    TvTest.printAllTV(sa);
	    TvTest.printAllTV(re);
	    
	    
		TvTest.printRentalTV(re);
		
		
		
		

	}
	
	static void printAllTV(TV tv) {
		System.out.println(tv.toString());
		
		tv.play();
		
		
		// tv가 saleTV를 참조하거나 saletv를 상속한 객체
		
		if(tv instanceof SaleTV) {
		SaleTV saleTV = (SaleTV) tv;  
	        saleTV.sale();
			
	}
	}
	
	static void printRentalTV(Rentable tv) {
		  
		tv.rent();
		}

}
