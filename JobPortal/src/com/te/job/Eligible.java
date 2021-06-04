package com.te.job;

import java.util.*;

public class Eligible {
	
	
	static List<Candidate> selection(Set<Candidate> set) {
		List<Candidate> list = new ArrayList<Candidate>();
		for (Candidate candidate : set) {
			if(candidate.percentage>=60.0 && candidate.yearOfPass==2021)
				list.add(candidate);
		}
		return list;
	}

}