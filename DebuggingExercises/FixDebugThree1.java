import java.text.DecimalFormat;
import java.text.NumberFormat;
// This class calculates a waitperson's tip as 15% of the bill
public class FixDebugThree1
{
   public static void main(String args[])
   {
       double myCheck = 50.00;
       double yourCheck = 19.95;
       System.out.println("Tips are 15% of the bill");
       calcTip(myCheck);
       calcTip(yourCheck);
    }
    private static void calcTip(double bill)
    {
       NumberFormat nf = new DecimalFormat("###.##");
       final double RATE = 0.15;
       double tip = bill * RATE;
       System.out.println("The tip should be at least " + nf.format(tip));
    }
}
