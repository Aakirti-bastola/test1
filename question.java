//1. Write a Java program to reverse a word provided by the user.
import java.util.Scanner;
public class question{

    public static  void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a word for reverse");
        String word=sc.nextLine();
        String reverse = "";
        for (int i = word.length () -1 ; i>=0; i--){
            reverse = reverse + word.charAt(i);

        }
         System.out.println("The reverse word is " + reverse);
         sc.close();

    }
}