package Ex04;

public class OverLoading {

	public static void main(String[] args) {
	
		func();
		
		func(5);
		
		func(5,2);
		
		func("abc");
		

	}
	
	static void func() {}
	
	static void func(int i) {}
	
	static void func(int i, int j) {}
	
	static void func(String s) {}
	

}
