package com.wiley.springcore.ci;



public class Person {
	private  String name;
	private int PersonId;
	private Certi certi;
	public int getPersonId() {
		return PersonId;
	}
	public void setPersonId(int personId) {
		PersonId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(String name, int personId, Certi certi ){
		super();
		this.name = name;
		this.PersonId = personId;
		this.certi=certi;
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", PersonId=" + PersonId + ",  certi="+certi.name;
		}
}
