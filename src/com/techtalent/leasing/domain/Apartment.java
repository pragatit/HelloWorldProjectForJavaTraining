package com.techtalent.leasing.domain;

import java.util.LinkedList;
import java.util.Queue;

public class Apartment {
	private int apartNumber;
	private float sizeInSqFoot;
	private int numBedrooms;
	private boolean availability;
	private float baseRent;
	private Community community;
	private Queue<Resident> probableResidents = new LinkedList<>();

	public Apartment(int apartmentNum) {
		apartNumber = apartmentNum;
	}

	public int getApartNumber() {
		return apartNumber;
	}

	public void setApartNumber(int apartNumber) {
		this.apartNumber = apartNumber;
	}

	public float getSizeInSqFoot() {
		return sizeInSqFoot;
	}

	public void setSizeInSqFoot(float sizeInSqFoot) {
		this.sizeInSqFoot = sizeInSqFoot;
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public boolean isAvailable() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public float getBaseRent() {
		return baseRent;
	}

	public void setBaseRent(float baseRent) {
		this.baseRent = baseRent;
	}
	
	public float calculateRent(int numOfPets) {
		float petRent = numOfPets *  this.community.getRentForAPet();
		float rent = this.baseRent * this.sizeInSqFoot;
		
		return petRent + rent;
	}
	
	public void addHold(String name, String contactNumber) {
		probableResidents.add(new Resident(name, contactNumber));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + apartNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Apartment other = (Apartment) obj;
		if (this.apartNumber != other.apartNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Apartment [apartNumber=" + apartNumber + ", sizeInSqFoot=" + sizeInSqFoot + ", numBedrooms="
				+ numBedrooms + ", availability=" + availability + ", baseRent=" + baseRent + ", community=" + community
				+ "]";
	}

	public boolean checkPreference(String name, String contactNumber) {
		Resident resident = probableResidents.peek();
		return resident.equals(new Resident(name, contactNumber));
	}

	public void clearHold() {
		probableResidents.clear();
	}

	public void removeHold() {
		probableResidents.poll();
	}
	

}
