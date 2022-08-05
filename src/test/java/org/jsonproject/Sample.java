package org.jsonproject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser=new JSONParser();
		FileReader fileReader=new FileReader("C:\\Users\\KShan\\eclipse-workspace\\jsonproject\\jsonfiles\\emp.json");
		Object obj = jsonparser.parse(fileReader);
		JSONObject jsonobject=(JSONObject)obj;
		
		Object objName = jsonobject.get("name");
		String name=(String)objName;
		System.out.println(name);
		
		Object objemail= jsonobject.get("email");
		System.out.println(objemail);
	}

}
