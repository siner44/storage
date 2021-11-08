package dept;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class DeptMain {
	public static void main(String[] args) {
//		DeptDao deptDao = new DeptDao();
		
		DeptDao deptDao = DeptDao.getInstance();
		
		List<Dept> list = null;

		Connection conn;
		try {
			conn = ConnectionProvider.getConnection();
			
			// 트랜젝션 일의 단위
			conn.setAutoCommit(false); // 트랜젝션의 컨트롤
			
			// 부서 리스트 확인
			list = deptDao.selectAllList(conn);

			System.out.println("부서 리스트");
			System.out.println("------------------------");

			for (Dept dept : list) {
				System.out.println(dept);
			}

			System.out.println("-------------------------");

			// 부서 정보 검색: 부서 번호
			Dept dept = deptDao.selectByDeptno(conn, 10);
			System.out.println("10번 부서: " + dept);

			// 부서 정보 입력
			Dept newDept = new Dept(50, "DEV", "SEOUL");
			int insertCnt = deptDao.insertDept(conn, newDept);
			if (insertCnt > 0) {
				System.out.println("부서 정보 입력 완료");
			} else {
				System.out.println("입력 실패");
			}

			System.out.println("입력 결과: " + deptDao.selectByDeptno(conn, 50));

			System.out.println("--------------------------");

			// 부서 정보 수정
			Dept editDept = new Dept(50, "Design", "BUSAN");
			int editCnt = deptDao.editDept(conn, editDept);
			if (editCnt > 0) {
				System.out.println("수정 완료");
			} else {
				System.out.println("수정 실패");
			}

			System.out.println("수정 결과: " + deptDao.selectByDeptno(conn, 50));

			System.out.println("--------------------------");

			// 부서 정보 삭제: deptno 기준으로 삭제
			int delCnt = deptDao.deleteDept(conn, 50);
			System.out.println("삭제 결과: " + deptDao.selectByDeptno(conn, 50));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
