import java.text.DecimalFormat;
import java.text.NumberFormat;
// This program calculates tutition bills as credits times rate per credit hour
public class FixDebugThree4
{
   public static void main(String args[])
   {
      int myCredits = 13;
      int yourCredits = 17;
      double rate = 75.84;
      System.out.println("My tuition : ");
      tuitionBill(myCredits, rate);
      System.out.println("Your tuition : ");
      tuitionBill(yourCredits, rate);
   }
   public static void tuitionBill(int c,double r)
   {
      NumberFormat nf = new DecimalFormat("###.##");
      System.out.println("Total due " + (nf.format(r * c)));
   }
}
