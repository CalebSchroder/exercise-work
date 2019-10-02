import java.util.*;
public class Password {
    public static void main (String[]args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String pass;
        String pass1;
        int p;


        System.out.println("Enter Password");
        pass = scan.nextLine();
        int count1 = 0;
        pass1 = "";

        while(!pass1.equals(pass)) {
            pass1 = "";
            for (int count = 0; count < pass.length(); count ++) {
                p = rand.nextInt(26) + 97;
                char pa = (char) p;
                pass1 += pa;
            }
            count1 = count1 + 1;
        }
        System.out.println("Here is the password: " + pass1);
        System.out.println("It took this many attempts: " + count1);


    }
}