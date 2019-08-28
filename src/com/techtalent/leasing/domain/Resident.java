package com.techtalent.leasing.domain;

public class Resident {
	private String name;
	
	public Resident() {
		System.out.println("New Resident Enrolled");
	}
	
	public Resident(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resident other = (Resident) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Resident [name=" + name + "]";
	}
	
	
	
	
	
}
