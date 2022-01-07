package com.bitcamp.op.member.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.op.dao.MemberDao;
import com.bitcamp.op.jdbc.ConnectionProvider;
import com.bitcamp.op.jdbc.JdbcUtil;
import com.bitcamp.op.member.domain.ListPageVIew;
import com.bitcamp.op.member.domain.Member;

@Service
public class MemberListService {
	
	@Autowired
	private MemberDao dao;
	
	// 페이지 당 표현할 회원의 수
	private final int COUNT_PER_PAGE = 3;
	
	public ListPageVIew getPageView(int pageNum) throws SQLException {
		
		ListPageVIew view = null;
		Connection conn = null;
		try {
		conn = ConnectionProvider.getConnection();
		
		// 전체 회원의 수
		int totalCount = dao.selectTotalCount(conn);
		
		// 현재 페이지 번호
//		int currentPage = pageNum;
		
		int index = (pageNum-1)*COUNT_PER_PAGE;
		List<Member> list = dao.selectList(conn, index, COUNT_PER_PAGE);
		
		} finally {
			JdbcUtil.close(conn);
		}
		
		return null;
	}
	
}
