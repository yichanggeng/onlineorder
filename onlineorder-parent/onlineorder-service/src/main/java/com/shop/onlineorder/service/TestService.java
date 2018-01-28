package com.shop.onlineorder.service;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.onlineorder.entity.User;

@Service
public class TestService {
	@Autowired
	private SqlSessionFactoryBean sqlSessionFactory;
	
	public User selectByDate(){
		
		try {
			SqlSession session = sqlSessionFactory.getObject().openSession();
			String sql = "com.shop.userMapper.selectAll";
			
			User user = session.selectOne(sql);
			
			return user;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
}
