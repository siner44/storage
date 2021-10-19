package exam.person;

public class male extends Person {

	int tall;
	int weight;

	public male() {
	}

	public male(String name, String idNum, int tall, int weight) {
		super(name, idNum);
		this.tall = tall;
		this.weight = weight;
	}

	@Override
	void print() {
		super.print();
		System.out.println("성별은 남자, 키는 " + tall + "이며, 몸무게는 " + weight + "입니다.");
		hobby();
		System.out.println("--------------------------------------------");
	}
	
	void hobby() {
		System.out.println("저는 영화 보는 것을 좋아합니다.");
	}

}
