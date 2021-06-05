import java.util.Scanner;

public class RoomService extends Restaurant{
	protected int breakfast4One=25;
	protected int breakfast4Two=37;
	protected int lunch4One=35;
	protected int lunch4Two=50;
	protected int diner4One=40;
	protected int diner4Two=70;
	protected int romanticDiner4Two=110;
	protected int oneBeverage=15;
	protected int oneCocktail=22;
	protected int oneDrink=25;

	public void order(Scanner input) {
		System.out.println("MENU:");
		System.out.println("BREAKFAST:");
		System.out.println("1. Breakfast for One Person $"+breakfast4One);
		System.out.println("2. Breakfast for Two Persons $"+breakfast4Two);
		System.out.println("LUNCH:");
		System.out.println("3. Lunch for One Person $"+lunch4One);
		System.out.println("4. Lunch for Two Persons $"+lunch4Two);
		System.out.println("DINER:");
		System.out.println("5. Diner for One Person $"+diner4One);
		System.out.println("6. Diner for Two Persons $"+diner4Two);
		System.out.println("7. Romantic Diner for Two $"+romanticDiner4Two);
		System.out.println("DRINKS:");
		System.out.println("8. One Beverage $"+oneBeverage);
		System.out.println("9. One Cocktail $"+oneCocktail);
		System.out.println("10. One Alcohol Drink $"+oneDrink);
		System.out.println();
		System.out.println("Are you ready to order? ");
		System.out.println("Yes (press 1) No (press 0)");
		int orderSelector=input.nextInt();
		if(orderSelector==1) {
			double subTotal=0;
			System.out.println("What do you want to order? (Please enter the number of your order)");
			int num=input.nextInt();
			System.out.println();
			System.out.println("--You will now be transferred to checkout automatically--");
			System.out.println();
			System.out.println("---------------------------------------");
			System.out.println("       Room Service Checkout");
			System.out.println("---------------------------------------");
			switch(num) {
			    case 1:
			    	subTotal+=breakfast4One;
			    	System.out.println("      Order: Breakfast for One Person");
			    	break;
			    case 2:
			    	subTotal+=breakfast4Two;
			    	System.out.println("      Order: Breakfast for Two Persons");
			    	break;
			    case 3:
			    	subTotal+=lunch4One;
			    	System.out.println("      Order: Lunch for One Person");
			    	break;
			    case 4:
			    	subTotal+=lunch4Two;
			    	System.out.println("      Order: Lunch for Two Persons");
			    	break;
			    case 5:
			    	subTotal+=diner4One;
			    	System.out.println("      Order: Diner for One Person");
			    	break;
			    case 6:
			    	subTotal+=diner4Two;
			    	System.out.println("      Order: Diner for Two Persons");
			    	break;
			    case 7:
			    	subTotal+=romanticDiner4Two;
			    	System.out.println("      Order: Romantic Diner for Two");
			    	break;
			    case 8:
			    	subTotal+=oneBeverage;
			    	System.out.println("      Order: One Beverage");
			    	break;
			    case 9:
			    	subTotal+=oneCocktail;
			    	System.out.println("      Order: One Cocktail");
			    	break;
			    case 10:
			    	subTotal+=oneDrink;
			    	System.out.println("      Order: One Alcohol Drink");
			    	break;
			    default: 
			    	subTotal=0;
			    	break;
			}
			double total;
			double tax=10;
			total=subTotal+subTotal*(tax/100);
			
			System.out.println("      Sub-Total: \t$"+subTotal);
			System.out.println("      Tax: \t\t"+tax+"%");
			System.out.println("      Total: \t\t$"+total);
			System.out.println("---------------------------------------");
			System.out.println(" You order will be ready in 20 minutes");
			System.out.println("       YOU CAN ONLY PAY IN CASH");
			System.out.println("           Bon Appetit!!");
			System.out.println("---------------------------------------");
			

		}else {
			System.out.println("Hope you aren't hungry!");
		}
		
	}
	
}
