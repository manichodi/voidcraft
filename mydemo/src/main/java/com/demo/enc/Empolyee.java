package com.demo.enc;

//Encapsulation : holding the data into single entity is nothing but 
// how to achieve ?:  Data, Model,POJO class 
//the class which is having the data members and does not have the declaration 
//we should have the setters and getters for the data members 
// this.id =id --> this is one of the reserved word in java
//which helps to set the values to the data members .(with in the class only)
//class
//object
//Inheritance
//polymorphism
//abstraction
//encapsulation
public class Empolyee {

	int id;
	String name;
	String email;
	public Object get;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
