package com.jj.dao.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class User {

	private Integer id;
	
	private String username;
	
	private String password;
	
	private Byte is_Deleted;
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date create_time;
	
	@JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date update_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte getIs_Deleted() {
		return is_Deleted;
	}

	public void setIs_Deleted(Byte is_Deleted) {
		this.is_Deleted = is_Deleted;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}	
	
}
