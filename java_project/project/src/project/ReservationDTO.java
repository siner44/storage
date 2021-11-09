package test;

public class ReservationDTO {
	private String rName;
	private String rPhoneNumber;
	private String rDate;
	private int count;
	
	public ReservationDTO(String rName, String rPhoneNumber, String rDate, int count) {
		this.rName = rName;
		this.rPhoneNumber = rPhoneNumber;
		this.rDate = rDate;
		this.count = count;
	}

	public ReservationDTO() {}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getrphoneNumber() {
		return rPhoneNumber;
	}

	public void setrphoneNumber(String rphoneNumber) {
		this.rPhoneNumber = rphoneNumber;
	}

	public String getrDate() {
		return rDate;
	}
	
	public void setrDate(String rDate) {
		this.rDate = rDate;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "고객 이름: " + rName + "\t" + "고객 전화번호: " + rPhoneNumber + "\t" + "예약 날짜: " + rDate;
	}


}
