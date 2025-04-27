// 2. Write a Java program that calculates the sum of the digits in a number entered by the user using a loop.
import java.util.Scanner;
public class question2{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int sum=0;
        while (number!=0){
            sum = sum +number%10;
            number = number/10;
        }
        System.out.println("The sum of the digits is" + sum);
        sc.close();


    }
    
}