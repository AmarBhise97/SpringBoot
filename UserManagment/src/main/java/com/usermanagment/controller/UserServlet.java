package com.usermanagment.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.usermanagment.bean.User;
import com.usermanagment.dao.UserDao;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/users")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao userDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		userDao = new UserDao();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	
	protected void doGet(HttpServletRequest request,
	        HttpServletResponse response)
	        throws ServletException, IOException {

	    String action = request.getParameter("action");

	    if ("edit".equals(action)) {

	        int id = Integer.parseInt(request.getParameter("id"));

	        User existingUser = userDao.selectUser(id);

	        request.setAttribute("user", existingUser);

	        request.getRequestDispatcher("/user-form.jsp")
	               .forward(request, response);

	    } else if ("delete".equals(action)) {

	        int id = Integer.parseInt(request.getParameter("id"));

	        userDao.deleteUser(id);

	        response.sendRedirect(request.getContextPath() + "/users");

	    } else {

	        List<User> users = userDao.selectAllUsers();

	        request.setAttribute("users", users);

	        request.getRequestDispatcher("/user-list.jsp")
	               .forward(request, response);
	    }
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
	
	
	protected void doPost(HttpServletRequest request,
	        HttpServletResponse response)
	        throws ServletException, IOException {

	    String action = request.getParameter("action");

	    if ("update".equals(action)) {

	        int id = Integer.parseInt(request.getParameter("id"));

	        String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        String country = request.getParameter("country");

	        User user = new User(id, name, email, country);

	        userDao.updateUser(user);

	        response.sendRedirect(request.getContextPath() + "/users");

	    } else {

	        String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        String country = request.getParameter("country");

	        User user = new User(name, email, country);

	        userDao.insertUser(user);

	        response.sendRedirect(request.getContextPath() + "/users");
	    }
	}

}
