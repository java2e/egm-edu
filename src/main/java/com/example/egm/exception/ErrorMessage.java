package com.example.egm.exception;

import java.util.Date;

public class ErrorMessage {
	private Date createDate;
	private String detail;

	public ErrorMessage(Date createDate,String detail) {
		this.createDate = createDate;
		this.detail = detail;
	}
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
