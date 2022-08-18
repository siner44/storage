package chapter12;

import java.io.File;

public class File01 {
	public static void main(String[] args) {
		String path = "C://";
		File f = new File(path);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("파일이 존재하지 않습니다.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			File f2 = files[i];
			if(f2.isDirectory()) {
				System.out.println("[" + f2.getName() + "]");
			} else {
				System.out.println(f2.getName());
				System.out.printf("(%,dbytes)\n", f2.length());
			}
		}
		
	}
	
	
}
