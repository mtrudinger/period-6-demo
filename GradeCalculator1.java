import java.util.Scanner;
/**
 * Basic Grade Calculator
 *
 * @author Mostyn Trudinger-Smith
 * @version (a version number or a date)
 */
public class GradeCalculator1
{
    public static void main (String [] args)
    {
        Scanner kboard = new Scanner(System.in);
        //double num = (double)32/50;
        //System.out.println((int)Math.ceil(36.75));
        System.out.println("Welcome to Grade Calculator 1.0");
        
        System.out.println("Enter the total number of points earned in the class:");
        int pointsearned = kboard.nextInt();
        
        System.out.println("Enter the total number of points possible for the class so far:");
        int pointspossible = kboard.nextInt();
        
        double currentaverage = (((double)pointsearned/pointspossible)*100);
        System.out.println("Your current average is" + currentaverage + "%");
        
        System.out.println("How many more points will be available in the class?");
        int availablepoints = kboard.nextInt();
        
        System.out.println("Listed below are the minimum number points you need to earn over the rest of the");
        System.out.println("semester to recieve each letter grade:");
        
        double pointsfora = (.9 * (pointspossible + availablepoints) - pointsearned);
        if(pointsfora>0)
        {
        System.out.println("A-" + (int)Math.ceil(pointsfora) + "/" + availablepoints +" points (" + ((pointsfora/availablepoints) * 100) + "%)");
    }
    if(pointsfora<0)
    {
        System.out.println("A- 0/" + availablepoints + "points (0.0%)");
    }
       
    double pointsforb = (.8 * (pointspossible + availablepoints) - pointsearned);
        if(pointsforb>0)
        {
        System.out.println("B-" + (int)Math.ceil(pointsforb) + "/" + availablepoints + "points (" + ((pointsforb/availablepoints)*100) + "%)" );
    }
    if(pointsforb<0)
    {
        System.out.println("D- 0/" + availablepoints + "points (0.0%)");
    }
        
    double pointsforc = (.7*(pointspossible + availablepoints) - pointsearned);
        if(pointsforc>0)
        {
        System.out.println("C-" + (int)Math.ceil(pointsforc) + "/" + availablepoints + "points (" + ((pointsforc/availablepoints)*100) + "%)");
    }
    if(pointsforc<0)
    {
        System.out.println("C- 0/" + availablepoints + "points (0.0%)");
    }
        
        double pointsford = (.6*(pointspossible + availablepoints) - pointsearned);
        if(pointsford>0)
        {
        System.out.println("D-" + (int)Math.ceil(pointsford) + "/" + availablepoints + "points (" + ((pointsford/availablepoints)*100) + "%)");
    }
        if(pointsford<0)
        {
        System.out.println("D- 0  /" + availablepoints + "points (" + ((double)0*100) + "%)");
    }
    }
}
