// A class to handle all the guest reservation infos

import java.util.Scanner;

public class Reservation {
	// Attributes
	protected String dateIn;
	protected String dateOut;
	protected int roomType;
	protected String roomTypeStr;
	protected int adults;
	protected int children;

	// Getters and Setter
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

	public int getRoomType() {
		return roomType;
	}

	public void setRoomType(int roomType) {
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

	// Method to set the guest reservation info
	public void setGuestReservation(Scanner input) {
		System.out.println("Enter the Check in date:");
		this.dateIn = input.nextLine();
		this.dateIn = input.nextLine();
		System.out.println("Enter the Check out date:");
		this.dateOut = input.nextLine();
		roomTypeSelect(input);
		System.out.println("Enter the number of adult(s):");
		this.adults = input.nextInt();
		System.out.println("Enter the number of children(s):");
		this.children = input.nextInt();
	}

	// method to display the guest reservation info
	public void getGuestReservation() {
		System.out.println("Guest Reservation Info:");
		System.out.println("Check in date: " + dateIn);
		System.out.println("Check out date: " + dateOut);
		System.out.println("Room Type:" + roomTypeStr);
		System.out.println("Number of Adult(s) (ONLY INTEGERS): " + adults);
		System.out.println("Number of Children (ONLY INTEGERS): " + children);
		System.out.println();
	}

	public void roomTypeSelect(Scanner input) {
		System.out.println("Enter the Room Type:");
		System.out.println("1 - Standard Room");
		System.out.println("2 - Double Room");
		System.out.println("3 - Triple Room");
		System.out.println("4 - King Size Room");
		System.out.println("5 - Suite");
		this.roomType = input.nextInt();
		switch (roomType) {
			case 1:
				roomTypeStr = "Standard Room";
				break;

			case 2:
				roomTypeStr = "Double Room";
				break;

			case 3:
				roomTypeStr = "Triple Room";
				break;

			case 4:
				roomTypeStr = "King Size Room";
				break;

			case 5:
				roomTypeStr = "Suite";
				break;
		
			default:
				roomTypeSelect(input);
				break;
		}
		
	}

   public void setGuestInfo(Scanner input) {
   }

	public void getGuestInformation() {
	}

}
