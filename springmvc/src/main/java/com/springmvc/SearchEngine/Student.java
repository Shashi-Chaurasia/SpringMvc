package com.springmvc.SearchEngine;

import java.util.List;

public class Student {
	private String name;
	private String emial;
	private String pnumber;
	private String pass;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", emial=" + emial + ", pnumber=" + pnumber + ", pass=" + pass + ", courses="
				+ courses + ", checkbox=" + checkbox + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	public String getPnumber() {
		return pnumber;
	}
	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getCheckbox() {
		return checkbox;
	}
	public void setCheckbox(String checkbox) {
		this.checkbox = checkbox;
	}
	private List<String> courses;
	private String checkbox;
}
