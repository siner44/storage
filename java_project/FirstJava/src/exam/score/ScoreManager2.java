package exam.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreManager2 {
	// 배열을 가지고 있고,
	// 배열의 요소를 추가, 검색, 삭제 기능
	
	// 2021.10.20 : 배열을 ArrayList로 변경
	
	public static final Scanner sc = new Scanner(System.in);

	// private Student[] score;
	private List<Student> score;
	// private int numOfStudent;

	public ScoreManager2(int size) {
		// score = new Student[size];
		score = new ArrayList<Student>(size);
		// numOfStudent = 0;
	}

	public ScoreManager2() {
		this(10);
	}

	// 전체 데이터 출력 : 배열에 입력된 모든 데이터를 출력
	public void Show() {
		System.out.println("학생 점수 리스트");
		System.out.println("--------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------");
//		for (int i = 0; i < numOfStudent; i++) {
//			System.out.println(score[i]);
//		}
		for(Student s : score) {
			System.out.println(s);
		}
		System.out.println("--------------------------------------------------");
	}

	// 데이터 추가 : 배열의 요소로 추가 -> Student 타입의 참조값
	// List에 요소 추가
	public void insertScore(Student s) {
		score.add(s);
		
		// score[numOfStudent++] = s;
		// score[numOfStudent] = s;
		// numOfStudent++
	}

	// 데이터 검색 : 이름 기준 검색 -> 배열의 요소들 중 이름(검색어)을 비교
	public void search() {
		
		System.out.println("검색할 학생의 이름 입력");
		String name = sc.nextLine();
		
		// -1 또는 배열 범위 안의 정수
		int index = searchIndex(name);

		if (index > -1) {
			System.out.println(score.get(index));
		} else {
			System.out.println("검색한 이름의 데이터가 존재하지 않습니다.");
		}

		// for (int i = 0; i < numOfStudent; i++) {
//			// 검색어와 요소 객체의 name 문자열을 비교
//			if (score[i].getName().equals(name)) {
//				System.out.println(score[i]);
//			}
//		}
	}

	// 데이터 삭제 : 이름 기준 삭제 -> 배열의 요소에 name 정보 삭제 -> name 객체를 참조하는 값이 없으면 삭제
	public void delete() {
		
		System.out.println("삭제할 학생의 이름 입력");
		String name = sc.nextLine();
		
		int index = searchIndex(name);

		if (index > -1) {
			// 쉬프트 : 참조 값을 지운다 -> 정보 삭제
//			for (int i = index; i < numOfStudent - 1; i++) {
//				score[i] = score[i + 1];
//			}
//			numOfStudent--;
			score.remove(index);
			System.out.println("삭제 완료!");
		} else {
			System.out.println("검색한 이름의 데이터가 존재하지 않습니다.");
		}

		// for (int i = 0; i < numOfStudent; i++) {
//			if (score[i].getName().equals(name)) {
//				for (int j = i; j < numOfStudent - 1; j++) {
//					score[j] = score[j + 1];
//				}
//				System.out.println("삭제 완료!");
//			}
//		}
	}

	// 이름으로 배열의 index를 찾아 그 값을 반환하는 메소드
	private int searchIndex(String name) {

		int index = -1;
		for (int i = 0; i < score.size(); i++) {
			if (score.get(i).getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	// 학생 정보를 저장하고 배열에 저장하는 메소드
	public void insertStudent() {
		System.out.println("학생 성적 데이터 입력");
		System.out.println("이름 입력");
		System.out.print("> ");
		String name = sc.nextLine();
		System.out.println("국어 점수 >> ");
		int kor = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수 >> ");
		int eng = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수 >> ");
		int math = Integer.parseInt(sc.nextLine());
		
		// Student 객체 생성 -> 배열에 저장
		insertScore(new Student(name, kor, eng, math));
		System.out.println("성적 데이터 입력 완료");
	}
}
