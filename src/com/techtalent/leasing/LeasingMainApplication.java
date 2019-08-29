package com.techtalent.leasing;

import java.util.Scanner;

import com.techtalent.leasing.domain.Community;

public class LeasingMainApplication {
	public static void main(String[] args) {
		
		Community community = new Community("Chase", 50, "211 N Ervy", 10);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Is there an apartment avaliable?");
		
		community.areApartmentAvailable();
		
		scanner.close();
	}
	
}

