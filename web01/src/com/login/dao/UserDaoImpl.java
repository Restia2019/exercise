package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.login.beans.User;

public class UserDaoImpl implements UserDao{
	
	public User getUserByUsernameAndPassword(String username, String password) {
		User u = null;
		//JDBC:获取连接  编写SQL 预编译SQL 设置参数     执行SQL 封装结果    关闭连接
		//获取连接
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bigdata_0308?useSSL=false&serverTimezone=UTC";
			String user="root";
			String pawd="123456";
			Connection conn = DriverManager.getConnection(url, user, pawd);
			
			String sql="select id, username,password from tbl_user where username = ? and password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				u = new User();
				u.setId(rs.getInt("id"));
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
			}
			
			return u;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
