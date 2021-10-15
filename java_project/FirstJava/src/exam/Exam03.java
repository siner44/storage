package exam;

public class Exam03 {
	public static void main(String[] args) {

		// 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 평균 점수를 출력하는 프로그램
		final int NUM = 10;
		int[][] score = new int[NUM][3];
		

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 101);
			}
		}

		for (int i = 0; i < score.length; i++) {

			int total = 0;

			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				total += score[i][j];
			}

			double aver = total / 3.0;
			System.out.println();
			System.out.println("총점: " + total);
			System.out.println("평균: " + aver);
			System.out.println("-----------------------------------------------");
		}
		
		int korTotal = 0; 
		int engTotal = 0;
		int mathTotal = 0;
		for(int i = 0; i < score.length; i++) {
				korTotal += score[i][0];
				engTotal += score[i][1];
				mathTotal += score[i][2];
			}
		float korAver = (float)korTotal / NUM;
		float engAver = (float)engTotal / NUM;
		float mathAver = (float)mathTotal / NUM;
		
		System.out.print("국어 총점: " + korTotal+"\t");
		System.out.println("국어 평균: " + korAver);
		System.out.print("영어 총점: " + engTotal + "\t");
		System.out.println("영어 평균: " + engAver);
		System.out.print("수학 총점: " + mathTotal + "\t");
		System.out.println("수학 평균: " + mathAver);
	}
}
