package com.techtalent.leasing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.techtalent.leasing.domain.Apartment;
import com.techtalent.leasing.domain.Community;

public class LeasingMainApplication {
	public static void main(String[] args) {
		
		
		Apartment apartment = new Apartment(10);
		
		Apartment apartment1 = new Apartment(10);
		Apartment apartment2 = new Apartment(10);


		System.out.println(apartment.equals(apartment1));
		
		System.out.println(apartment2 == apartment);

		
		System.out.println(apartment.getClass());
		
		List<Apartment> apartments = new ArrayList<Apartment>();
		
		apartments.add(new Apartment(201));
		apartments.add(new Apartment(202));
		apartments.add(new Apartment(203));
		apartments.add(new Apartment(204));
		apartments.add(new Apartment(205));
		apartments.add(new Apartment(206));
		apartments.add(new Apartment(207));

		
		System.out.println(apartments.contains(new Apartment(304)));
		System.out.println(apartments.contains(new Apartment(204)));
		
		
		Map<Integer, Apartment> apartmentMap = new HashMap<>();
		apartmentMap.put(apartment.getApartNumber(), apartment);
		

		
		
		Community community = new Community("Chase", 50, "211 N Ervy", 10);
		community.setPetsAllowed(true);
		community.setHasPlayGround(true);
		
		/*Community community2 = new Community("Camden", 50, "4070 XXX Dr", 10);
		community.setPetsAllowed(false);
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Is there an apartment avaliable?");
		boolean available = community.areApartmentAvailable();
		
		if(available) {
			System.out.println("Are Pets allowed in the community?");
			boolean petsAllowed = community.arePetsAllowed();
			if(petsAllowed) {
				System.out.println("Yes!! Pets are welcome here.");
			}else {
				System.out.println("Sorry!! We can not accomodate pets.");
			}
			System.out.println("Do you have a play gorund?");
			boolean hasPlayGround = community.havePlayGround();
			if(hasPlayGround) {
				System.out.println("Yes!!Kids do have lots of fun here.");
			}else {
				System.out.println("Sorry!! We don't. However there are public parks very near.");
			}
			System.out.println("What all other amenities do you have?");
			community.listAmmenities();
			//Create a class Amenity
			//Create atleast 3 amenities
			//list all the amenities using for each loop
			System.out.println("Give me the list of apartments available with the rent.");
			List<Apartment> availableApartments =  community.getAvailableApartments();
			for (Apartment apartment : availableApartments) {
				System.out.println("Are you intersted? Y/N");
				String interstedStr =  scanner.nextLine();
				if(interstedStr.equals("Y")) {
					//break the for loop and display the apartment number of selected apartment
				}else {
					//Move to the next one
				}
			}
		}else {
			System.out.println("Sorry!!! we don't have anything available right now.");
		}
		
		scanner.close();
	}
	
}

