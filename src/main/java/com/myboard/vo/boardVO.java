package com.myboard.vo;

import java.util.Date;

public class boardVO {
	private int id;
	private String title;
	private String content;
	private String writer;
	private Date write_date;
	private int view_count;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	public int getView_count() {
		return view_count;
	}
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}

	@Override
	public String toString() {
		return "boardVO [id=" + id + ", title="+ title + ", content=" + content + ", write_date="
				+ write_date + ", view_count=" + view_count + "]";
		
	}

}
