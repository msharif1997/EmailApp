import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 800;
	private int passwordLength = 8;
	private String email;
	private String companySuffix = "company.com";
	private String alterbateEmail;
	
	
	 // Constructor to receive firstname and lastname. 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
//		System.out.print("Email Created: " + this.firstName + " " + this.lastName );
		
		// Calling a method asking for the department - return department
		this.department = SetDepartment();
//			System.out.print("Department: " + this.department);
			
		// Call a method that returns a random password
			this.password = randomPassword(passwordLength);
//			System.out.println("\nYour Password is: " + this.password);
			
		// Combine elements to generate email
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department+ "." + companySuffix; 
//				System.out.println("Your Email is: " + email);
	}
	
	// Ask for the department
	private String SetDepartment() {
		System.out.print("\nNew Worker: "+ firstName + " " + lastName + "\nEnter Department Codes:\n"
				+ "1 for Sales\n"
				+ "2 for Development\n"
				+ "3 for Accounting\n"
				+ "0 for none\nEnter Department Code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		in.close();
		
		if (depChoice == 1) {
			return  "Sales";
		} else if (depChoice == 2) {
			return "Developer";
		} else if (depChoice == 3) {
			return "Accounting";
		} else {
			return "NA";
		}
		
	}
	
	//Generate a random password
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
		char[] password = new char[length]; 
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
//			System.out.println(rand);
//			System.out.println(passwordSet.charAt(rand));
		}
		return new String (password);
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alterbateEmail = altEmail;
	}
	 
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Get the mailbox Capacity
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	// Get the alternate email
	public String getAlternateEmail() {
		return alterbateEmail;
	}
	
	// Get the password change
	public String getPassword() {
		return password;
	}
	
	public String displayInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
				"COMPANY EMAIL: " + email + "\n" +
				"Temp Password: " + password + "\n" +
				"MAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
}
