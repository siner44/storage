package stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/Temp/x.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린트 보조 스트림 입니다]");
		ps.print("무엇을 출력하시겠습니까");
		ps.println("입력된 글자들을 출력해주세요.");
		
		ps.flush();ps.close();fos.close();
	}
}
