package Ex2;

public class LgTv implements Tv {
	
	boolean power;
	   int sound;
	   
	   public LgTv() {   }

	  @Override
	public void powerOn() {
	      this.power = true;
	      System.out.println("전원이 켜졌습니다.");
	   }
	   
	  @Override
	   public void powerOff() {
	      this.power = false;
	      System.out.println("전원이 꺼졌습니다.");
	   }
	   
	  @Override
	   public void soundUp() {
	      this.sound += 1;
	   }
	   
	  @Override
	   public void sounddown() {
	      this.sound -= 1;   
	      if(sound < 0)
	         sound = 0;
	   }


}
