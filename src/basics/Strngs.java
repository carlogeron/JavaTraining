package basics;

public class Strngs {
	public static void main(String args[]) {
	String bookTitle;
	String wordChoice = "Ring";
	bookTitle = "The Lord of The Rings";
	
	if(bookTitle.contains("Ring")) {
		System.out.println("The book contains the word " + wordChoice);
	}
	
	String browser = "Chrome";
	//if (browser == "chrome")
	if (browser.equalsIgnoreCase("chrome")) {
		System.out.println("The browser is chrome");
	}
	
	String firstName = "Carlo";
	String lastName = "Geron";
	String SSN = "09053192863";
	
	System.out.println("There are " + SSN.length() + " digits in your SSN"  ); //Total digits of variable because of SSN.length
	System.out.print(firstName.substring(0, 1));
	System.out.print(lastName.substring(0, 3));
	System.out.println(SSN.substring(7)); //printing last four digit of SSN
	
	
	}
}
