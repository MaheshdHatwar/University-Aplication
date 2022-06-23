//package com.student.info.entities;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Student {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	private String name;
//	private long marks;
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public long getMarks() {
//		return marks;
//	}
//	public void setMarks(long marks) {
//		this.marks = marks;
//	}
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
//	}
//	public Student(int id, String name, long marks) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.marks = marks;
//	}
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	
//}
