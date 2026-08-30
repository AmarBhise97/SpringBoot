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

	    // Create DAO object when servlet starts
	    @Override
	    public void init() throws ServletException {
	        userDao = new UserDao();
	    }

	    // Handle GET requests
	    @Override
	    protected void doGet(HttpServletRequest request,
	                          HttpServletResponse response)
	            throws ServletException, IOException {

	        String action = request.getParameter("action");

	        // EDIT
	        if ("edit".equals(action)) {

	            int id = Integer.parseInt(request.getParameter("id"));

	            User user = userDao.selectUser(id);

	            request.setAttribute("users", user);

	            request.getRequestDispatcher("user-form.jsp")
	                   .forward(request, response);

	        }

	        // DELETE
	        else if ("delete".equals(action)) {

	            int id = Integer.parseInt(request.getParameter("id"));

	            userDao.deleteUser(id);

	            response.sendRedirect("users");

	        }

	        // LIST ALL USERS
	        else {

	            List<User> users = userDao.selectAllUsers();

	            request.setAttribute("users", users);

	            request.getRequestDispatcher("user-list.jsp")
	                   .forward(request, response);
	        }
	    }

	    // Handle POST requests
	    @Override
	    protected void doPost(HttpServletRequest request,
	                           HttpServletResponse response)
	            throws ServletException, IOException {

	        String action = request.getParameter("action");

	        // UPDATE USER
	        if ("update".equals(action)) {

	            int id = Integer.parseInt(request.getParameter("id"));

	            String name = request.getParameter("name");
	            String email = request.getParameter("email");
	            String country = request.getParameter("country");

	            User user = new User(id, name, email, country);

	            userDao.updateUser(user);

	        }

	        // ADD USER
	        else {

	            String name = request.getParameter("name");
	            String email = request.getParameter("email");
	            String country = request.getParameter("country");

	            User user = new User(name, email, country);

	            userDao.insertUser(user);
	        }

	        // After add/update, go back to user list
	        response.sendRedirect("users");
	    }

}
