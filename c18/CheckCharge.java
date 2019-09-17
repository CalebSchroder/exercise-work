import java.util.Scanner;
public class CheckCharge {

	public static void main(String[]args) {

		Scanner scan = new Scanner (System.in);
		
		int checkingAccount;
        int savingsAccount;
       

        

		System.out.println("Enter the amount in the checking account:");
        checkingAccount = scan.nextInt();
        System.out.println("Enter the amount in the savings account:");
        savingsAccount = scan.nextInt();

        if (checkingAccount > 1000 || savingsAccount > 1500) {
            System.out.println("No fee!");
        } else {
            System.out.println("Sorry, There is a 15 cent charge per check!");
        }

        
	}



}