package com.tka.jan18;

public class Player {
	String name;
	int age;
	int jersy_no;
	String role;
	int runs;
	int wickets;

	Player(String name, int age,int jersy_no, String role, int runs, int wickets) {
		this.name=name;
		this.age=age;
	    this.jersy_no=jersy_no;
	    this.role=role;
	    this.runs=runs;
	    this.wickets=wickets;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>0) {
			this.name = name;
		}
	}
	
	public int getJersy_no() {
		return jersy_no;
	}

	public void setJersy_no(int jersy_no) {
		this.jersy_no = jersy_no;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	

}
