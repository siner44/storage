package project;

public class ReservationDTO {
	private String rName;
	private String rPhoneNumber;
	
	public ReservationDTO(String rName, String rPhoneNumber) {
		this.rName = rName;
		this.rPhoneNumber = rPhoneNumber;
	}

	public ReservationDTO() {}

	/**
	 * @return the rName
	 */
	public String getrName() {
		return rName;
	}

	/**
	 * @param rName the rName to set
	 */
	public void setrName(String rName) {
		this.rName = rName;
	}

	/**
	 * @return the rNumber
	 */
	public String getrphoneNumber() {
		return rPhoneNumber;
	}

	/**
	 * @param rNumber the rNumber to set
	 */
	public void setrphoneNumber(String rphoneNumber) {
		this.rPhoneNumber = rphoneNumber;
	}

	@Override
	public String toString() {
		return "고객 이름: " + rName + "\t" + "고객 전화번호: " + rPhoneNumber;
	}
}
