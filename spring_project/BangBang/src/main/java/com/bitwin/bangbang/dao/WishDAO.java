package com.bitwin.bangbang.dao;

import java.util.List;
import java.util.Map;

import com.bitwin.bangbang.domain.Wishlist;

public interface WishDAO {
	
	public int check(Map<String, Object> map);
	
	public void wishUpdate(Map<String, Object> map);
	
	public void wishDelete(Map<String, Object> map);
	
	public int count(int iidx);
	
	public List<Wishlist> getWishlist(int uidx);
	
}
