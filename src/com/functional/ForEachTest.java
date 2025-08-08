package com.functional;

import java.util.Arrays;
import java.util.List;

public class ForEachTest {

	public static void main(String[] args) {
		
		List<String> movies=
				Arrays.asList("Kubera","Bahubali",
						"Kingdom","Business Man","Hanuman");
		movies.forEach(System.out::println);
		movies.forEach(movie->
		System.out.println(movie));
	}
}
