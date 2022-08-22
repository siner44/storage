package chapter12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
		br = new  BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름: ");
			String name = br.readLine();
			System.out.println(name);
			
			System.out.print("나이 : ");
			int age = Integer.parseInt(br.readLine());
			System.out.println(age);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {
				
			}
		}
		
	}
}
