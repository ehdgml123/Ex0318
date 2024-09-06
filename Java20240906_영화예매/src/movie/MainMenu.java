package movie;

public class MainMenu extends AbstractMenu {
	
	private static final MainMenu instance = new MainMenu(null);
	
	
	private static final String MAIN_MENU_TEXT =   // 기본문구
			  "1: 영화 예매하기\n" + 
	          "2: 예매 확인한디\n" +
			  "3: 예애 최소하기\n"+
	          "4:관리자 메뉴로 이동하기\n"+ 
			  "q: 종료\n\n"+
	          "메뉴를 선택하세요 :";
	
	private MainMenu(Menu prevMenu) {
		 super(MAIN_MENU_TEXT, prevMenu);   // 부모생성자
	}
	
	// 싱글톤 - 특정 클래스가 단 하나만의 인스턴스를 생성하여 사용하기 위한 패턴이다
	
	public static MainMenu getInstance() {
		return instance;    // MainMenu 객제 생성 주소변환(싱글톤패턴)
	}

	public Menu next() {
		 switch(sc.nextLine()) {     // 사용자 입력에 따라 메뉴 이동
		 case "4" :
			  if(! checkAdminPassword()) {
				  System.out.println(">>> 비밀번호가 틀렸습니다");
				  return this;
			  }
		   
			  /// AdminMenu 클래스의 싱글톤 인스턴스를 반환
			  AdminMenu adminMenu = AdminMenu.getInstance();
			  adminMenu.setPrevMenu(this);
			  return adminMenu;
			 
		 
		 case "q" : return prevMenu;   //q 누르면 이전메뉴
		 default : return this;     // 다른 입력은 현재 메뉴 이전 
		 }
	}

	private boolean checkAdminPassword() {
		System.out.println("관리자 비밀번호를 입력하세요:");
		
		return "1234".equals(sc.nextLine());
	}
	

}
