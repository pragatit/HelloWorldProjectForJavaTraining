package com.techtalent.leasing.domain;

public class Apartment {
	private int apartNumber;
	private float sizeInSqFoot;
	private int numBedrooms;
	private boolean availability;
	private float baseRent;
	private Community community;

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
	
	public float calculateRent(Resident resident) {
		float petRent = resident.getNumPets() *  this.community.getRentForAPet();
		float rent = this.baseRent* this.sizeInSqFoot;
		
		return petRent + rent;
	}

}
