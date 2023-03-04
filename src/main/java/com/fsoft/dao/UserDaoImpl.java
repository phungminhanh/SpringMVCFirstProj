package com.fsoft.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.fsoft.bean.User;
@Component
public class UserDaoImpl implements IUserDao {
@Autowired
private JdbcTemplate jdbcTemplate;
@Override
		public User checkLogin(User user) {
			String query ="select * from user where user_name = ? and password = ? ";
			List<User> listUser = jdbcTemplate.query(query, new Object[] {user.getUserName(),user.getPassword()}, new UserRowMapper());

		return listUser.get(0);
			 
		}
}
class UserRowMapper implements org.springframework.jdbc.core.RowMapper<User>{
	
	public  User mapRow(ResultSet resultSet, int iValue) throws SQLException
	{
     User user = new User();
	 user.setUserName(resultSet.getString(2));
	 user.setPassword(resultSet.getNString(4));
	
	return user;
	}
	}


		




