package project.p4;

public class CompanyContact extends Contact {

	private String companyName;
	private String department;
	private String position;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	CompanyContact() {
	}

	CompanyContact(String name, String phoneNumber, String mail, String address, String birthDay, String group,
			String companyName, String department, String position) {
		super(name, phoneNumber, mail, address, birthDay, group);
		this.companyName = companyName;
		this.department = department;
		this.position = position;
	}

	@Override
	void printContact() {
		super.printContact();
		System.out.println("회사 이름: " + companyName);
		System.out.println("부서 이름: " + department);
		System.out.println("직급: " + position);
	}
	
	public String toString() {
		return super.toString() + "\t" + companyName + "\t" + department + "\t" + position;

	}

	@Override
	public void showData() {
	}
}
