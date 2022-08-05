package org.jsonproject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListofUsers {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser=new JSONParser();
		FileReader reader=new FileReader("C:\\Users\\KShan\\eclipse-workspace\\jsonproject\\jsonfiles\\listofuser.json");
		Object obj = jsonparser.parse(reader);
		
		JSONObject jsonobject=(JSONObject)obj;
		
		Object page = jsonobject.get("page");
		Object per_page = jsonobject.get("per_page");
		Object total = jsonobject.get("total");
		Object total_pages = jsonobject.get("total_pages");
		
		System.out.println("page :"+"\t"+page);
		System.out.println("per_page :"+per_page);
		System.out.println("total :"+total);
		System.out.println("total_pages :"+total_pages);
		System.out.println("");
		
		JSONArray jsonarray=(JSONArray)jsonobject.get("data");
		for (int i = 0; i < jsonarray.size(); i++)
		{
			JSONObject address = (JSONObject) jsonarray.get(i);
			
			Object id = address.get("id");
			Object email = address.get("email");
			Object firstName = address.get("first_name");
			Object lastName = address.get("last_name");
			Object avatar = address.get("avatar");
			
			System.out.println("id :"+id);
			System.out.println("Email: "+email);
			System.out.println("FirstName: "+firstName);
			System.out.println("LastName: "+lastName);
			System.out.println("Avatar: "+avatar);
			System.out.println("");
		}
		Object suport = jsonobject.get("support");
		JSONObject su=(JSONObject)suport;
		Object url = su.get("url");
		Object text = su.get("text");
		
		System.out.println(url);
		System.out.println(text);
	}

}
