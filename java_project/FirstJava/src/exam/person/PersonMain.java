package exam.person;

public class PersonMain {
	public static void main(String[] args) {

		Person p = new male("sin", "971010-1010101", 180, 71);
		Person p2 = new female("lee", "020101-4030303", 230, 164);

		p.print();
		p2.print();

	}
}
