package com.techtalent.leasing;

import java.util.Scanner;

import com.techtalent.leasing.domain.Resident;

public class LeasingMainApplication {
	public static void main(String[] args) {
		
		String ab = "String 1";
		String abNew = new String("String 1");
		String abNew1 = new String("String 1");
		
		System.out.println(ab + abNew);

		
		System.out.println(ab == abNew);
		System.out.println(ab.equals(abNew));
		System.out.println(abNew == abNew1);

		
		Resident resident1 = new Resident("Pragati");
		resident1.setName("Vineet");
		int value1 = 100;
		
		Resident resident2 = new Resident();
		resident2.setName("Wineat");
		int intValue = 100;
		changeResidentName(intValue , resident2);
		
		System.out.println(resident2.getName());
		
		
		System.out.println(intValue);
		System.out.println(resident2.getName());

		System.out.println(resident1 == resident2);
		System.out.println(resident1.equals(resident2));
		System.out.println(value1 == intValue);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String nameFromConsole = scanner.nextLine();
		
		Resident resident3 = new Resident(nameFromConsole);
		
		System.out.println(resident3);
	}
	
	public static void changeResidentName(int numTimes, Resident resident) {
		numTimes = numTimes + 10;
		resident.setName("Vineet");
	}
}

