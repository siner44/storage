package exam.score;

public class Student {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student() {
	}
	
	public Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng= eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int total() {
		int total = kor + eng + math;
		return total;
	}
	
	public double aver() {
		double aver = (double)total() / 3;
		return aver;
	}

	@Override
	public String toString() {
		return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total()+"\t"+aver() ;

	}
	
	
	
}
