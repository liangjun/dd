package com.liang;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SrvDeleteContact
 */
@WebServlet("/SrvDeleteContact")
public class SrvDeleteContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SrvDeleteContact() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utils.showTime("begin");
		response.setContentType("text/html;charset=utf-8");
		try {
			Controller cc = new Controller();
			String id=request.getParameter("id");;
			cc.DeleteContact(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Utils.showTime("delete contact end");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);   
	}

}
