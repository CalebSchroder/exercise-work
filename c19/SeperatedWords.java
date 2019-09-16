import java.util.Scanner;
public class SeperatedWords {


     public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);

         String  word1;
         String word2;
         int count1;
         int count2;
         int totalCount;
         System.out.println("Enter Word 1");
         word1 = scan.nextLine();
         System.out.println("Enter Word2");
         word2 = scan.nextLine();

         count1 = word1.length();
         count2 = word2.length();

         totalCount = count1 + count2;

         System.out.println(word1);

         while (totalCount <= 30) {
             System.out.println(".");
             totalCount = totalCount + 1;
         }
         System.out.println(word2);
         


         


     }
}