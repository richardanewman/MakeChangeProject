import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		tender(); // Calls tender method which prompts user

	}

	// tender prompts user, takes input, calls makeChange and passes arguments
	public static void tender() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the price of the item: ");
		double price = kb.nextDouble();
		System.out.println("Please enter the amount you would like to tender: ");
		double tender = kb.nextDouble();

		// ensures user tenders more money than price of item
		while (price > tender) {
			System.out.println("Sorry you do not have enough to purchase this item.");
			System.out.println("Please tender more cash.");
			tender = kb.nextDouble();
		}
		// escapes program if no change is required
		if (price == tender) {
			System.out.println("No change required!");

		} else {

			tender = tender * 100;
			price = price * 100;
			makeChange((int) price, (int) tender);
			kb.close();
		}
	}

	// calculates proper change value per denomination, calls formatDisplayMessage
	// and passes arguments
	public static void makeChange(int price, int tender) {
		int change = tender - price;
		int hundred = 0;
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;

		for (int i = 0; i < change; i++) {
			if (change >= 10000) {
				hundred = change / 10000;
				change = change % 10000;
			}
			if (change >= 5000) {
				fifty = change / 5000;
				change = change % 5000;
			}
			if (change >= 2000) {
				twenty = change / 2000;
				change = change % 2000;
			}
			if (change >= 1000) {
				ten = change / 1000;
				change = change % 1000;
			}
			if (change >= 500) {
				five = change / 500;
				change = change % 500;
			}
			if (change >= 100) {
				one = change / 100;
				change = change % 100;
			}
			if (change >= 25) {
				quarter = change / 25;
				change = change % 25;
			}
			if (change >= 10) {
				dime = change / 10;
				change = change % 10;
			}
			if (change >= 5) {
				nickel = change / 5;
				change = change % 5;
			}
			if (change >= 1) {
				penny = change / 1;
				change = change % 1;
			}

		}

		formatDisplayMessage(hundred, fifty, twenty, ten, five, one, quarter, dime, nickel, penny);

//		return display;

//		String testing = ("Your change is " + hundred + " hundreds " + fifty + " fifties " + twenty + " twenties " + ten + " tens " + five + " fives " + one + " dollar bills " + quarter + " quarters " + dime + " dimes " + nickel + " nickels " + penny + " pennies " + change);
//				
//				
//		
//		return testing;

	}

	// formats display message
	public static void formatDisplayMessage(int hundred, int fifty, int twenty, int ten, int five, int one, int quarter,
			int dime, int nickel, int penny) {

		System.out.println("\nGive the customer:\n");

		if (hundred > 0) {
			if (hundred == 1) {
				System.out.println(hundred + " hundred dollar bill ");
			} else {
				System.out.println(hundred + " hundred dollar bills ");
			}
		}
		if (fifty > 0) {
			if (fifty == 1) {
				System.out.println(fifty + " fifty dollar bill ");
			} else {
				System.out.println(fifty + " fifty dollar bills ");
			}
		}
		if (twenty > 0) {
			if (twenty == 1) {
				System.out.println(twenty + " twenty dollar bill ");
			} else {
				System.out.println(twenty + " twenty dollar bills ");
			}
		}
		if (ten > 0) {
			if (ten == 1) {
				System.out.println(ten + " ten dollar bill ");
			} else {
				System.out.println(ten + " ten dollar bills ");
			}
		}
		if (five > 0) {
			if (five == 1) {
				System.out.println(five + " five dollar bill ");
			} else {
				System.out.println(five + " five dollar bills ");
			}
		}
		if (one > 0) {
			if (one == 1) {
				System.out.println(one + " one dollar bill ");
			} else {
				System.out.println(one + " one dollar bills ");
			}
		}
		if (quarter > 0) {
			if (quarter == 1) {
				System.out.println(quarter + " quarter ");
			} else {
				System.out.println(quarter + " quarters ");
			}
		}
		if (dime > 0) {
			if (dime == 1) {
				System.out.println(dime + " dime ");
			} else {
				System.out.println(dime + " dimes ");
			}
		}
		if (nickel > 0) {
			if (nickel == 1) {
				System.out.println(nickel + " nickel ");
			} else {
				System.out.println(nickel + " nickels ");
			}
		}
		if (penny > 0) {
			if (penny == 1) {
				System.out.println(penny + " penny ");
			} else {
				System.out.println(penny + " pennies ");
			}
		}

	}

}
