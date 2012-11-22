package com.liang;

import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/**
 * Servlet implementation class SrvUpdate
 */
@WebServlet("/SrvUpdate")
public class SrvUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrvUpdate() {
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
        String s = Utils.getBufferedString(request.getReader());
        System.out.println(s);
        
		Gson gson = new Gson();
		Type type;
		
		switch(func) {
	        case "Controller.UpdateContact":
	    		type = new TypeToken<Contact>(){}.getType(); 
	    		Contact c1 = gson.fromJson(s, type);		
	    		Controller cc = new Controller();
	    		try {
	    			cc.UpdateContact(c1);
	    		} catch (SQLException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	
	            break;
	        case "Controller.InsertContact":
	    		type = new TypeToken<Contact>(){}.getType(); 
	    		Contact c2 = gson.fromJson(s, type);		
	    		Controller cc1 = new Controller();
	    		try {
	    			cc1.InsertContact(c2);
	    		} catch (SQLException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	
	            break;
	}	

		
		
		

		Utils.showTime("SrvUpdate end");
	}

}
