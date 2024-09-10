package movie;

public class MainApp {

	public static void main(String[] args) {
		
		System.out.println("프로그램을 시작합니다");
		
		/*Menu menu = MainMenu.getInstance();에서 getInstance() 메서드를 호출하면, 
		 * 싱글톤 패턴에 의해 MainMenu의 유일한 인스턴스가 반환됩니다.
		 * 
		 * */
		Menu menu = MainMenu.getInstance();
		
		/*menu 객체가 null이 아닐 때 루프를 계속 실행
		 * 
		 *  menu 가 null 인 이유 
		 * - menu 는 mainmenu 의 싱글톤 인스턴스 르 가리키고 있기때문 
		 * */
		while(menu !=null) {   // 메뉴가 잇으면 반복
			
			      
			menu.print();       // 현재메뉴 출력  AbstractMenu 클래스 print() 메소드 호출 
			menu = menu.next();   // 사용자 입력 후, 다음메뉴로 갱신
		}
		
		System.out.println("프로그램 을 종료됩니다");

	}

}


