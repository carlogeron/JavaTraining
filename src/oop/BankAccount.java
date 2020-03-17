package oop;

public class BankAccount implements  IRate {
	
		
		String accountNumber;
		private	static final String routingNumber = "987654321";
		private String name;
		private String SSN;
		String accountType;
		double balance = 0;
		
		//Constructor 
		BankAccount(){
			System.out.println("NEW ACCOUNT CREATED");
		}
		
		//Overloading
		
		BankAccount(String accountType){
			System.out.println("NEW ACCOUNT: " + accountType);
		}
		
		BankAccount(String accountType, double initDeposit){
			System.out.println("NEW ACCOUNT: " + accountType);
			System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
			String Msg = "";
			if (initDeposit < 1000) {
				 Msg = "ERROR: Minimum deposit must be at least 1000";
				
			}
			else {
				
				 Msg = "Thanks for your initial deposit of $" + initDeposit;
				
			}
			System.out.println(Msg);	
			balance = balance+initDeposit;
		}
		
		//Getter / Setter

				// Allow the user to define the name

			public void setname (String name) {
				this.name = "Mr. " + name;  
			}
			public String getName() {
				return name;
			}
			
			
		public String getSSN() {
				return SSN;
			}

			public void setSSN(String sSN) {
				SSN = sSN;
			}
			
			//Interface Method
			
			public void setRate() {
				System.out.println("SETTING RATE");
			}
			
			public void increaseRate() {
				System.out.println("INCREASING RATE");
			}
			
			
			
			//Methods
		public void deposit(double amount){
			
			balance = balance + amount;
			showActivity("DEPOSIT");
				
		}
		
		void withdraw(double amount){
			
			balance = balance + amount;
			showActivity("WITHDRAW");
		
		}
		
		private void showActivity(String activity) {
			System.out.println("YOUR RECENT TRANSACTION: " + activity);
			System.out.println("YOUR NEW BALANCE IS: $ " + balance);
		}
		
		
		
		void checkBalance() {
			System.out.println("Balance is: " + balance );
		}
		
		void getStatus() {
			
		}
		
		@Override
		public String toString() {
			return "[ NAME: " + name + ". ACCOUNT#: " + accountNumber +	 ". ROUTING# " + routingNumber + " BALANCE: $" + balance + " ]"; 
		}
		
		
	}


