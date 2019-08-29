package com.techtalent.leasing.domain;

import java.util.ArrayList;
import java.util.List;

public class Community {
	private String community; 
	private float rentForAPet;
	private String address;
	
	private List<Apartment> apartments;
	
	
	public Community(String name, float rentForAPet,String address, int numOfApartments) {
		this.community = name;
		this.rentForAPet = rentForAPet;
		this.address = address;
		
		apartments = new ArrayList<>();
		
		for (int i = 0; i < numOfApartments ; i ++) {
			Apartment apartment = new Apartment();
			apartments.add(apartment);
			apartment.setApartNumber(i + 1);
			apartment.setAvailability(true);
			apartment.setBaseRent(10);
			apartment.setNumBedrooms(2);
			apartment.setSizeInSqFoot(1000);
		}
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

	public boolean areApartmentAvailable() {
		for (int i = 0 ; i < apartments.size() ; i++) {
			if(apartments.get(i).isAvailable()) {
				return true;
			}
		}
		return false;
	}
	
	
}
