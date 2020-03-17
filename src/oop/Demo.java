package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking ");
		
	} 
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping ");
	}
}

public class Demo { 
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Carlo";
		person1.email = "cmgeron11@gmail.com";
		person1.phone = "09053192863";
		
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		person2.name = "Geron";
		
		person2.walk();
		
		/*
	
	
		String name = "Carlo";
		String email = "cmgeron@gmail.com";
		String phone = "09053192863";
		
		String name2 = "Geron";
		String email2 = "geroncmn@gmail.com";
		String phone2 = "09164869752";
		
		
		walking(name);
		System.out.println(name + " is eating");
	
		walking(name2);
		System.out.println(name2 + " is eating");
		
		
		
	}
	//Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking");
	*/	
	}
	
	 
}
