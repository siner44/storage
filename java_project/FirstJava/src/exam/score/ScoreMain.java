package exam.score;

public class ScoreMain {
	public static void main(String[] args) {

		ScoreManager manager = new ScoreManager();

		// 데이터 저장
		manager.insertScore(new Student("sin", 98, 95, 90));
		manager.insertScore(new Student("son", 75, 67, 86));
		manager.insertScore(new Student("sen", 54, 84, 46));

		// 데이터 전체 출력
		manager.Show();

		// 데이터 검색
		manager.search();
		manager.search();

		// 데이터 삭제
		manager.delete();
		manager.delete();

		// 데이터 검색 또는 전체 데이터 출력
		manager.Show();

	}
}