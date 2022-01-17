package com.bitcamp.mvc.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class GuestMessage {

	private int idx;
	private String message;
	private Date date;
	
	public GuestMessage() {
	}

	public GuestMessage(int idx, String message, Date date) {
		this.idx = idx;
		this.message = message;
		this.date = date;
	}
	@JsonIgnore
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@JsonFormat(shape = Shape.STRING)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	
}
