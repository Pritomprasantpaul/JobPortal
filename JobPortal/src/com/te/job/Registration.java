package com.te.job;

import java.util.*;

public class Registration {

	public static Set<Candidate> register(Scanner sc) {
		Set<Candidate> set = new HashSet<Candidate>();

		System.out.println("Enter The Candidates Details");
		while(true) {
			boolean isDuplicate = false;
			System.out.print("Enter the name: ");
			String name = sc.nextLine();
			System.out.print("Enter the Gender (M/F):");
			char gender = sc.next().charAt(0);
			System.out.print("Enter Percentage: ");
			double per = sc.nextDouble();
			System.out.println("Enter The Year of Passout");
			int yop=sc.nextInt();
			System.out.print("Enter Mobile: ");
			long mob = sc.nextLong();

			for (Candidate candidate : set) {
				if(candidate.mobile==mob) {
					isDuplicate=true;
					System.err.println("Duplicate Values Are not Allowed");
					break;
				}
			}
			if(!isDuplicate)
				set.add(new Candidate(name, gender, per, yop, mob));
			System.out.println();
			System.out.println("Do you want to add more?Y/N");
			String ans = sc.next();
			sc.nextLine();
			if(ans.equalsIgnoreCase("Y"))
				continue;
			else
				break;
		}
		return set;
	}
}