package oop;

public class BankAccountApp {
	public static void main(String [] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "123456789";
		//acc1.name = "Carlo Geron";
		//Encapsulation
		acc1.setname("Carlo Geron");
		System.out.println(acc1.getName());
		System.out.println("SSN: " + acc1.getSSN());
		acc1.setSSN("123456789");
		acc1.balance = 0;
		acc1.setRate();
		acc1.increaseRate();
		
		//POLYMORPHISM THROUGH OVERLOADING
		
		acc1.deposit(1500);
		
		//POLYMORPHISM THROUGH OVERLOADING
		
		System.out.println(acc1.toString());
		
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "123456789";
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "123456789";
		
		/*
		acc3.checkBalance();
		
		//Demo for Inheritance
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Carlo";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString()); 
		cd1.compount();
		
		//System.out.println(acc1.routingNumber);
		//System.out.println(acc2.routingNumber);
		//System.out.println(acc3.routingNumber);
		*/
	}
}
