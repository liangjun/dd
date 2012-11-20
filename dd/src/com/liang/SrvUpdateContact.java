package com.liang;

import java.io.BufferedReader;
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
 * Servlet implementation class GetContact
 */
@WebServlet("/SrvUpdateContact")
public class SrvUpdateContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SrvUpdateContact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utils.showTime("begin");
		//response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		BufferedReader br = request.getReader();
		
		
		String lines;
        StringBuffer sb = new StringBuffer("");
        while ((lines = br.readLine()) != null) {
            lines = new String(lines.getBytes(), "utf-8");
            sb.append(lines);
        }		
		
        String s = sb.toString();
        System.out.println(s);
        
		Gson gson = new Gson();
		
		Type type = new TypeToken<Contact>(){}.getType(); 
		
		Contact c = gson.fromJson(s, type);
		
		
		
		Controller cc = new Controller();
		try {
			cc.UpdateContact(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Utils.showTime("SrvSaveContact end");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);   
	}

}