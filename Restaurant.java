import java.util.Scanner;

public class Restaurant {
	protected int breakfast4One=15;
	protected int breakfast4Two=27;
	protected int lunch4One=25;
	protected int lunch4Two=40;
	protected int diner4One=30;
	protected int diner4Two=60;
	protected int romanticDiner4Two=100;
	protected int oneBeverage=5;
	protected int oneCocktail=12;
	protected int oneDrink=15;
	public void menu() {
		System.out.println("BREAKFAST:");
		System.out.println("1. Breakfast for One Person $"+breakfast4One);
		System.out.println("2. Breakfast for Two Person $"+breakfast4Two);
		System.out.println("LUNCK:");
		System.out.println("3. Lunch for One Person $"+lunch4One);
		System.out.println("4. Lunch for Two Person $"+lunch4Two);
		System.out.println("DINER");
		System.out.println("5. Diner for One Person $"+diner4One);
		System.out.println("6. Diner for Two Person $"+diner4Two);
		System.out.println("7. Romantic Diner for Two Person $"+romanticDiner4Two);
		System.out.println("DRINKS");
		System.out.println("8. One Beverage $"+oneBeverage);
		System.out.println("9. One Cocktail $"+oneCocktail);
		System.out.println("10. One Alcohol Drink $"+oneDrink);
	}
	public int order() {
		int subTotal=0;
		Scanner console = new Scanner(System.in);
		System.out.println("What do you want to order? ");
		int num=console.nextInt();
		switch(num) {
		    case 1:
		    	subTotal+=breakfast4One;
		    	break;
		    case 2:
		    	subTotal+=breakfast4Two;
		    	break;
		    case 3:
		    	subTotal+=lunch4One;
		    	break;
		    case 4:
		    	subTotal+=lunch4Two;
		    	break;
		    case 5:
		    	subTotal+=diner4One;
		    	break;
		    case 6:
		    	subTotal+=diner4Two;
		    	break;
		    case 7:
		    	subTotal+=romanticDiner4Two;
		    	break;
		    case 8:
		    	subTotal+=oneBeverage;
		    	break;
		    case 9:
		    	subTotal+=oneCocktail;
		    	break;
		    case 10:
		    	subTotal+=oneDrink;
		    	break;
		    default: 
		    	subTotal=0;
		    	break;
		}
		return subTotal;
	}
	public double checkOut(int subTotal) {
		double total=0;
		double tax=10;
		total=subTotal*(tax/100);
		return total;
	}

}
