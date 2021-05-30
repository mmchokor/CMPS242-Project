import java.util.Scanner;

public class Reservation {
	protected String dateIn;
	protected String dateOut;
	protected String roomType;
	protected int adults;
	protected int children;

	public String getDateIn() {
		return dateIn;
	}

	public void setDateIn(String dateIn) {
		this.dateIn = dateIn;
	}

	public String getDateOut() {
		return dateOut;
	}

	public void setDateOut(String dateOut) {
		this.dateOut = dateOut;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public void setGuestReservation(Scanner input) {
		System.out.println("Enter the Check in date:");
		this.dateIn = input.nextLine();
		System.out.println("Enter the Check out date:");
		this.dateOut = input.nextLine();
		System.out.println("Enter the Room Type:");
		this.roomType = input.nextLine();
		System.out.println("Enter the number of adult(s):");
		this.adults = input.nextInt();
		System.out.println("Enter the number of children(s):");
		this.children = input.nextInt();
	}

	public void getGuestReservation() {
		System.out.println("Guest Reservation Info:");
		System.out.println("Check in date: " + dateIn);
		System.out.println("Check out date: " + dateOut);
		System.out.println("Room Type:" + roomType);
		System.out.println("Number of Adult(s): " + adults);
		System.out.println("Number of Children(s): " + children);
	}

}
