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
		
		Set<String> introduce = new HashSet<String>();
		introduce.add("I");
		introduce.add("am");
		introduce.add("a");
		introduce.add("student");
		introduce.add("I");
		System.out.println(introduce);
	}

}
