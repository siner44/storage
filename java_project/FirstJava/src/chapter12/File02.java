package chapter12;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File02 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		String path = "C://";
		
		File f = new File(path);
		
		File[] files = f.listFiles();
		
		String attribute = "";
		String size ="";
		String name = "";
		
		for(int i = 0; i < files.length; i++) {
			File f2 = files[i];
			name = f2.getName();
			
			if(f2.isDirectory()) {
				size = "0";
				attribute = "DIR";
			} else {
				size = f2.length() + "";
				attribute = f2.canRead() ? "R" : " ";
				attribute = f2.canWrite() ? "R" : " ";
				attribute = f2.isHidden() ? "R" : " ";
			}
			System.out.printf("%s %3s %6s %s\n", sdf.format(new Date(f2.lastModified())), attribute, size, name);
			
		}
		
	}
}
