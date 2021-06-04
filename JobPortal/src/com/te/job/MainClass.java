package com.te.job;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Welcome to TechnoElevate Career Portal\n");
		
		
		Scanner sc = new Scanner(System.in);
		Set<Candidate> set = new HashSet<Candidate>();
		set = Registration.register(sc);
		List<Candidate> list = new ArrayList<Candidate>();
		list = Eligible.selection(set);
		System.out.println("The List of Selected Candidate are,");
		for (Candidate candidate : list) {
			System.out.print(candidate.name);
			for(int i=0;i<35-(candidate.name).length();i++) {
				System.out.print(" ");
			}
			System.out.println(candidate.mobile);
		}
		sc.close();
	}

}
