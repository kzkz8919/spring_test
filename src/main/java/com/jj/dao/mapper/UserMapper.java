package com.jj.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.jj.dao.domain.User;

public interface UserMapper {

	@Insert("insert into user (username,password,is_deleted,create_time,update_time)" + 
			"values(#{username}, #{password}, 0, now(), now())")
	void add(User user);
	
	@Select("select * from user where username=#{username} and is_deleted=0")
	List<User> findByUsername(@Param("username")String username);
	
	@Select("select * from user where username=#{username} "+
			"and password=#{password} and is_deleted=0")
	User find(User user);

	
	@Select("select * from user where is_deleted=0")
	List<User> findAll();
}
