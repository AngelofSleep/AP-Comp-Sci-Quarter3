import java.util.*;
public class Reece_U7_L1
{
   public static void main(String[] args)
   {
      List <String> sixormore = new ArrayList();
      List <String> wordswithb = new ArrayList();
      Scanner mae = new Scanner(System.in);
      for(int x = 0; x < 10; x++)
      {
         System.out.println("Enter a word");
         String word = mae.next();
         if(word.length() >= 6)
            sixormore.add(word);
         if(word.indexOf("b") == 0)
            wordswithb.add(word);
      }
      System.out.println("The words that are 6 letters are " + sixormore);
      System.out.println("The words that start with b are " + wordswithb);
   }
}