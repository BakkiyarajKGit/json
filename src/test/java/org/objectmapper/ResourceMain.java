package org.objectmapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ResourceMain {

	public static void main(String[] args) throws IOException {

		ObjectMapper objectMapper = new ObjectMapper();
		Resource rv = objectMapper.readValue(
	    new File("C:\\Users\\KShan\\eclipse-workspace\\jsonproject\\jsonfiles\\resource.json"), Resource.class);
		String name = rv.getName();
		String emailid = rv.getEmailid();
		String phoneno = rv.getPhoneno();

		System.out.println(name);
		System.out.println(emailid);
		System.out.println(phoneno);

		List<String> course = rv.getCourse();
		System.out.println(course);
		
		System.out.println("*************************");

		List<Data> data = rv.getData();
		for (int i = 0; i < data.size(); i++) {
			Data d = data.get(i);
			System.out.println(d.getName());
			System.out.println(d.getId());
			System.out.println(d.getYear());
			System.out.println(d.getColor());
			System.out.println(d.getPantone_value());
		}
	}

}
