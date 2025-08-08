package com.functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface Calculator
{
	int calculate(int a,int b);
}
public class Operations {

	public static void main(String[] args) {
		
		Calculator add=(x,y)->{
			return x+y;
		};
		System.out.println(add.calculate(10, 30));
		
		Calculator multiple=(m,n)->m*n;
		System.out.println(multiple.calculate(2, 4));
		List<String> names=Arrays
				.asList("Vinay","Nithish",
						"Prajwal","Vaishnavi","Vidhya"
						,"Kempi Konankunte",
						"Rossy Raymonds","Nancy");
		Collections.sort(names,(a,b)
						->a.compareTo(b));
		System.out.println(names);
	}
}
