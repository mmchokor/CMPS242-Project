// A class to store all the guest infos and handle them

import java.util.*;

public class GuestInformation extends Reservation{
	// Attributes
	protected String firstName;
	protected String lastName;
	protected String nationality;
	protected String phoneNumber;
	protected String address;
	protected String idType;
	protected String idNumber;

	// Default Constructor
	public GuestInformation() {
	}

	// Constructor
	public GuestInformation(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Constructor
	public GuestInformation(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	// Constructor
	public GuestInformation(String firstName, String lastName, String phoneNumber, String nationality, String address,
			String idType, String idNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.nationality = nationality;
		this.address = address;
		this.idType = idType;
		this.idNumber = idNumber;
	}

	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	// A method to take in the guests informations
	public void setGuestInfo(Scanner console) {
		boolean flag = false;
		System.out.println("Please enter the following information.");
		do {
			System.out.print("First Name: ");
			if (console.hasNext()) {
				firstName = console.next();
				break;
			} else {
				System.out.print(" *This feild is required please renter your First Name");
				flag = true;
			}
		} while (flag == true);
		flag = false;
		do {
			System.out.print("Last Name: ");
			if (console.hasNext()) {
				lastName = console.next();
				break;
			} else {
				System.out.print(" *This feild is required please renter your Last Name");
				flag = true;
			}
		} while (flag == true);
		flag = false;
		do {
			System.out.print("Nationality: ");
			if (console.hasNext()) {
				nationality = console.next();
				break;
			} else {
				System.out.print(" *This feild is required please renter your Nationality");
				flag = true;
			}
		} while (flag == true);
		flag = false;
		do {
			System.out.print("Phone Number: ");
			if (console.hasNext()) {
				phoneNumber = console.next();
				break;
			} else {
				System.out.print(" *This feild is required please renter your Phone Number");
				flag = true;
			}
		} while (flag == true);
		flag = false;
		do {
			System.out.print("Address: ");
			if (console.hasNext()) {
				address = console.next();
				break;
			} else {
				System.out.print(" *This feild is required please renter your Address");
				flag = true;
			}
		} while (flag == true);
		flag = false;
		do {
			System.out.print("ID type: ");
			if (console.hasNext()) {
				idType = console.next();
				break;
			} else {
				System.out.print(" *This feild is required please renter your ID Type");
				flag = true;
			}
		} while (flag == true);
		flag = false;
		do {
			System.out.print("ID Number: ");
			if (console.hasNext()) {
				idNumber = console.next();
				break;
			} else {
				System.out.print(" *This feild is required please renter your ID Number");
				flag = true;
			}
		} while (flag == true);
	}

	// Method to display all the guest informations
	public String toStringGuestInformation() {
		return "GUEST INFORMATION:\n" +
		"Name: \t\t" + firstName + " " + lastName + "\n" +
		"Address: \t" + address + "\n" +
		"Nationality: \t" + nationality + "\n" +
		"Phone Number: \t" + phoneNumber + "\n" +
		"ID Type: \t" + idType + "\n" +
		"ID Number: \t" + idNumber + "\n"+
		"---------------------------------------------------";
	}
}
