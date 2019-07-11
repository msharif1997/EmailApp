import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// The names are static
//		Email em1 = new Email("Mohamed", "Abdi");
//		
//		System.out.println(em1.displayInfo());
		
		
		// Making the names user input base 
		Scanner read = new Scanner(System.in);
		
		System.out.println("Please Enter your FirstName \n");
		
		String fName = read.nextLine();
		
		System.out.println("Please Enter your LastName \n");
		
		String LName = read.nextLine();
		
		Email em2 = new Email(fName,LName);
		
		System.out.println(em2.displayInfo());
		
		read.close(); 
		
		
	}   

}
