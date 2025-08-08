package com.functional;

@FunctionalInterface
interface Demo
{
	void disp();
}
public class Test {

	public static void main(String[] args) {

		Demo d1=new Demo(){

			@Override
			public void disp() {

				System.out.println("Happy Friendship Day!!!");	
			}	
		};
		d1.disp();

		Demo d2	=()->{
			System.out.println("Hi Guys");
		};

	}
}




