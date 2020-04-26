import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter first integer: ");  //prompts for first integer
    int firstNo = in.nextInt(); //input first integer
    System.out.println("Enter second integer to be multiplied by first integer: "); //prompts for second integer
    int secondNo = in.nextInt();  //input second integer
    int result = firstNo * secondNo;  //multiply the 2 integers to get result
    System.out.println("Result is " + result);  //prints the result
    
  }
}
