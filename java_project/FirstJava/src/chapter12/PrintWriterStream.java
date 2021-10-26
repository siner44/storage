package chapter12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterStream {
	public static void main(String[] args) throws IOException {
		
		PrintWriter out = new PrintWriter(new FileWriter("print.txt"));
		
		out.printf("이름은 %s이고, 내 나이는 %d살 이다.", "sin", 28);
		out.println();
		
		out.print("축구를 좋아한다.");
		out.println("축구 게임도 좋아한다.");
		out.close();
				
	}
}
