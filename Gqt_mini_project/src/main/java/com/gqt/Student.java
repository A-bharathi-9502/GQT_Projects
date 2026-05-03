package com.gqt;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
    @Id
    private String sid;
    private String name;
    private String gender;
    private String city;
    private String course;
    private float amount;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Student(String sid, String name, String gender, String city, String course, int amount) {
		super();
		this.sid = sid;
		this.name = name;
		this.gender = gender;
		this.city = city;
		this.course = course;
		this.amount = amount;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
 
}