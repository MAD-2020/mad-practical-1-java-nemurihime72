import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of integers to enter in: "); //prompt array size
    int arraySize = in.nextInt(); //input array size
    int newArray[]=  new int[arraySize+1];  //create array
    System.out.println("Enter numbers: ");  //prompt numbers
    for (int arrayPos = 0; arrayPos<arraySize; arrayPos++)  //for loop to enter numbers
    {
      int number = in.nextInt();
      newArray[arrayPos] = number;
    }
    int mode = 0;
    int maxCount = 0;
    for (int index = 0; index<arraySize; index++) //loop through array
    {
      int count = 0;
      for (int noCount = 0; noCount<arraySize; noCount++) //loop through array
      {
        if (newArray[index] == newArray[noCount]) //if same, add to count
        {
          count++;
        }
      }
      if (count>maxCount) //find largest count and integer with largest count
      {
        maxCount = count;
        mode = newArray[index];
      }
    }
    System.out.println("Mode is " + mode); //print mode
    
  }
}
