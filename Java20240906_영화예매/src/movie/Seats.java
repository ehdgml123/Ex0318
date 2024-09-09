package movie;

import java.util.ArrayList;

public class Seats {
	   // 5줄에 9칸 
	public static final int MAX_ROW = 5;
	public static final int MAX_COL = 9;
	
	// 2차원 배열 
	private String[][] map = new String[MAX_ROW][MAX_COL];
	
           // ArrayList 에 Reservation 담고 있다 ,  reservations -> 타입변수 
	public Seats(ArrayList<Reservation> reservations) throws Exception {
		
		/*좌석 배열 초기화 
		 * for(int i=0; i<MAX_ROW; i++) 5번 실행
		 * for(int j=0; j<MAX_COL; j++) 9번 실행 
		 *   map[i][j]= "O"  ex) map[0][0] ~ map[4],[9] 모든 배열 "0" 으로 초기화
		 */    
		for(int i=0; i<MAX_ROW; i++) {
			 for(int j=0; j<MAX_COL; j++) {
				 map[i][j]= "O"; 
			 }
		}
		
		
		/* 예약좌석 처리
		 * 
		 * for(int i=0; i<reservations.size(); i++) 
		 * -   reservations 에 저장된 만큼 돌아라 
		 * 
		 * Reservation r = reservations.get(i)
		 * - reservations 에 있는 인덱스 i 를 가지고 온다
		 *  i 의 예약 정보는 r 에 저장한다 
		 *  
		 *  String seatName = r.getSeatName();
		 *  - r.getSeatName()이 "A1"을 반환하면,
		 *      seatName 변수에 "A1"이 저장
		 *      
		 *  mark(seatName)
		 *  - 좌석을 예약된 상태로 업데이트 한다. 
		 */
		for(int i=0; i<reservations.size(); i++) {
			Reservation r = reservations.get(i);
			String seatName = r.getSeatName();
			mark(seatName);
		}
		
		
	}


	public void mark(String seatName) throws Exception {
		
		char[] temp = seatName.toCharArray();
		// B - 4
		
		
		int row = temp[0] - 'A';    // 행 인덱스 계산   B(66)-A(65)
		int col = temp[2] - '1';    // 열 인덱스 계산   
		
		               // 행     열
		if("X".equals(map[row][col])) {
			 throw new Exception("이미 예매된 좌석입니다");
		}
		map[row][col] = "X";   // 예매 좌석 확정 
		 
	}


	public void show() {
		
		System.out.println("----------------------");
        System.out.println("      S C R E E N     ");
		System.out.println("----------------------");
		
		for(int i=0; i<MAX_ROW; i++) {
			System.out.printf("%c ", 'A'+i);
			for(int j=0; j<MAX_COL; j++) {
				System.out.printf(" %s", map[i][j]);
			}
			System.out.println();
		}
		System.out.println("   1 2 3 4 5 6 7 8 9");
	}
	
	

}
