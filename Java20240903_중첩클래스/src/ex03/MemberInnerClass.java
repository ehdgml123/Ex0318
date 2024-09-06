package ex03;

/*
 * 클래스 생성
 * 
 * */


class SandMessage{
	
	private String msg;
	
 public SandMessage(String msg) { 
	   this.msg = msg;
  }

 
 public String getMsg() {
	return msg;
  }

 
}

class Network{
	public void message(String content) {
	SandMessage message = new SandMessage(content);
	System.out.println(message.getMsg());
	}
}

public class MemberInnerClass {

	public static void main(String[] args) {
	
		  Network network = new Network();
		  network.message("이 문장을 전송해 주세요");

	}

}
