import java.util.Scanner;
public class Unit6Lab4
{
   public static void main(String[] args)
   {
      int[] MyArray;
      boolean again = true;
      while(again)
      {
         MyArray = fillArray();
         shuffleArray(MyArray);
         displayArray(MyArray, 1, 0);
         playGame(MyArray);
         again = playAgain();
      }
   }
   public static int[] fillArray()
   { 
      boolean tryAgain = true;
      int numVals = 0;
      Scanner mae = new Scanner(System.in);
      while(tryAgain)
      {
         System.out.println("How many elements (5-20) would you like to shuffle?");
         numVals = mae.nextInt();
         if(numVals >= 5 && numVals <= 20)
            tryAgain = false;
      }
      int[] a = new int[numVals];
      for(int x = 0; x < a.length; x++)
         a[x] = x + 1;
      return a;
   }
   public static void shuffleArray(int[] a)
   {
      int x, y, tempVal;
      for(int z = 0; z < 100; z++)
      {
         x = (int)((a.length)*Math.random());
         y = (int)((a.length)*Math.random());
         tempVal = a[x];
         a[x] = a[y];
         a[y] = tempVal;    
      }
   }
   public static void displayArray(int[] a, int code, int reverseNum)
   {
      if(code == 1)
         System.out.println("Here is your shuffled array:");
      else
         System.out.println("Here is your array with the first " + reverseNum + " elements reversed:");
      for(int x : a)
         System.out.print(x + " ");        
   }
   public static void reverse(int[] a, int n)
   {
      int tempVal;
      for(int x = 0; x < n/2; x++)
      {
         tempVal = a[x];
         a[x] = a[n - 1 - x];
         a[n - 1 - x] = tempVal;
      }
   }
   public static boolean checkOrder(int[] a)
   {
      for(int x = 0; x < a.length - 1; x++)
      {
         if(a[x] > a[x + 1])
            return false;
      }
      return true;
   }
   public static void playGame(int[] a)
   {
      int numTurns = 2 * a.length - 3;
      Scanner mae = new Scanner(System.in);
      while(!checkOrder(a) && numTurns > 0)
      {
         System.out.println(" ");
         System.out.println("You have " + numTurns + " turns remaining.");
         int numReverse = 0;
         while(numReverse < 2 || numReverse > a.length)
         {
            System.out.println("Enter number of elements (2 - " + a.length + ") to reverse:");
            numReverse = mae.nextInt();
         }
         reverse(a, numReverse);
         displayArray(a, 2, numReverse);
         numTurns--; 
      }
      System.out.println(" ");
      if(checkOrder(a))
         System.out.println("Congratulations, you sorted it!");
      else
         System.out.println("Out of turns - Game Over!");
   }
   public static boolean playAgain()
   {
      Scanner mae = new Scanner(System.in);
      System.out.println("Would you like to play again?\nEnter 1 for yes\nEnter 2 for no");
      int x = mae.nextInt();
      if(x == 1)
         return true;
      else
         return false;
    }
}