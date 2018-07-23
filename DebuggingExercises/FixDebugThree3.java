// This application gets a user's name and displays a greeting
import java.util.Scanner;
public class FixDebugThree3
{
   public static void main(String args[])
   {
      displayGreeting();
   }
   public static String getName()
   {
      String name;
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter name : " );
      name = userInput.next();
      return name;
   }
   public static void displayGreeting()
   {
      System.out.println("Hello, " + getName() + "!");
   }
}
