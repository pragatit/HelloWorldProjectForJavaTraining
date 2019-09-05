package com.techtalent.leasing.domain;

public class Amenity {
	private boolean kidsAccess;
	private String type;
	private double charge;
	
	public Amenity(boolean kidsAccess, String type, double charge) {
		this.kidsAccess = kidsAccess;
		this.type = type;
		this.charge = charge;
	}

	public boolean isKidsAccess() {
		return kidsAccess;
	}

	public void setKidsAccess(boolean kidsAccess) {
		this.kidsAccess = kidsAccess;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	@Override
	public String toString() {
		return "Amenity [kidsAccess=" + kidsAccess + ", type=" + type + ", charge=" + charge + "]";
	}

}
