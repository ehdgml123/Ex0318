package Ex04;

public class Switch {

	public static void main(String[] args) {
		
		int n = (int)(Math.random()*7);
        System.out.println("n:"+ n);
		
		switch(n) {
		case 0:
			 System.out.println("0000000000");
			 break;
		case 1:
			 System.out.println("1111");
			 break;
		case 2:
			System.out.println("222");
			break;
		case 3:
			System.out.println("33");
			break;
		case 4:
			System.out.println("444");
			break;
		default:
			System.out.println("그 외 값");
			
		}

	}

}
