package chapter11;

import java.io.BufferedReader;
import java.util.ArrayList;

public class ProductMain {
	ArrayList<Product> list;
	BufferedReader br;
	
	public ProductMain() {
		list = new ArrayList<Product>();
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
}
