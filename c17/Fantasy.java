import java.util.Scanner;
public class Fantasy {

	public static void main(String[]args) {

		Scanner scan = new Scanner (System.in);
		String name;
		int strength;
        int health;
        int luck;
        int luck1;
        int health1;
        int strength1;

        

		System.out.println("Enter the name of you charcter:");
        name = scan.nextLine();
        System.out.println("Enter strength from 1-10:");
        strength = scan.nextInt();
        System.out.println("Enter health from 1-10:");
        health = scan.nextInt();
        System.out.println("Enterluck from 1-10:");
        luck = scan.nextInt();


        if ((luck + health + strength) > 15) {
            System.out.println("You gave your charcter too much strength! Given default values.");
            luck = 5;
            health = 5;
            strength = 5;
        }

        System.out.println("Name : " + name);
        System.out.println("Luck : " + luck);
        System.out.println("Strength : " + strength);
        System.out.println("Health : " + health); 
        






	}



}