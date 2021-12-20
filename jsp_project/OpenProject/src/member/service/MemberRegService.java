package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.domain.Member;
import member.domain.RegRequest;

public class MemberRegService {
	
	// Service 클래스도 메소드만 있는 클래스다 -> 싱글톤
	private MemberRegService() {
	}
	private static MemberRegService regService = new MemberRegService();
	public static MemberRegService getInstance() {
		return regService;
	}
	
	// 사용자가 전달한 요천 데이터를 받아서 Dao insert 메소드로 전달
	// 입력 결과 데이터 반환하고 메소드, 사용자 요청 처리, 응답 처리
	public int insertMember(HttpServletRequest request, HttpServletResponse response) {
		
		// 결과 생성
		// Connection 객체 생성 -> Dao.insertMember(conn, member)
		
		// 데이터 받기
		String userId = request.getParameter("userId");
		String pw = request.getParameter("pw");
		String userName = request.getParameter("username");
		
		RegRequest regRequest = new RegRequest(userId, pw, userName);
		
		Member member = null;
		member = regRequest.getMember();
		
		// Dao 호출
		
		Connection conn = null;
		int resultCnt = 0;
		
		try {
			conn = ConnectionProvider.getConnection();
			
//			resultCnt = MemberDao.getInstance().insertMember(conn, member);
			resultCnt = MemberDao.getInstance().insertMember(conn, regRequest.getMember());
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultCnt;
		
	}
	
}
