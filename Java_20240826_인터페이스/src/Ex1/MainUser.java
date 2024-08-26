package Ex1;

public class MainUser {
	
	public static void main(String[] args) {
		
		
		SamsungTV tv = new SamsungTV(0, false);
		
		tv.IsActive(true);  // 전원 킴
		tv.ChangeSound(1);
		tv.ChangeSound(1);
		tv.ChangeSound(1);
//		System.out.println(tv.sound);  //3
		
		tv.ChangeSound(-1);
		tv.ChangeSound(-1);
//		System.out.println(tv.sound);  //1
		
		tv.IsActive(false); // 전원off 
	}

}
