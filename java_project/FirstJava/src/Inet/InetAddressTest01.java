package Inet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		String url = null;
		InetAddress ia = null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("도메인 : ");
		try {
			url = br.readLine();
			
			ia = InetAddress.getByName(url);
			
			System.out.println("이름: " + ia.getHostName());
			System.out.println("IP 주소 :: " + ia.getHostAddress());
			System.out.println();
			
			ia = InetAddress.getLocalHost();
			
			System.out.println("로컬 이름: " + ia.getHostName());
			System.out.println("로컬 IP 주소: " + ia.getHostAddress());
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {}
		}
		
		
	}
}
