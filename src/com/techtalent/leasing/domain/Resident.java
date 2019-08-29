package com.techtalent.leasing.domain;

public class Resident {
	private String name;
	private int age;
	private int numPets;
	private int numMembers;
	private String contactNumber;
	private String email;
	private String ssn;
	
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
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Resident [name=" + name + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumPets() {
		return numPets;
	}

	public void setNumPets(int numPets) {
		this.numPets = numPets;
	}

	public int getNumMembers() {
		return numMembers;
	}

	public void setNumMembers(int numMembers) {
		this.numMembers = numMembers;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
}
