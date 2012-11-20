package com.liang;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SrvGetValue
 */
@WebServlet("/SrvGetValue")
public class SrvGetValue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrvGetValue() {
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
		request.setCharacterEncoding("utf-8");
		String func = request.getParameter("func").toString() ;
		
//		String func_param1 = request.getParameter("func_param1").toString() ;
//		String func_param2 = request.getParameter("func_param2").toString() ;
		
		PrintWriter out = response.getWriter();
		
		switch(func) {
	        case "getGuid":
	        	out.println(Utils.getGuid());
	            break;
	        case "def":
	        	out.println(Utils.getGuid());
	            break;
	        default:
	        	out.println("");
        }
		
		
		Utils.showTime("SrvGetValue end");
		   
	}

}
