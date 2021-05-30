public class StandardRoom {
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
		livingRoom = true;
		kitchenet = false;
		breakFast = false;
		diner = false;
	}
	

	public void displayRoom() {
		System.out.println(roomType);
		System.out.println("Number of Beds: \t" + numberOfBeds);
		System.out.println("Bed size:   \t\t" + bedSize);
		System.out.println();
		System.out.println("Features:");
		System.out.println("Include Television \t" + tv);
		System.out.println("Include Minibar \t" + miniBar);
		if (balcony) {
			System.out.println("Include Balcony \t" + balcony);
		}
		if (jacuzzi) {
			System.out.println("Include Jacuzzi \t" + jacuzzi);
		}
		if (livingRoom) {
			System.out.println("Include Living Room \t" + livingRoom);
		}
		if (kitchenet) {
			System.out.println("Include Kitchenet \t" + kitchenet);
		}
		System.out.println();
		if (breakFast) {
			System.out.println("Food:");
			System.out.println("Include BreakFast \t" + breakFast);
		}
		if (diner) {
			System.out.println("Include Diner \t" + diner);
			System.out.println();
		}
		System.out.println("Price: \t\t\t$" + price);
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println();
	}
}
