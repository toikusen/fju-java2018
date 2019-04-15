package com.tom.aaa;

import java.util.HashMap;
import java.util.Random;

public class Map {

	public static void main(String[] args) {
		java.util.Map<Integer,Integer> m = new HashMap<>();


		m.put(1, 38);

		m.put(6, 77);

		System.out.println(m.get(38));
		System.out.println(m.get(6));
		System.out.println(m);

	}

}
