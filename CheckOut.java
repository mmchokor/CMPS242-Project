// A class to handle the checkout process of the guest

import java.util.Scanner;

public class CheckOut {
	// Attributes
	protected double discount;
	protected double subTotal;
	protected double taxes = 0.11;
	protected double total;
	protected int cardNumber;

	// Getters and Setters
	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
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

	// Method to select the payment method and so the guest can pay
	public void payingMethod(Scanner input) {
		System.out.println("Which paying method would you like to use?");
		System.out.println("1 - Cash");
		System.out.println("2 - Credit/Debit Card");
		System.out.println("3 - Bank Check");

		int method = input.nextInt();
		switch (method) {
			case 1:
				System.out.println("Thank you for choosing MSK hotel!");
				System.out.println("Please head to the cashier when you arrive at the hotel and you can pay there.");
				break;

			case 2:
				System.out.println("Enter your card number: ");
				cardNumber = input.nextInt();
				do {
					if (cardNumber == 16) {
						System.out.println("Thank you for choosing MSK hotel!");
						System.out.println("Payment was successful. Enjoy your stay!");
					} else {
						System.out.println("INVALID CARD NUMBER! \nPlease try again.");
					}
				} while (cardNumber != 16);
				
				case 3:
				System.out.println("Thank you for choosing MSK hotel!");
				System.out.println("Please head to the cashier when you arrive at the hotel and you can give us the check there.");
				break;
		
			default:
				System.out.println("INVALID OPTION! \nPlease try again.");
				payingMethod(input);
				break;
		}
	}

}
