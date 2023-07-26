import java.util.Scanner;
public class Reece_U2_L2
{
   public static void main(String[] args)
   {
      Scanner mae = new Scanner(System.in);
      String a;
      System.out.println("Enter a String:");
      a = mae.nextLine();
      String b, c, d;
      int e;
      b = lastThree(a);
      c = betweenParens(a);
      d = frontToBack(a);
      e = findMe(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
   }
   public static String lastThree(String a)
   {
      a = a.substring(a.length() - 3);
      return a;
   }
  public static int findMe(String a)
  {
     int f = a.indexOf("me");
     return f;
  }
  public static String betweenParens(String a)
  {
   int g = a.indexOf("(");
   int h = a.indexOf(")");
   a = a.substring(g+1,h);
   return a;
  }
  public static String frontToBack(String a)
  {
      int i = a.length();
      String j = a.substring(0, i/2);
      String k = a.substring(i/2);
      a = k+j;
      return a;
  } 
}