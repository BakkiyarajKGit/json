package org.objectmapper;

import java.util.List;

public class Resource {
	private String name;
	private String emailid;
	private String phoneno;
	private List<String> course;
	private List<Data> data;
	
    public List<Data> getData() {
		return data;
	}
	public void setData(List<Data> data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public String getEmailid() {
		return emailid;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	
	
	

}
