package org.jsonproject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SingleUser {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser=new JSONParser();
		FileReader fileReader=new FileReader("C:\\Users\\KShan\\eclipse-workspace\\jsonproject\\jsonfiles\\singleuser.json");
		Object obj = jsonparser.parse(fileReader);
		JSONObject jsonobject=(JSONObject)obj;
		
		Object data = jsonobject.get("data");
		JSONObject j=(JSONObject)data;
		Object objid = j.get("id");
		Object email = j.get("email");
		Object firstName = j.get("first_name");
		Object lastName = j.get("last_name");
		Object avatar = j.get("avatar");
		
		System.out.println("id :"+objid);
		System.out.println("Email: "+email);
		System.out.println("FirstName: "+firstName);
		System.out.println("LastName: "+lastName);
		System.out.println("Avatar: "+avatar);
		System.out.println("");
		
		Object suport = jsonobject.get("support");
		JSONObject su=(JSONObject)suport;
		Object url = su.get("url");
		Object text = su.get("text");
		
		System.out.println(url);
		System.out.println(text);

	}

}
