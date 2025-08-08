package com.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		
		System.out.println("Square of each number");
		list.stream()
			.map(n->n*n)
			.forEach(System.out::println);
		
		Stream<Integer> stream=list.stream();
		
		stream
		.filter(i->(i%2==0))
		.forEach(System.out::println);
		List<Integer> oddNumbers=list.stream()
									 .filter(i->(i%2!=0))
									 .toList();
		oddNumbers.forEach(System.out::println);
		
		List<String> crushlist=Arrays
				.asList("Smriti","Virat","Siraj"
						,"Denis Bura","Shraddha","Rajesh");
		crushlist
		.stream()
		.filter(name->name.startsWith("S"))
		.forEach(System.out::println);
		
		crushlist.stream()
				 .map(n->n.toUpperCase())
				 .forEach(System.out::println);
		System.out.println("=========");
		crushlist.stream()
				 .filter(name->name.startsWith("V"))
				 .map(n->n.toUpperCase())
				 .forEach(System.out::println);
		
	}
}
