package exam.score;

public class Score {
	public static void main(String[] args) {

		Student[] arr = new Student[10];
		Student s = new Student("Sin", 34, 45, 65);

		int numOfStudent = 0;

		arr[numOfStudent] = s;
		numOfStudent++;

		Student s1 = new Student("son", 56, 43, 65);
		arr[numOfStudent] = s1;
		numOfStudent++;

		for (int i = 0; i < numOfStudent; i++) {
			// System.out.println(s.getKor() + "\t" + s.getEng() + "\t" + s.getMath() + "\t"
			// + s.total() + "\t" + s.aver());

			System.out.println(arr[i]);

		}

	}
}
