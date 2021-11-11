package reservation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class ReservationController {
	private Scanner sc = new Scanner(System.in);
	ReservationDAO rDao = ReservationDAO.getInstance();
	private BadInputController inputC;
	ReservationDTO rDto = new ReservationDTO();
	List<ReservationDTO> list;

	Connection conn;

	public ReservationController() {
		try {
			inputC = new BadInputController();
			conn = ConnectionProvider.getConnection();
			// conn.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 예약 등록
	public void add() {
		showAll();

		System.out.println("예약 등록");

		String name = inputC.checkStr("이름을 입력하세요.");

		String phoneNumber = inputC.checkPhoneNum("전화번호를 입력하세요.");

		int count = Integer.parseInt(inputC.checkInt("인원 수를 입력하세요."));

		System.out.println("날짜 시간 입력");
		String date = sc.nextLine();
		inputC.validInputEntranceTime(date);
		
		
		int tid = inputC.checkUserChoice("테이블 번호를 입력하세요.", 1, 5);

		while (avail(date, tid)) {
			System.out.println("이미 예약이 되어있습니다.");
			System.out.println("날짜 또는 테이블 번호를 다시 입력해주세요.");
			System.out.println();
			System.out.println("날짜 시간 입력");
			date = sc.nextLine();
			inputC.validInputEntranceTime(date);
			
			tid = inputC.checkUserChoice("테이블 번호를 입력하세요.", 1, 5);
		}

		rDto = new ReservationDTO(date, name, phoneNumber, count, tid);

		int insert = rDao.insert(conn, rDto);
		if (insert > 0) {
			System.out.println("예약 성공");
			list = rDao.show(conn);

		} else {
			System.out.println("예약 실패");
		}
	}

	// 인덱스 검색
	private int searchIndex(int rId) {
		int index = -1;
		list = rDao.show(conn);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getRid() == rId) {
				index = i;
				break;
			}
		}
		return index;
	}

	// 예약 정보 수정
	void update() {
		showAll();
		while (true) {
			int choice = inputC.checkUserChoice("1. 예약 수정 \t 2. 뒤로가기", 1, 2);

			if (choice == 1) {
				int rId = inputC.checkUserChoice("수정할 예약 번호 입력", 1, list.size() + 1);

				int index = searchIndex(rId);
				if (index > -1) {
					System.out.println("예약 수정");
					System.out.println("--------------------------------------------------");

					String rName = inputC.checkStr("이름을 입력하세요.");

					String rPhoneNumber = inputC.checkPhoneNum("전화번호를 입력하세요.");

					int count = Integer.parseInt(inputC.checkInt("인원 수를 입력하세요."));

					System.out.println("날짜 시간 입력");
					String rDate = sc.nextLine();
					inputC.validInputEntranceTime(rDate);

					int tid = inputC.checkUserChoice("테이블 번호를 입력하세요.", 1, 5);

					while (avail(rDate, tid)) {
						System.out.println("이미 예약이 되어있습니다.");
						System.out.println("날짜 또는 테이블 번호를 변경해주세요.");
						System.out.println();
						System.out.println("날짜 시간 입력");
						rDate = sc.nextLine();
						inputC.validInputEntranceTime(rDate);
						
						tid = inputC.checkUserChoice("테이블 번호를 입력하세요.", 1, 5);
					}

					list.set(index, new ReservationDTO(rDate, rName, rPhoneNumber, count, tid));
					int update = rDao.update(conn, list.get(index));
					list = rDao.show(conn);
					if (update > 0) {
						System.out.println("수정 성공");

					} else {
						System.out.println("수정 실패");
					}
				} else {
					System.out.println("존재하지 않는 정보입니다.");
				}
			} else {
				break;
			}
		}
	}

	// 예약 정보 삭제
	void delete() {
		showAll();

		int rId = inputC.checkUserChoice("삭제할 예약 번호를 입력하세요.", 1, list.size() + 1);

		int index = searchIndex(rId);

		int del = rDao.delete(conn, list.get(index).getRid());

		list = rDao.show(conn);
		System.out.println("취소 성공");
	}

	void showNumber() {
		System.out.println("예약 갯수: " + list.size());
	}

	// 개별 출력
	void show() {
		list = rDao.show(conn);
		int rId = inputC.checkUserChoice("조회할 예약 번호를 입력하세요.", 1, list.size());
		System.out.println();
		System.out.println("조회한 예약 정보");
		System.out.println("--------------------------------------------------");
		list = rDao.show(conn);
		int index = searchIndex(rId);

		System.out.println(list.get(index));

	}

	// 전체 출력
	void showAll() {
		list = rDao.show(conn);
		System.out.println("예약 리스트");
		System.out.println("--------------------------------------------------");
		if (list.size() == 0) {
			System.out.println("아직 등록된 예약이 없습니다.");
			System.out.println("--------------------------------------------------");
		} else {
			for (ReservationDTO r : list) {
				System.out.println(r);
			}
		}
	}

	boolean avail(String date, int tid) {
		list = rDao.show(conn);

		String rDate = "";

		boolean b = false;
		for (int i = 0; i < list.size(); i++) {
			rDate = list.get(i).getRdate();

			if (rDate.equals(date) && list.get(i).getTid() == tid) {
				b = true;
			}
		}
		return b;
	}
}