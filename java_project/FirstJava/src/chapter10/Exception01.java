package chapter10;

public class Exception01 {
	public void method(String[] str)throws Exception{
		if(str.length>0) {
			for(String s : str) {
				System.out.println(s);
			}
		} else {
			throw new Exception("입력한 데이터가 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		Exception01 ex = new Exception01();
		try {
			ex.method(args);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
