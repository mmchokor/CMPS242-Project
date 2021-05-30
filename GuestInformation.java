import java.util.*;

public class GuestInformation extends Reservation {
	protected String firstName;
	protected String lastName;
	protected String nationality;
	protected String phoneNumber;
	protected String address;
	protected String idType;
	protected String idNumber;

	public GuestInformation() {
	}

	public GuestInformation(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public GuestInformation(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

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

	public void getGuestInformation() {
		System.out.println("Guest Informations:");
		System.out.printf("Name: %s %s \n", firstName, lastName);
		System.out.println("Address: " + address);
		System.out.println("Nationality: " + nationality);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("ID Type: " + idType);
		System.out.println("ID Number: " + idNumber);
	}
}
