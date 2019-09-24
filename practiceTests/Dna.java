import java.util.Scanner;
public class Dna {

    public static void main (String[]args) {

        Scanner scan = new Scanner(System.in);
        String dna;
        String nucleotide;

        nucleotide = "a";
        dna = "";

        while (!nucleotide.equals("q")) {
            System.out.println("Enter nucleotide");
            nucleotide = scan.nextLine();

            if (nucleotide.equals("a") || nucleotide.equals("t") || nucleotide.equals("c") || nucleotide.equals("g")) {
                dna = dna + nucleotide;
            } else {
                System.out.println("Invalid Input");
            }

        }

    }
}