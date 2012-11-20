package com.liang;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SrvQuery
 */
@WebServlet("/SrvQuery")
public class SrvQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrvQuery() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utils.showTime("begin");
		response.setContentType("text/html;charset=utf-8");
		String func = request.getParameter("func").toString() ;
		
		
		PrintWriter out = response.getWriter();
		
		switch(func) {
	        case "Controller.getContact":
	        	Controller cc = new Controller();
	        	String id = request.getParameter("id").toString() ;
				try {
					out.println(Utils.objToJson(cc.getContact(id)));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
	            break;
	        case "Controller.getContacts":
	        	Controller ccs = new Controller();
				try {
					out.println(Utils.objToJson(ccs.getContacts()));
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
	            break;
	        default:
	        	out.println("");
		}
		
		Utils.showTime("SrvQuery end");
	}

}
