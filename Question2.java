import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter height in cm: "); //prompts for height
    double height = in.nextDouble();  //input height
    System.out.println("Enter weight in kg: "); //prompts for weight
    double weight = in.nextDouble(); //input weight
    System.out.println("Your height is " + height + "cm and your weight is "+ weight + "kg"); //prints out line stating height and weight
  }
}
