package com.liang;

import java.util.UUID;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.google.gson.Gson;

public class Utils {

	/**
	 * @param args
	 */
	static long timestamp = System.currentTimeMillis();
	public static void main(String[] args) {
		
		//showTime();
		test();

	}
	
	public static long showTime(String str){
		long current = System.currentTimeMillis();
		long elapsed = current - timestamp;
		if(str!="begin"){
			System.out.println(str +  ":" + elapsed);			
		}
		timestamp = current;
		return elapsed;
	}
	

	public static DataSource getDataSource(){
	    try {  
	        Context ctx = new InitialContext();  
	        DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/DBPool");//¹Ì¶¨²ÎÊý  
	        return ds;  
	    } catch (Exception e) {  
	        e.printStackTrace();  
	        return null;  
	    }  
		
	}
	
	
	public static String objToJson(Object o) {
		Gson gson = new Gson();
		return gson.toJson(o);
	}
	
//	@SuppressWarnings("unchecked")
//	public <T> T JsonToObj(String str){
//		Gson gson = new Gson();
//		Type type =(Class<T>) getClass();  
//		T o = gson.fromJson(str, type );
//		return o;
//	}
	
	public static void test() {

//			DataSource ds = Utils.getDataSource();
//
//			QueryRunner run = new QueryRunner(ds);
//			ResultSetHandler<List<Contact>> h = new BeanListHandler<Contact>(Contact.class);
//			List<Contact> Contacts = run.query("SELECT * FROM Contact", h);
//			return;

		
	}
	
	public static String[] getGuids()
	{
		String[] s = new String[100];
		int i;
		for(i=0;i<100;i++){
			s[i]= UUID.randomUUID().toString();
		}
		return s;
	}
	
	public static String getGuid(){
		return UUID.randomUUID().toString();
	}
	


	

	

}
