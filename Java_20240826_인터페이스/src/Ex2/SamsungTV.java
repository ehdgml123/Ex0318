package Ex2;

public class SamsungTV implements Tv {
   private int chane;
	private int sound = 0;
   private boolean isPower = false;
   
   


@Override
public void powerOn() {
	isPower= true;

	
}


@Override
public void powerOff() {
	isPower= false;
	
}


@Override
public void soundUp() {
	  sound++;
	
}


@Override
public void sounddown() {
	 sound--;
     if(sound <= 0)
     {
        sound = 0;
     }

}
   
  

   
   
   
}
