import java.util.Scanner;
/**
 * Write a description of class GradeCalculator3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeCalculator3
{
   public static void main (String [] args)
   {
       Scanner kb = new Scanner(System.in);
       System.out.println("How may assignments have you had so far?");
       int assignments = kb.nextInt();
       int [] [] scores = new int[assignments][3];

       for(int row = 0; row < assignments; row++)
       {
           System.out.println("Enter the assignment type for Assignment #" + (row + 1) + ": (1 - Homework, 2 - Discussion, 3 - Test):");
           int type = kb.nextInt();
           scores[row][0] = type;

           System.out.println("Enter the points earned on Assignment #" + (row + 1) + ":");
           int pointsearned = kb.nextInt();
           scores[row][1] = pointsearned;

           System.out.println("Enter the possible points on Assignment #" + (row + 1) + ":");
            int pointspossible = kb.nextInt();
            scores[row][2]=pointspossible;
       }


       int hwscored = 0;
       int hwoutof = 0;
       int testscored = 0;
       int testoutof = 0;
       int disscored = 0;
       int disoutof = 0;
       for (int row = 0; row < assignments; row++)
       {
           if (scores[row][0] == 1)
           {
               hwscored += scores[row][1];
               hwoutof += scores[row][2];
           }
           else if(scores[row][0] == 2)
           {
               disscored += scores[row][1];
               disoutof += scores[row][2];
           }
           else if (scores[row][0] == 3)
           {

               testscored += scores[row][1];
               testoutof += scores[row][2];
           }
       }

       double hwgrade = 100*hwscored/hwoutof;
       double disgrade = 100*disscored/disoutof;
       double testgrade = 100*testscored/testoutof;
       double overallgrade = (hwgrade/100*.3 + disgrade/100*.25 + testgrade/100*.45)*100;



       System.out.println("Your current grade:");
       System.out.println("Homework (30%):" + hwgrade + "%");
       System.out.println("Discussions (25%):" + disgrade + "%");
       System.out.println("Tests (45%):" + testgrade + "%");
       System.out.println("Overall (100%)" + overallgrade + "%");

   }
}


