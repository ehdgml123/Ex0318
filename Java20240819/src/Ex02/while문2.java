package Ex02;

public class while문2 {

	public static void main(String[] args) {
		
		 int i=2;
		 
		 
		 while(i<=9) {
			 int j=1;
			 while(j<=9) {
			 System.out.printf("%dx%d\n",i,j,i*j);
			 j++;
		 }
			 i++;
	  }
	}

}
