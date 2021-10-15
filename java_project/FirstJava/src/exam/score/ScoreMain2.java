package exam.score;

public class ScoreMain2 {
	public static void main(String[] args) {
		ScoreManager manager = new ScoreManager();
		// 사용자가 Student 데이터를 입력
		// 사용자가 데이터 입력/검색/출력/삭제/프로그램 종료를 선택

		while (true) {
			showMenu();

			int select = Integer.parseInt(ScoreManager.sc.nextLine());

			switch (select) {
			case 1:
				System.out.println("점수 데이터 입력");
				// 점수 입력 기능
				manager.insertStudent();
				break;
			case 2:
				System.out.println("전체 데이터 출력");
				manager.Show();
				break;
			case 3:
				System.out.println("학생 데이터 검색");
				manager.search();
				break;
			case 4:
				System.out.println("학생 점수 삭제");
				manager.delete();
				break;
			case 5:
				System.out.println("프로그램 종료");
				return;
			}

		}

	}

	public static void showMenu() {
		System.out.println("시험점수 관리 프로그램");
		System.out.println("----------------------------------------");
		System.out.println("1. 점수 데이터 입력");
		System.out.println("2. 전체 데이터 출력");
		System.out.println("3. 학생 점수 검색");
		System.out.println("4. 학생 점수 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println("----------------------------------------");
		System.out.println("메뉴 번호 입력");
		System.out.print(">> ");
	}
	
}
