package Inet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest02 {
	public static void main(String[] args) {
		BufferedReader br = null;
		String url = null;
		InetAddress[] addresses;

		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("도메인: ");
		try {
			url = br.readLine();
			addresses = InetAddress.getAllByName(url);

			for (int i = 0; i < addresses.length; i++) {
				System.out.println("이름: " + addresses[i].getHostName() + ", IP 주소: " + addresses[i].getHostAddress());
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {}
		}

	}
}
