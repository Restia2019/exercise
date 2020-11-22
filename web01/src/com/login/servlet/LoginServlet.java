package com.login.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.beans.User;
import com.login.dao.UserDao;
import com.login.dao.UserDaoImpl;

/*
 * 处理登录请求的Servlet
 */
public class LoginServlet extends HttpServlet{
	/*
	 * 常用的方法：doGet   doPost   service
	 *   doGet:处理客户端的get方式的请求
	 *   doPost:处理客户端的post方式的请求
	 *   service:根据具体的请求方式去调用对应的doGet、doPost方法
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 登录功能的实现
		System.out.println("登录请求过来了...");
		
		req.setCharacterEncoding("utf-8");
	
		//获取用户名
		String username = req.getParameter("username");
		//获取密码
		String password = req.getParameter("password");
		System.out.println(username + "," + password);
		
		//响应中文
		resp.setContentType("text/html;charset=utf-8");
		//输出流
		PrintWriter out = resp.getWriter();
		
		//获取Dao对象
		UserDao userDao = new UserDaoImpl();
		
		User user = userDao.getUserByUsernameAndPassword(username, password);
		
		if(user == null) {
			//登录失败
			out.println("<h1><font color='red'>Login Fail! 登录失败</font></h1>");
		}else {
			//登录成功
			out.println("<h1><font color='green'>Login Success! 登录成功</font></h1>");
		}
		
		/*if("Admin".equals(username) && "123456".equals(password)) {
			//登录成功
			out.println("<h1><font color='green'>Login Success! 登录成功</font></h1>");
		}
		else {
			//登录失败
			out.println("<h1><font color='red'>Login Fail! 登录失败</font></h1>");
		}*/
	}
}