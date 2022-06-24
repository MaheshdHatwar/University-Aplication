package com.universities.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {

	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int toatalNum;
	public University(int id, String name, int toatalNum) {
		super();
		this.id = id;
		this.name = name;
		this.toatalNum = toatalNum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalNum() {
		return toatalNum;
	}
	public void setTotalNum(int toatalNum) {
		this.toatalNum = toatalNum;
	}
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", toatalNum=" + toatalNum + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, toatalNum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		University other = (University) obj;
		return id == other.id && Objects.equals(name, other.name) && toatalNum == other.toatalNum;
	}
	
}
