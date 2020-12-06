package com.sp.app.blog;


public class Blog {
	private long blogIdx;
	private String userId, userName;
	private String blogName;
	private String subject;
	
	public Blog() {
	}
	public Blog(long blogIdx, String userId, String userName, String blogName, String subject) {
		this.setBlogIdx(blogIdx);
		this.userId=userId;
		this.userName=userName;
		this.blogName=blogName;
		this.subject=subject;
	}
	
	

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBlogName() {
		return blogName;
	}
	public void setBlogName(String blogName) {
		this.blogName = blogName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public long getBlogIdx() {
		return blogIdx;
	}
	public void setBlogIdx(long blogIdx) {
		this.blogIdx = blogIdx;
	}
}
