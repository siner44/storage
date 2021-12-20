package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.util.JdbcUtil;
import member.domain.Member;

public class MemberDao {

	private MemberDao() {
	}
	
	private static MemberDao dao = new MemberDao();
	public static MemberDao getInstance() {
		return dao;
	}
	
	// Connection 객체, Member 객체를 전달받아 데이터 베이스에 입력
	public int insertMember(Connection conn, Member member) throws SQLException {
		
		int resultCnt = 0;
		PreparedStatement pstmt = null;
		
		String sql = "insert into member (userid, password, username) values (?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getUserid());
			pstmt.setString(2, member.getPw());
			pstmt.setString(3, member.getUsername());
			
			resultCnt = pstmt.executeUpdate();
		} finally {
			JdbcUtil.close(pstmt);
		}
		
		return resultCnt;
		
	}
	
	
}
