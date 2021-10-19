package exam.person;

public class female extends Person {

	int footSize;
	int tall;

	public female() {
	}

	public female(String name, String idNum, int footSize, int tall) {
		super(name, idNum);
		this.footSize = footSize;
		this.tall = tall;
	}

	@Override
	void print() {
		super.print();
		System.out.println("성별은 여자, 키는 " + tall + "이고, 발 사이즈는 " + footSize + "입니다.");
		System.out.println("-------------------------------------------------");
	}

}
