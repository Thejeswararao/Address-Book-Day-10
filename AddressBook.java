package bridgelabz.com.AddreessBook;

public class AddressBook {
	private class Contact {
		String firstName, lastName, address, city, state, emailId;
		int zipCode;
		long mobileNumber;
	}
	public void printContact() {
		Contact person = new Contact();
		person.firstName = "Metta";
		person.lastName = "Thejeswararao";
		person.address = "Siripuram";
		person.city = "Srikakulam";
		person.state = "Andhra Pradesh";
		person.zipCode = 532168;
		person.mobileNumber = 123456789;
		person.emailId = "thejeswararaom@gmail.com";
		System.out.println("Contact Details");
		System.out.println("Name         : "  + person.firstName + " " + person.lastName + "\n"
				+ "Address      : "  + person.address + "\n"
				+ "City         : "  + person.city + "\n"
				+ "State        : "  + person.state + "\n"
				+ "ZipCode      : "  + person.zipCode + "\n"
				+ "MobileNumber : "  + person.mobileNumber + "\n"
				+ "EmailId      : "  + person.emailId + "\n" );
	}
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.printContact();
	}
}
