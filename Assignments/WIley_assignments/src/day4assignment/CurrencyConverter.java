package Random;

import java.util.Scanner;

public class CurrencyConverter {
	public static void main(String[] args) {		
			System.out.println("1 Rupee");
			System.out.println("2 Dollar");
			System.out.println("3 Euro");
			System.out.println("4 Yen");
			
			// take input
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose the currency");
			int choice = sc.nextInt();
			System.out.println("Enter the amount");
			double amount = sc.nextDouble();
			
			// convert the amount
			switch (choice) {
			case 1:
				Ruppe_to_other(amount);
				break;
			case 2:
				Dollar_to_other(amount);
				break;
			case 3:
				Euro_to_other(amount);
				break;
			case 4:
				Yen_to_other(amount);
				break;
			default:
				System.out.println("Invalid choice");
			}
	
		}
	
		public static void Ruppe_to_other(double amt) {
			System.out.println("1 Ruppe = " + 0.013 + " Dollar");
			System.out.println();
	
			System.out.println(amt + " Ruppe = " + (amt * 0.013) + " Dollar");
			System.out.println();
	
			System.out.println("1 Ruppe = " + 0.012 + " Euro");
			System.out.println();
			System.out.println(amt + " Ruppe = " + (amt * 0.012) + " Euro");
			System.out.println();
			
			System.out.println("1 Rupee = " + 1.64 + " Yen");
			System.out.println();
	
			System.out.println(amt + " Rupee = " + (amt * 1.64) + " Yen");
	
		}
	
		public static void Dollar_to_other(double amt) {
			System.out.println("1 Dollar = " + 79.37 + " Ruppe");
			System.out.println();
			System.out.println(amt + " Dollar = " + (amt * 79.37) + " Ruppe");
			System.out.println();
	
			System.out.println("1 Dollar= " + 0.98 + " Euro");
			System.out.println();
	
			System.out.println(amt + " Dollar = " + (amt * 0.98) + " Euro");
			System.out.println("1 Dollar = " + 134.00 + " Yen");
			System.out.println();
	
			System.out.println(amt + " Dollar = " + (amt * 134.00) + " Yen");
		}
	
		public static void Euro_to_other(double amt) {
			System.out.println("1 Euro = " + 80.85 + " Ruppe");
			System.out.println();
			System.out.println(amt + " Euro = " + (amt * 80.85) + " Ruppe");
			System.out.println();
	
			System.out.println("1 Euro = " + 1.02 + " Dollar");
			System.out.println();
	
			System.out.println(amt + " Euro = " + (amt * 1.02) + " Dollar");
			System.out.println();
			System.out.println("1 Euro = " + 147.84 + " Yen");
			System.out.println();
	
			System.out.println(amt + " Euro = " + (amt * 147.84) + " Yen");
	
		}
		
		public static void Yen_to_other(double amt) {
			System.out.println("1 Yen = " + 0.61 + " Ruppe");
			System.out.println();
			System.out.println(amt + " Yen = " + (amt * 0.61) + " Ruppe");
			System.out.println();
	
			System.out.println("1 Yen = " + 0.0075 + " Dollar");
			System.out.println();
	
			System.out.println(amt + " Yen = " + (amt * 0.0075) + " Dollar");
			System.out.println();
			System.out.println("1 Yen = " + 0.0068 + " Euro");
			System.out.println();
	
			System.out.println(amt + " Yen = " + (amt * 0.0068) + " Euro");
			
		}
}
