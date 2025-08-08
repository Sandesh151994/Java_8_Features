package com.functional;

interface PaymentService
{
	void makePayment();
}
class DebitCard 
{
	static void makePaymentUsingDebit()
	{
		System.out.println("Making Payment using Debit Card");
	}
}

public class MethodReference {

	public static void main(String[] args) {
		
		DebitCard dc=new DebitCard();
		PaymentService ps1=()->
							System.out.println("Making payment using credit card");
		
		PaymentService ps=DebitCard::makePaymentUsingDebit;
		ps.makePayment();
		ps1.makePayment();
	}
}
