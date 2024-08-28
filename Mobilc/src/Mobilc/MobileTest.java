package Mobilc;

public class MobileTest {

	public static void main(String[] args) {
		
		 Mobilc mLtab = new Latb("Ltab", 500, "ABC-01");
		 Mobilc mOtab = new Otab("Otab", 1000, "XYZ-20");
		

		mLtab.charge(10);
		mOtab.charge(10);
		MobileTest.printTitle();
		MobileTest.printMobile(mLtab);
		MobileTest.printMobile(mOtab);

		
		mLtab.operate(5);
		mOtab.operate(5);
		MobileTest.printTitle();
		MobileTest.printMobile(mLtab);
		MobileTest.printMobile(mOtab);
		
	}
	public static void printMobile(Mobilc mobile) {
		
		System.out.printf("%10s\t %10d\t %10s\t\n", 
				mobile.getmobileName(),
				mobile.getbatterySize(),
				mobile.getosType()
		);
		System.out.println();
	}
	
	public static void printTitle() {
		System.out.println("     Mobile	     Battery	     OS");
		System.out.println("---------------------------------------------");
	}

}
