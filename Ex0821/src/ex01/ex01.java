package ex01;

public class ex01 {

	public static void main(String[] args) {
		
		int[][] score = {
				{80,90,96},
				{76,88,82},
				{82,99,52},
				{15,82,90}
		};
		
		
		System.out.println("score[0][2]"+ score[3][0]);  // 96

		System.out.println("score[1][1]"+ score[1][1]); 
		
		int class1Sum = 0;
		for(int i=0; i<score[1].length; i++) {
			class1Sum += score[0][i];                  //
		}
		                            
		double class1Avg = (double) class1Sum / score[0].length;
		System.out.println("첫번째 반의 평군 점수:"+ class1Avg);
		
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<score.length; i++) {
			totalStudent += score[i].length;
			for(int k=0; k<score[i].length; k++) {
				totalSum +=score[i][k];
			}
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수:"+ totalAvg);
		
		
		
	}

}
