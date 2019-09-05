package com.techtalent.leasing;

import java.util.List;
import java.util.Scanner;

import com.techtalent.leasing.domain.Amenity;
import com.techtalent.leasing.domain.Apartment;
import com.techtalent.leasing.domain.Community;

public class LeasingMainApplication {
	public static void main(String[] args) {

		Community community = new Community("Chase", 50, "211 N Ervy", 10);
		community.setPetsAllowed(true);
		community.setHasPlayGround(true);
		Amenity amenity = new Amenity(true, "pool", 0);
		community.addAmenity(amenity);
		community.addAmenity(new Amenity(false, "jym", 0));
		community.addAmenity(new Amenity(false, "washer/dryer", 10));

		/*
		 * Community community2 = new Community("Camden", 50, "4070 XXX Dr", 10);
		 * community.setPetsAllowed(false);
		 */

//		System.out.println(Math.random() * 10);

		System.out.println(community);

		Scanner scanner = new Scanner(System.in);

		do {

			System.out.println("Name : ");
			String name = scanner.nextLine();
			System.out.println("Contact number : ");
			String contactNumber = scanner.nextLine();

			System.out.println("Is there an apartment avaliable?");
			boolean available = community.areApartmentAvailable();

			if (available) {
				System.out.println("Are Pets allowed in the community?");
				boolean petsAllowed = community.arePetsAllowed();
				if (petsAllowed) {
					System.out.println("Yes!! Pets are welcome here.");
				} else {
					System.out.println("Sorry!! We can not accomodate pets.");
				}
				System.out.println("Do you have a play gorund?");
				boolean hasPlayGround = community.havePlayGround();
				if (hasPlayGround) {
					System.out.println("Yes!!Kids do have lots of fun here.");
				} else {
					System.out.println("Sorry!! We don't. However there are public parks very near.");
				}
				System.out.println("What all other amenities do you have?");
				community.listAmmenities();
				System.out.println("Give me the list of apartments available with the rent.");
				List<Apartment> availableApartments = community.getAvailableApartments();
				for (Apartment apartment : availableApartments) {
					System.out.println(apartment);
					System.out.println("Are you intersted? Y/N");
					String interstedStr = scanner.nextLine();
					if (interstedStr.equals("Y")) {
						System.out.println("This is the rent for the choosen apartment.");
						System.out.println(apartment.calculateRent(2));
						System.out.println("Are you ok with it? Y/N");
						interstedStr = scanner.nextLine();
						if (interstedStr.equals("Y")) {
							apartment.addHold(name, contactNumber);
							break;
						}
					} else {
						System.out.println("Let's check other available apartments");
					}
				}
			} else {
				System.out.println("Sorry!!! we don't have anything available right now.");
			}
			
			System.out.println("Anyone else ? Y/N");
			
		}while(scanner.nextLine().equals("Y"));
		
		//Visiting in person
		
		do {
			
			System.out.println("Name : ");
			String name = scanner.nextLine();
			System.out.println("Contact number : ");
			String contactNumber = scanner.nextLine();
			
			System.out.println("Enter your apartment number: ");
			String apartmentNum = scanner.nextLine();
			
			Apartment apartment = community.getApartment(Integer.parseInt(apartmentNum));
			
			if(!apartment.isAvailable()) {
				System.out.println("Sorry!!! It is already gone!!");
			}else {
				if(apartment.checkPreference(name, contactNumber)) {
					System.out.println("Let's check the apartment");
					System.out.println("Are you ok with it? Y/N");
					String interstedStr = scanner.nextLine();
					if(interstedStr.equals("Y")) {
						apartment.setAvailability(false);
						apartment.clearHold();
						apartment.setResident();//TODO attach resident with an apartment
					}else {
						apartment.removeHold();
					}
				}
			}
			
			System.out.println("Anyone else ? Y/N");
		}while(scanner.nextLine().equals("Y"));
		
		scanner.close();
	}

}
