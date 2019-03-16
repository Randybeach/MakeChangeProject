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
		int totalChangeCounter = 0;
		System.out.println("Give me one second to count your change");
		pause();
		pause();
		int changeNeededInt = (int)((changeNeeded + .001)* 100);
		System.out.println("I owe you...");

		int count20 = 0;
		while (changeNeededInt >= 2000) {
			changeNeededInt -= 2000;
			count20++;
			totalChangeCounter ++;
		}
		if (count20 > 1) {
			System.out.print(count20 + " twenties, ");
		}else if(count20 > 0) {
			System.out.print(count20 + " twenty, ");
			
		}
			pause();
			
			
		int count10 = 0;
		while (changeNeededInt >= 1000) {
			changeNeededInt -= 1000;
			count10++;
			totalChangeCounter ++;
		}
		if (count10 > 1) {
			System.out.print(count10 + " tens, ");
		}else if(count10 > 0) {
			System.out.print(count10 + " ten, ");
			
		}
			pause();
			
			
		int count5 = 0;
		while (changeNeededInt >= 500) {
			changeNeededInt -= 500;
			count5++;
			totalChangeCounter ++;
		}
		if (count5 > 1) {
			System.out.print(count5 + " fives, ");
		}else if(count5 > 0) {
			System.out.print(count5 + " five, ");
			
		}
			pause();
			
			
		int count1 = 0;
		while (changeNeededInt >= 100) {
			changeNeededInt -= 100;
			count1++;
			totalChangeCounter ++;
		}
		if (count1 > 1) {
			System.out.print(count1 + " ones, ");
		}else if(count1 > 0) {
			System.out.print(count1 + " one, ");
			
		}
			pause();
			
			
		int count_25 = 0;
		while (changeNeededInt >= 25) {
			changeNeededInt -= 25;
			count_25++;
			totalChangeCounter ++;
		}
		if (count_25 > 1) {
			System.out.print(count_25 + " quarters, ");
		}else if(count_25 > 0) {
			System.out.print(count_25 + " quarter, ");
			
		}
			pause();
			
			
		int count_10 = 0;
		while (changeNeededInt >= 10) {
			changeNeededInt -= 10;
			count_10++;
			totalChangeCounter ++;
		}
		if (count_10 > 1) {
			System.out.print(count_10 + " dimes, ");
		}else if(count_10 > 0) {
			System.out.print(count_10 + " dime, ");
			
		}
			pause();
			
			
		int count_5 = 0;
		while (changeNeededInt >= 5) {
			changeNeededInt -= 5;
			count_5++;
			totalChangeCounter ++;
		}
		if (count_5 > 1) {
			System.out.print(count_5 + " nickles, ");
		}else if(count_5 > 0) {
			System.out.print(count_5 + " nickle, ");
			
		}
			pause();
			
		int count_1 = 0;
		while (changeNeededInt > 0 && changeNeededInt != 0) {
			changeNeededInt -= 1;
			count_1++;
		}
		if (count_1 > 1 && totalChangeCounter > 0) {
			System.out.print("and ");
			System.out.println(count_1 + " pennies. ");
		}else if(count_1 > 0 && totalChangeCounter > 0) {
			System.out.print("and ");
			System.out.println(count_1 + " penny. ");
		}else if( count_1 > 1) {
			System.out.println(count_1 + " pennies. ");
		}else if(count_1 > 0) {
			System.out.println(count_1 + " penny. ");
		}
		pause();

	}
	
	public static void pause()throws Exception{
		//added a short pause for conversational realism
		Thread.sleep(500);
	}

}
