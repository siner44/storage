package Inet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest02 {
	public static void main(String[] args) {
		URL url = null;
		BufferedReader br = null;
		String address = "https://www.naver.com/index.html";
		String line = "";
		
		try {
			url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {}
		}
	}
}
