import java.util.Scanner;
/**
 * Grade calculator
 *
 * @author Mostyn Trudinger-Smith
 * @version 8/4/18
 */
public class GradeCalculator2
{
    public static void main (String [] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("How many assignmants have you had so far?");
        int x = kb.nextInt();
        
        double max = 0;
        int outoftotal = 0;
        int totalearned = 0;
        double min = 100;
        int iformax = 0;
        int iformin = 0;

        for (int i = 1; i <= x; i++)
        {
            System.out.println("Enter the points earned on assignment #" + i );
            int points = kb.nextInt();
            System.out.println("Enter the point value of assignment #" + i );
            int outof = kb.nextInt();
            
           outoftotal = outoftotal + outof;
            
            totalearned = totalearned + points;
            
            double average = 100.0 * points / outof;
            
            if (average > max)
            {
                max = average;
                iformax = iformax + i;
            }
            
            if (average < min)
            {
                min = average;
                iformin = iformin + i;
            }
        }
        
        System.out.println("Your current average is " + (100.0 * totalearned / outoftotal) + "%.");
        System.out.println("Your highest percentage was " + max + "% on assignment #" + iformax);
        System.out.println("Your lowest percentage was " + min + "% on assignment #" + iformin);
        
    }
    
}
