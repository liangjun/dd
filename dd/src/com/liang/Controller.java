package com.liang;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


public class Controller {
	public List<Contact> getContacts() throws IOException, SQLException{
		DataSource ds = Utils.getDataSource();

		QueryRunner run = new QueryRunner(ds);
		ResultSetHandler<List<Contact>> h = new BeanListHandler<Contact>(Contact.class);
		List<Contact> Contacts = run.query("SELECT * FROM Contact", h);
		return Contacts;
	}
	
	
	public Contact getContact(String id) throws IOException, SQLException{
		DataSource ds = Utils.getDataSource();

		QueryRunner run = new QueryRunner(ds);
		ResultSetHandler<List<Contact>> h = new BeanListHandler<Contact>(Contact.class);
		List<Contact> Contacts = run.query("SELECT * FROM Contact WHERE id='" + id + "'", h);
		return Contacts.get(0);
	}
	
	public void UpdateContact(Contact c) throws SQLException{
		DataSource ds = Utils.getDataSource();
		QueryRunner run = new QueryRunner( ds );
	    run.update( "UPDATE Contact SET " +
		    		"firstname=?," +
		    		"lastname=?," +
		    		"phone=?," +
		    		"email=? " +
		    		"WHERE id=?",
	               c.getFirstname(),
	               c.getLastname(),
	               c.getPhone(),
	               c.getEmail(),
	               c.getId()
	                           );
	}

	public void DeleteContact(String id) throws SQLException {
		DataSource ds = Utils.getDataSource();
		QueryRunner run = new QueryRunner( ds );
	    run.update( "DELETE FROM contact WHERE id = ?", id);
	}
	
	
	public void InsertContact(Contact c) throws SQLException{
		DataSource ds = Utils.getDataSource();
		QueryRunner run = new QueryRunner( ds );
	    run.update( "INSERT INTO contact " +
	    		"(firstname," +
	    		"lastname," +
	    		"phone," +
	    		"email," +
	    		"id) values (?,?,?,?,?)",
	               c.getFirstname(),
	               c.getLastname(),
	               c.getPhone(),
	               c.getEmail(),
	               c.getId()
	               );
	}
		

}
