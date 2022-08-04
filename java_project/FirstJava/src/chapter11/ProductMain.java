package chapter11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProductMain {
	ArrayList<Product> list;
	BufferedReader br;

	public ProductMain() {
		list = new ArrayList<Product>();

		try {

			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
				}

		}

	}

	public void callMenu() throws IOException {

		while (true) {
			System.out.println("1. 상품 입력  2. 상품 목록보기 3. 종료  >>>");
			try {
				int num = Integer.parseInt(br.readLine());
				if (num == 1) {
					input();
				} else if (num == 2) {
					output();
				} else if (num == 3) {
					System.out.println("종료");
					break;
				} else {
					System.out.println("잘못 입력했습니다.");
				}

			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력 가능합니다.");
			}

		}

	}

	public void input() throws IOException {

		Product p = new Product();

		System.out.println("상품명 : ");
		p.setName(br.readLine());
		System.out.println("상품번호 : ");
		p.setNum(br.readLine());
		System.out.println("가격 : ");
		p.setPrice(Integer.parseInt(br.readLine()));
		System.out.println("제조사 : ");
		p.setMaker(br.readLine());
		System.out.println("재고 : ");
		p.setStock(Integer.parseInt(br.readLine()));

		list.add(p);

	}

	public void output() {
		System.out.println("상품명\t상품번호\t가격\t제조사\t재고");
		System.out.println("-----------------------------------------");

		for (Product p : list) {
			System.out.printf("%s\t", p.getName());
			System.out.printf("%s\t", p.getNum());
			System.out.printf("%s\t", p.getPrice());
			System.out.printf("%s\t", p.getMaker());
			System.out.printf("%s\t", p.getStock());
		}

	}
	
	public static void main(String[] args) {
		new ProductMain();
	}

}
