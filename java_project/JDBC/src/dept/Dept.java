package dept;

public class Dept {

	private int deptno;
	private String dname;
	private String loc;

	// 생성자 초기화
	public Dept(int deptno, String dname, String loc) {
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	// 기본 생성자 : Beans 클래스 생성 시 반드시 기본 생성자가 있어야 한다.
	public Dept() {

	}
	
	// VO : 읽기 전용, getter 메소드만 존재

	// DTO : 읽고 쓰기 가능, gette/setter

	/**
	 * @return the deptno
	 */
	public int getDeptno() {
		return deptno;
	}

	/**
	 * @param deptno the deptno to set
	 */
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	/**
	 * @return the dname
	 */
	public String getDname() {
		return dname;
	}

	/**
	 * @param dname the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}

	/**
	 * @return the loc
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * @param loc the loc to set
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return deptno + "\t" + dname + "\t" + loc;
	}

}
