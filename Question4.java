import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter length of base of right-angle triangle: "); //prompt for length of base
    int base = in.nextInt();  //input base
    for (int vertical = 0; vertical<base; vertical++) //for loop to print number of rows
    {
      for(int horizontal=base; horizontal>vertical; horizontal--) //for loop to print number of asterisks
      {
        System.out.print("*"); 
      }
      System.out.println(" ");
    }
    
  }
}
