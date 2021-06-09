// A class to handle the checkout process of the guest

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class CheckOut {
	// Attributes
	protected double discount;
	protected double subtotal;
	protected double taxes = 0.11;
	protected double total;
	protected String cardNumber;

	// Files
	File file = new File("Guest_personal_and_reservation_informations.txt");

	// Getters and Setters
	public double getDiscount() {
		return this.discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	// Method to handle all the checkout process
	public void checkoutProcess(String info, String reserv, int roomType, Scanner input) {
		roomPriceSelect(roomType);
		this.discount = discounts(input);
		System.out.println("----------------------------------------------------");
		System.out.println("                       Checkout");
		System.out.println("----------------------------------------------------");
		System.out.println(info);
		System.out.println(reserv);
		System.out.println("Subtotal: \t\t\t\t $" + subtotal);
		System.out.println("Total after adding Taxes and Discounts: $" + (calculateTotal() - discount));
		System.out.println("----------------------------------------------------");
		payingMethod(input);
		System.out.println();
		System.out.println("------------ Thank you for choosing MSK ------------");
		System.out.println();
		try {
			PrintStream output = new PrintStream(file);

			output.println("----------------------------------------------------");
			output.println("                       Checkout");
			output.println("----------------------------------------------------");
			output.println(info);
			output.println(reserv);
			output.println("Subtotal: \t\t\t\t $" + subtotal);
			output.println("Total after adding Taxes and Discounts: $" + (calculateTotal() - discount));
			output.println("----------------------------------------------------");
			output.println();
			output.println("------------ Thank you for choosing MSK ------------");
			output.println();

			output.close();
		} catch (FileNotFoundException e) {
			System.err.println("Files does not exist!");
		}
	}

	// method for discounts
	public double discounts(Scanner input) {
		double discountAmount = 0;
		int promo;
		System.out.println("Do you have a promo code?");
		System.out.println("1 - Yes");
		System.out.println("2 - No");
		int answer = input.nextInt();
		switch (answer) {
			case 1:
				System.out.println("Please Enter the promo code:");
				promo = input.nextInt();
				if (promo == 123) {
					discountAmount = subtotal * 0.2;
					System.out.println("Promo Code has been applied Successfully");
				} else {
					System.out.println("Invalid Promo Code! \nTry Again");
					discounts(input);
				}

				break;

			case 2:

				break;

			default:
				System.out.println("Invalid Input! \nTry Again.");
				discounts(input);
				break;
		}
		return discountAmount;
	}

	// Method to calculate the total payment
	public double calculateTotal() {
		return subtotal + (subtotal * taxes);
	}

	// method to return the subtotal
	public void roomPriceSelect(int roomType) {
		switch (roomType) {
			case 1:
				subtotal = 120.00;
				break;

			case 2:
				subtotal = 180.00;
				break;

			case 3:
				subtotal = 250;
				break;

			case 4:
				subtotal = 380;
				break;

			case 5:
				subtotal = 500;
				break;

			default:
				roomPriceSelect(roomType);
				break;
		}

	}

	// Method to select the payment method and so the guest can pay
	public void payingMethod(Scanner input) {
		System.out.println("Which paying method would you like to use?");
		System.out.println("1 - Cash");
		System.out.println("2 - Credit/Debit Card");
		System.out.println("3 - Bank Check");

		int method = input.nextInt();
		switch (method) {
			case 1:
				System.out.println("Please head to the cashier when you arrive at \nthe hotel and you can pay there.");
				break;

			case 2:
				System.out.println("Enter your card number: ");
				cardNumber = input.nextLine();
				cardNumber = input.nextLine();

				if (cardNumber.length() == 16) {
					System.out.println("Payment was successful. Enjoy your stay!");
				} else {
					System.out.println("INVALID CARD NUMBER! \nPlease try again.");
					payingMethod(input);
				}
				break;

			case 3:
				System.out.println(
						"Please head to the cashier when you arrive at \nthe hotel and you can give us the check there.");
				break;

			default:
				System.out.println("INVALID OPTION! \nPlease try again.");
				payingMethod(input);
				break;
		}
	}

}
