package com.hospitalmanagment.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.hospitalmanagment.bean.Hospital;
import com.hospitalmanagment.dao.HospitalDao;

/**
 * Servlet implementation class HospitalServlet
 */
@WebServlet("/hospital")
public class HospitalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public HospitalDao hospitaldao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HospitalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		hospitaldao=new HospitalDao();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		if("edit".equals(action)) {
			int hospitalid= Integer.parseInt(request.getParameter("hospitalid"));
			Hospital hospital=hospitaldao.gethospital(hospitalid);
			request.setAttribute("hospital", hospital);
			request.getRequestDispatcher("hospital-from.jsp").forward(request, response);
		}
		else if("delete".equals(action)) {
			int hospitalid=Integer.parseInt(request.getParameter("hospitalid"));
			hospitaldao.deleteHospital(hospitalid);
			response.sendRedirect("hospital");
			
			
			
		}
		else {
			List<Hospital> hos = hospitaldao.getallHospital();
			request.setAttribute("hospital", hos);
			request.getRequestDispatcher("hospital-list.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if("update".equals(action)) {
			int hospitalid = Integer.parseInt(request.getParameter("hospitalid"));
			String hospitalname=request.getParameter("hospitalname");
			String hospitaladdress = request.getParameter("hospitaladdress");
			double hospitalfess = Double.parseDouble(request.getParameter("hospitalfees"));
			
			Hospital hospital = new Hospital(hospitalid,hospitalname,hospitaladdress,hospitalfess);
			hospitaldao.updatehospital(hospital);
		}
		else {

		    String hospitalname =
		            request.getParameter("hospitalname");

		    String hospitaladdress =
		            request.getParameter("hospitaladdress");

		    double hospitalfees =
		            Double.parseDouble(
		                    request.getParameter("hospitalfees")
		            );

		    Hospital hos = new Hospital(
		            hospitalname,
		            hospitaladdress,
		            hospitalfees
		    );

		    hospitaldao.createHospital(hos);
		}
		response.sendRedirect("hospital");
	}

}
