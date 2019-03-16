import java.util.Scanner;

public class MakeChange {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		boolean keepShopping = true;
		System.out.println("Welcome to Billy's Bait and Tackle.\nY'all take a look around\n");
		pause();
		System.out.println("Well that was fast. You must be a regular.");

		do {
			double price = getPrice();
			double moneyGiven = getCustomerCash(price);

			double changeNeeded = moneyGiven - price;

			System.out.println(
					"Thank you for the $" + moneyGiven + ". I owe you $" + String.format("%.2f", changeNeeded));
			if (changeNeeded == 0) {
				System.out.println("Would you like to keep shopping? Yes or No");
				String choice = scan.next();
				if (choice.equalsIgnoreCase("Yes")) {
					continue;
				} else if (choice.equalsIgnoreCase("No")) {
					System.out.println("See ya next time");
					keepShopping = false;
				} else {
					System.out.println("I didn't understand that so see ya.");
					keepShopping = false;
				}
			}
			getChange(changeNeeded);
			System.out.println("Would you like to keep shopping? Yes or No");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("yes")) {
				keepShopping = true;
			} else {
				keepShopping = false;
			}

		} while (keepShopping);

	}

	public static void makeChange(double changeNeeded) {

		while (changeNeeded != 0) {

		}
	}

	public static double getPrice() throws Exception {
		System.out.println("What is the price of your item?");
		double price = scan.nextDouble();

		while (price <= 0) {

			System.out.println("That isnt the price");
			pause();
			
			System.out.println("Do you want to enter the real price? Yes?");
			String answer = scan.next();
			if (answer.equalsIgnoreCase("Yes")) {
				System.out.println("Ok what is the real price?");
				price = scan.nextDouble();

			} else {
				System.exit(0);
			}

		}

		return price;
	}

	public static double getCustomerCash(double price) throws Exception {
		System.out.println("How much money are you giving me?");
		double moneyGiven = scan.nextDouble();

		while (price > moneyGiven) {
			double difference = price - moneyGiven;
			System.out.println("That isn't enought money.\nYou still owe $"
					+ String.format("%.2f", difference) + " more.\nDo you have any more to add? Yes or No");

			String answer = scan.next();
			if (answer.equalsIgnoreCase("no")) {
				System.out.println("Sorry, try again next time.");
				System.exit(0);
			} else if (answer.equalsIgnoreCase("yes")) {
				System.out.println("How much more are you giving me?");
				moneyGiven += scan.nextDouble();

			} else {
				System.out.println("I didn't understand that");
			}
		}
		return moneyGiven;
	}

	public static void getChange(double changeNeeded) throws Exception{
		System.out.println("Give me one second to count your change");
		pause();
		pause();
		System.out.println("I owe you");

		int count20 = 0;
		while (changeNeeded > 20) {
			changeNeeded -= 20;
			count20++;
		}
		if (count20 > 0)
			System.out.print(count20 + " twenties, ");
			pause();
			
			
		int count10 = 0;
		while (changeNeeded > 10) {
			changeNeeded -= 10;
			count10++;
		}
		if (count10 > 0)
			System.out.print(count10 + " tens, ");
			pause();
			
			
		int count5 = 0;
		while (changeNeeded > 5) {
			changeNeeded -= 5;
			count5++;
		}
		if (count5 > 0)
			System.out.print(count5 + " fives, ");
			pause();
			
			
		int count1 = 0;
		while (changeNeeded > 1) {
			changeNeeded -= 1;
			count1++;
		}
		if (count1 > 0)
			System.out.print(count1 + " ones, ");
			pause();
			
			
		int count_25 = 0;
		while (changeNeeded > .25) {
			changeNeeded -= .25;
			count_25++;
		}
		if (count_25 > 0)
			System.out.print(count_25 + " quarters, ");
			pause();
			
			
		int count_10 = 0;
		while (changeNeeded > .10) {
			changeNeeded -= .10;
			count_10++;
		}
		if (count_10 > 0)
			System.out.print(count_10 + " dimes, ");
			pause();
			
			
		int count_5 = 0;
		while (changeNeeded > .05) {
			changeNeeded -= .05;
			count_5++;
		}
		if (count_5 > 0)
			System.out.print(count_5 + " nickles, ");
			pause();
			
			
		int count_1 = 0;
		while (changeNeeded > .00) {
			changeNeeded -= .01;
			count_1++;
		}
		if (count_1 > 0) {
			System.out.print("and ");
			System.out.println(count_1 + " pennies. ");
		}
		pause();

	}
	
	public static void pause()throws Exception{
		//added a short pause for conversational realism
		Thread.sleep(1000);
	}

}
