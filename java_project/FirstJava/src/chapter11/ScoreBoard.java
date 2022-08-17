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
	

}
