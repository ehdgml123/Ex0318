package work;

public class PlaneTest {

	    public static void main(String[] args) {
	       
	        Plane[] planes = new Plane[2];
	        
	     
	        planes[0] = (Plane) new Airplane("L747", 1000);
	        planes[1] = new Cargopla("C40", 1000);

	   
	 
	        printlnfo(planes);

	    
	        for (Plane plane : planes) {
	            plane.flight(100);
	        }
	        System.out.println("\n[100운항]");
	        printlnfo(planes);

	        
	        for (Plane plane : planes) {
	            plane.refuel(200);
	        }
	        System.out.println("\n[200주유]");
	        printlnfo(planes);
	    }

	    public static void printlnfo(Plane[] list) {
	       
	    	System.out.println("Plane fuelSize");
	        System.out.println("-----------------------");
	        
	      
	        for (Plane plane : list) {
	            System.out.println(plane);
	        }
	    }
	}
	

