import java.util.*;
public class Unit8Lab1
{
   public static void main(String[] args)
   {
      int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
      System.out.println("Here is your matrix:");
      display2DArray(nums);
      int totalSum = sum(nums);
      System.out.println("Sum of all elements: " + totalSum);
      Scanner mae = new Scanner(System.in);
      System.out.print("Which row would you like to sum? ");
      int row = mae.nextInt();
      System.out.println("The sum of row " + row + " is " + rowSum(nums, row));
      System.out.print("\nWhich column would you like to sum? ");
      int col = mae.nextInt();
      System.out.println("The sum of column " + col + " is " + colSum(nums, col));
   }
   public static void display2DArray(int[][] theNums)
   {
      for(int r = 0; r < theNums.length; r++)
      {
         for(int c = 0; c < theNums[0].length; c++)
         {
            System.out.print(theNums[r][c] + "\t");
         }
         System.out.println();
      }
   }   
   public static int sum(int[][] theNums)
   {
      int sum = 0;
      for(int r = 0; r < theNums.length; r++)
      {
         for(int c = 0; c < theNums[0].length; c++)
            sum += theNums[r][c];
      }
      return sum;
   }
   public static int rowSum(int[][] a, int r)
   {
      int sum = 0;
      for(int c = 0; c < a[0].length; c++)
         sum += a[r][c];
      return sum;
   }
   public static int colSum(int[][] a, int c)
   {
      int sum = 0;
      for(int r = 0; r < a.length; r++)
         sum += a[r][c];
      return sum;
   }
}