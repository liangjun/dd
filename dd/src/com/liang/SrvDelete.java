package com.liang;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SrvDelete
 */
@WebServlet("/SrvDelete")
public class SrvDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrvDelete() {
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
		//response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String func = request.getParameter("func").toString() ;
		BufferedReader br = request.getReader();
		
		
		
		String lines;
        StringBuffer sb = new StringBuffer("");
        while ((lines = br.readLine()) != null) {
            lines = new String(lines.getBytes(), "utf-8");
            sb.append(lines);
        }		
		
        String s = sb.toString();
        System.out.println(s);
        
		String id = Utils.getValueFromJsonStr(s, "id").toString(); 
		
		switch(func) {

	        case "Controller.DeleteContact":
	    		Controller cc = new Controller();
	    		try {
	    			cc.DeleteContact(id);
	    		} catch (SQLException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	            break;
	}	

		
		
		

		Utils.showTime("SrvDelete end");
	
	}
	

}
