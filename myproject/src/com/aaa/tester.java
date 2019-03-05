package com.aaa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class tester {

	public static void main(String[] args) {
		List<Integer> primeNumber = new ArrayList<>();
		primeNumber.add(2);
		primeNumber.add(3);
		primeNumber.add(5);
		primeNumber.add(7);
		primeNumber.add(11);
		primeNumber.add(13);
		primeNumber.add(2);
		System.out.println(primeNumber);
		
		Set<String> wrongIntroduce = new HashSet<String>();
		wrongIntroduce.add("I");
		wrongIntroduce.add("am");
		wrongIntroduce.add("a");
		wrongIntroduce.add("student");
		wrongIntroduce.add("I");
		System.out.println(wrongIntroduce);
	}

}
