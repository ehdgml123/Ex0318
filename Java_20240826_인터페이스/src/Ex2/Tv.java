package Ex2;

interface Tv {
	
	//추상메소드
	void powerOn();
	void powerOff();
	void soundUp();
	void sounddown();
	
	// 채널변경
	default void chanelUp() {
		System.out.println("채널을 올립니다");
	};
	default void chanelDown() {
	    System.out.println("채널을 내립니다.");
	};

}
