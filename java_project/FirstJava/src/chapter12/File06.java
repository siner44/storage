package chapter12;

import java.io.File;

public class File06 {
	public static void main(String[] args) {
		
		System.out.println("디렉토리 생성");
		File f = new File("C:\\java\\Sample");
		
		System.out.println(f.mkdir());
		
		System.out.println("디렉토리 삭제");
		
		if(f.delete()) {
			System.out.println(f.getName() + " 삭제 성공");
		} else {
			System.out.println("삭제 불가");
		}
		
	}
}
