package com.techtalent.leasing.domain;

import java.util.HashMap;
import java.util.Map;

public class Community {
	private String community; 
	private float rentForAPet;
	private String address;
	private boolean petsAllowed;
	private boolean hasPlayGround;
	private Map<Integer, Apartment> apartments;
	
	
	public Community(String name, float rentForAPet,String address, int numOfApartments) {
		this.community = name;
		this.rentForAPet = rentForAPet;
		this.address = address;
		
		apartments = new HashMap<>();
		
		for (int i = 0; i < numOfApartments ; i ++) {
			int apartmentNum = i + 1;
			Apartment apartment = new Apartment(apartmentNum);
			apartments.put(apartmentNum, apartment);
			apartment.setAvailability(true);
			apartment.setBaseRent(10);
			apartment.setNumBedrooms(2);
			apartment.setSizeInSqFoot(1000);
		}
	}
	
	public boolean isPetsAllowed() {
		return petsAllowed;
	}

	public void setPetsAllowed(boolean petsAllowed) {
		this.petsAllowed = petsAllowed;
	}


	public Map<Integer, Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(Map<Integer, Apartment> apartments) {
		this.apartments = apartments;
	}

	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public float getRentForAPet() {
		return rentForAPet;
	}
	public void setRentForAPet(float rentForAPet) {
		this.rentForAPet = rentForAPet;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void setHasPlayGround(boolean hasPlayGround) {
		this.hasPlayGround = hasPlayGround;
	}

	public boolean areApartmentAvailable() {
		//for each apartment in apartments list
		for(Apartment aprt : apartments.values()) {
			if(aprt.isAvailable()) {
				return true;
			}
		}
		return false;
	}
	
	public Apartment getApartment(int apartmentNum) {
		/*for(Apartment aprt : apartments) {
			if(aprt.getApartNumber() == apartmentNum) {
				return aprt;
			}
		}
		return null;*/
		return apartments.get(apartmentNum);
	}
	
	public boolean arePetsAllowed() {
		return petsAllowed;
	}

	public boolean havePlayGround() {
		return hasPlayGround;
	}
	
}
