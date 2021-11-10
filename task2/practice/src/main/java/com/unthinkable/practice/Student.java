package com.unthinkable.practice;

import java.util.ArrayList;

public class Student {
	
	int id;
	String name;
	ArrayList<Integer> lt;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, ArrayList<Integer> lt) {
		super();
		this.id = id;
		this.name = name;
		this.lt = lt;
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
	public ArrayList<Integer> getLt() {
		return lt;
	}
	public void setLt(ArrayList<Integer> lt) {
		this.lt = lt;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lt=" + lt + "]";
	}
	
	

}
