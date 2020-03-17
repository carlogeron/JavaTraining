package basics;

public class Weather {
	public static void main(String args[]) {
	//suggestion of what to wear based on the weather temp
		
		int temperature = 65;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("It's pleasant. Wear some short and t-shirt");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler. Perhaps wear a long-sleeves shirt and jeans");
			System.out.println("Wear a hat to keep the sun out of eyes.");
		}
		else if ((temperature > 50) || (sunCondition == "Overcast")){
			System.out.println("This is cool day, make sure to wear warmer clothes");
			
		}
		else {
			System.out.println("Looks like a Cold Day");
		}
		System.out.println("End");
 }
}
