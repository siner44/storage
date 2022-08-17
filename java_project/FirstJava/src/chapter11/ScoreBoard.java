package chapter11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ScoreBoard {
	BufferedReader br;
	ArrayList<Score> list;

	public ScoreBoard() {
		list = new ArrayList<Score>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	public void callMenu() throws IOException {
		while (true) {
			System.out.println();
			System.out.println("메뉴 선택 >> 1.성적입력  2.성적출력  3.종료");

			try {
				int num = Integer.parseInt(br.readLine());
				if (num == 1) {
					input();
				} else if (num == 2) {
					output();
				} else if (num == 3) {
					System.out.println("프로그램 종료");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			}

		}
	}
	
	public void input() throws IOException {
		Score s = new Score();
		
		System.out.println("이름 : ");
		s.setName(br.readLine());
		s.setKorean(parseInputData("국어 점수 입력 : "));
		s.setEnglish(parseInputData("영어 점수 입력 : "));
		s.setMath(parseInputData("수학 점수 입력 : "));
		
		list.add(s);
	}
	
	public int parseInputData(String title) throws IOException {
		while(true) {
			System.out.println(title);
			try {
				int num = Integer.parseInt(br.readLine());
				if(num < 0 || num > 100) {
					throw new ScoreValueException("0~100 사이의 숫자를 입력하세요.");
				}
				return num;
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요.");
			} catch (ScoreValueException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	
	public void output() {
		System.out.println();
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println();
		
		for(Score s : list) {
			System.out.print(s.getName() + "\t");
			System.out.print(s.getKorean() + "\t");
			System.out.print(s.getEnglish() + "\t");
			System.out.print(s.getMath() + "\t");
			System.out.print(s.makeSum() + "\t");
			System.out.printf("%.2f\t", s.makeAvg());
			System.out.print(s.makeGrade() + "\t");
		}
	}
	
	public static void main(String[] args) {
		new ScoreBoard();
	}

}
