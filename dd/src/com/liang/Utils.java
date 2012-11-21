package com.liang;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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
	        DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/DBPool");//�̶�����  
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
		HashMap<String, String> hash = new HashMap<String, String>() ;
		hash.put("cc", "aaaaa");
		System.out.print(hash.get("cc"));
		
		//System.out.print("{\"product\":\"pencil\",\"price\":12,\"item\":[{\"id\":1,\"name\":\"chen\"}]}");
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
	
	public static Object getValueFromJsonStr(String jsonStr,String key){
		Utils.showTime("begin");
		
		Gson gson = new Gson();
		Type type=  new TypeToken<Map<String, String>>(){}.getType();
		Map<String, Object> map = gson.fromJson(jsonStr, type);
		Utils.showTime("getValueFromJson end");
		return map.get(key).toString();
	}
	
	public static String getBufferedString(BufferedReader br) throws IOException{
		String lines;
        StringBuffer sb = new StringBuffer();
        while ((lines = br.readLine()) != null) {
            lines = new String(lines.getBytes());
            sb.append(lines);
        }		
		return sb.toString();
	}
	


	

	

}
