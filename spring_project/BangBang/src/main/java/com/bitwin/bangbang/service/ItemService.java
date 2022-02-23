package com.bitwin.bangbang.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitwin.bangbang.dao.ItemDAO;
import com.bitwin.bangbang.domain.Item;
import com.bitwin.bangbang.domain.ListPageView;
import com.bitwin.bangbang.domain.SearchParams;

@Service
public class ItemService {

	ItemDAO dao;

	@Autowired
	private SqlSessionTemplate template;

	public void create(Item item) {

		dao = template.getMapper(ItemDAO.class);

		dao.create(item);

		System.out.println("iidx => " + item.getIidx());

	}

	public Item read(int iidx) {
		return template.getMapper(ItemDAO.class).read(iidx);
	}

	public void update(Item item) {
		dao = template.getMapper(ItemDAO.class);
		dao.update(item);
	}

	public void delete(int iidx) {
		dao = template.getMapper(ItemDAO.class);
		
		dao.delete(iidx);
	}

	public Object getPageView(SearchParams params) throws SQLException {
		int CountPerPage = 10;

		ListPageView view = null;

		dao = template.getMapper(ItemDAO.class);

		if (params.getKeyword() == null || params.getKeyword().trim().isEmpty()) {
			params.setSearchType(null);
		}

		Map<String, String> searchMap = new HashMap();
		searchMap.put("searchType", params.getSearchType());
		searchMap.put("keyword", params.getKeyword());

		int totalCount = dao.selectTotalCount(searchMap);

		int currentPage = params.getP() == 0 ? 1 : params.getP();

		int index = (currentPage - 1) * CountPerPage;

		params.setIndex(index);
		params.setCount(CountPerPage);

		List<Item> list = dao.selectList(params);

		view = new ListPageView(totalCount, currentPage, CountPerPage, list);

		return view;
	}
}
