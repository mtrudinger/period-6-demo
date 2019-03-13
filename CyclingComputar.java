import java.util.Scanner;
/**
 * Basic cycling computar
 *
 * @author Mostyn Trudinger-Smith
 * @version 8/15/18
 */
public class CyclingComputar
{
    
        public static void main (String [] args)
    {
      Scanner kboard = new Scanner(System.in);      
      
      System.out.println("How many miles have you already ridden?"); 
      double milesridden = kboard.nextDouble();
      System.out.println("How minutes have you been riding?");
      double minutesridden = kboard.nextDouble();
      double hoursridden = (minutesridden/60);
      double averagespeed = (milesridden/hoursridden);
      System.out.println("Your current average speed is" + averagespeed + "mph.");
      System.out.println(" What average speed would you like to achieve today?");
      double desiredaverage = kboard.nextDouble();
      System.out.println("How many more miles do you plan to ride today?");
      double milesleft = kboard.nextDouble();
      double desiredaverage2 = kboard.nextDouble();
     
    }
}
