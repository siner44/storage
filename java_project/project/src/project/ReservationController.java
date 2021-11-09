package project;

import java.util.ArrayList;
import java.util.Scanner;

public class ReservationController {
	public static Scanner sc = new Scanner(System.in);
	ArrayList<ReservationDTO> rList = new ArrayList<ReservationDTO>();

	public void add() {
		System.out.println("예약 등록");
		System.out.println("----------------------------");

		System.out.println("이름을 입력하세요");
		System.out.print("> ");
		String rName = sc.nextLine();

		System.out.println("전화번호를 입력하세요");
		System.out.print("> ");
		String rPhoneNumber = sc.nextLine();

		rList.add(new ReservationDTO(rName, rPhoneNumber));

		System.out.println("예약 성공");
	}

	private int searchIndex(String name) {
		int index = -1;
		for (int i = 0; i < rList.size(); i++) {
			if (rList.get(i).getrName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}

	void update() {
		System.out.println("수정할 고객의 이름 입력");
		System.out.println("> ");
		String name = sc.nextLine();

		int index = searchIndex(name);

		System.out.println("예약 수정");
		System.out.println("----------------------------");

		System.out.println("이름을 입력하세요");
		System.out.print("> ");
		String rName = sc.nextLine();

		System.out.println("전화번호를 입력하세요");
		System.out.print("> ");
		String rPhoneNumber = sc.nextLine();

		rList.set(index, new ReservationDTO(rName, rPhoneNumber));
		
		System.out.println("수정 성공");
	}

	void delete() {
		System.out.println("예약 취소할 고객의 이름 입력");
		System.out.println("> ");
		String name = sc.nextLine();

		int index = searchIndex(name);

		rList.remove(index);
		System.out.println("취소 성공");
	}

	void showNumber() {
		System.out.println("예약 갯수: " + rList.size());
	}

	void show() {
		System.out.println("조회할 고객의 이름을 입력");
		System.out.println("> ");
		String name = sc.nextLine();
		
		int index = searchIndex(name);
		
		System.out.println(rList.get(index));
		
	}
	
	public static void main(String[] args) {
		ReservationController rc = new ReservationController();

		rc.add();
		rc.add();
		rc.update();
		rc.add();

		for (int i = 0; i < rc.rList.size(); i++) {
			System.out.println(rc.rList.get(i));
		}
		rc.showNumber();
	}
}