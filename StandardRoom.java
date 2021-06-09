// A class to define a room and all the other rooms inhertis from this class

public class StandardRoom {
	// Attributes
	protected String roomType;
	protected int price;
	protected int numberOfBeds;
	protected String bedSize;
	protected boolean tv;
	protected boolean miniBar;
	protected boolean wifi;
	protected boolean balcony;
	protected boolean jacuzzi;
	protected boolean livingRoom;
	protected boolean kitchenet;
	protected boolean breakFast;
	protected boolean diner;

	// Default Constructor
	public StandardRoom() {
		roomType = "Standard Room";
		price = 120;
		numberOfBeds = 1;
		bedSize = "Queen Size Bed";
		tv = true;
		miniBar = true;
		wifi = false;
		balcony = false;
		jacuzzi = false;
		livingRoom = false;
		kitchenet = false;
		breakFast = false;
		diner = false;
	}

	// Method to display Room infos
	public void displayRoom() {
		System.out.println("-----------------------------------------");
		System.out.println(" " + roomType + ":");
		System.out.println("-----------------------------------------");
		System.out.println("Number of Beds: \t" + numberOfBeds);
		System.out.println("Bed size:   \t\t" + bedSize);
		System.out.println();
		System.out.println("Features:");
		System.out.println("Include Television \t");
		System.out.println("Include Minibar \t");
		if (balcony) {
			System.out.println("Include Balcony \t");
		}
		if (jacuzzi) {
			System.out.println("Include Jacuzzi \t");
		}
		if (livingRoom) {
			System.out.println("Include Living Room \t");
		}
		if (kitchenet) {
			System.out.println("Include Kitchenet \t");
		}
		System.out.println();
		if (breakFast) {
			System.out.println("Food:");
			System.out.println("Include BreakFast \t");
		}
		if (diner) {
			System.out.println("Include Diner \t");
			System.out.println();
		}
		System.out.println("Price: \t\t\t$" + price + " (Excl. Tax)");
		System.out.println("-----------------------------------------");
		System.out.println();
	}
}
