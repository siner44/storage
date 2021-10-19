package project;

public class CustomerContact extends Contact{
	
	private String companyName;
	private String item;
	private String position;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	CustomerContact() {
	}

	CustomerContact(String name, String phoneNumber, String mail, String address, String birthDay, String group,
			String companyName, String item, String position) {
		super(name, phoneNumber, mail, address, birthDay, group);
		this.companyName = companyName;
		this.item = item;
		this.position = position;
	}

	@Override
	void printContact() {
		super.printContact();
		System.out.println("회사 이름: " + companyName);
		System.out.println("거래 품목: " + item);
		System.out.println("직급: " + position);
	}
	
	public String toString() {
		return super.toString() + "\t" + companyName + "\t" + item + "\t" + position;

	}
}
