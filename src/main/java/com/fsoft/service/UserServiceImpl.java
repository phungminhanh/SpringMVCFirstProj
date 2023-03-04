package com.fsoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fsoft.bean.User;
import com.fsoft.dao.IUserDao;
@Component
public class UserServiceImpl implements IUserService{
@Autowired
private IUserDao iUserDao;
	@Override
	public User checkLogin(User user) {
		// TODO Auto-generated method stub
		return iUserDao.checkLogin(user);
	}

}
