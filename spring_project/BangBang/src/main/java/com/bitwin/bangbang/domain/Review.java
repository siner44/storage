package com.bitwin.bangbang.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Review {

	private int ridx;
	private int uidx;
	private int iidx;
	private String content;
	private int rating;
	private Date date;
	
}
