package chapter12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String st = br.readLine();
		int number = Integer.parseInt(st);
		br.close();
		
		bw.write(st+"\n");
		bw.write(String.valueOf(number));
		
		bw.flush();
		bw.close();
		
	}
}
