import java.util.Scanner;
/**
 * Coding Problems 1.  Copy this code into a new class named "CodingProblems1"
 * in your Java Basics folder.
 * 
 * Below are several code snippets.  Each one has a comment explaining what
 * the code should do, but they all contain errors or missing pieces.  You
 * should work through each snippet and correct or complete the code so that
 * it works as described.  
 * 
 * Sometimes there is only one mistake; sometimes there are multiple mistakes.
 * Take time to think about the problem and how you would solve it.  Then look at
 * the code to make sure you understand what it is doing before trying to fix it.
 * There are no major code re-writes.  Either there are small changes or new code
 * that needs to be written.
 * 
 * I have commented out all but the first snippet.  As you finish each snippet,
 * remove the comments around the next one. You might also want to re-comment
 * out the ones you have corrected.
 *
 * @author David Herring
 * @version 8/21/17
 */
public class CodingProblems1
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        
        /**
         * Snippet #1: Should give a $2 discount on tickets for children 13
         * and under and a $1 discount to seniors 65 and older.
         */
        
        System.out.println("Enter age: ");
        int age = kb.nextInt();
        double ticketPrice = 9.50;
        String discount = "No discount.";
        if (age <= 13)
        {
            ticketPrice -= 2;
            discount = "Child discount.";
        }
        else if (age >= 65)
        {
            ticketPrice -= 1;
            discount = "Senior discount.";
        }
        System.out.printf(discount + " Ticket costs $%.2f.", ticketPrice);
        System.out.println();
        
       
        /**
         * Snippet #2: Should print out your name 10 times.
         */
        
        String name = "Your Name";
        for (int i = 1; i < 10; i++)
        {
            System.out.println(i + ". " + name);
        }
        
        
        /**
         * Snippet #3: Should calculate a win percentage.
         */
        
        System.out.println("Enter the number of wins: ");
        int wins = kb.nextInt();
        System.out.println("Enter the number of games: ");
        int games = kb.nextInt();
        double winPercentage = (double)(100*wins/games);
        System.out.println("Win percentage: " + winPercentage + "%");
        
       
        /**
         * Snippet #4: Should print all the multiples of a number 
         * between 0 and 100.  For example, if x = 25, it should print 
         * 0, 25, 50, 75, and 100. 
         */
        
        System.out.println("Enter a number between 1 and 100");
        int multiplesOf = kb.nextInt(); 
        int i = 0;
        System.out.println("The following are all the multiples of " +
            multiplesOf + " between 0 and 100");
        while (i <= 100)
        {
            if (i % multiplesOf == 0)
            {
               System.out.println(i);
               
            }
            i++;
        }
        
        
        /**
         * Snippet #5: This code randomly picks a number between 1 and 10
         * and has the user try to guess it.  It should end when the user
         * guesses correctly.
         */
        
        int randomNum = (int)(Math.random() * 10 + 1);
        System.out.println("I have picked a number between 1 and 10." +
            "Try to guess it:");
        int guess = kb.nextInt();
        boolean isFound = randomNum != guess;
        while (!isFound)
        {
            if (guess != randomNum)
            {
                System.out.println("Sorry. That was not my number.");
                System.out.println("Guess again:");
                guess = kb.nextInt();
            }
            else
            {
                System.out.println("YES!  You guessed it!");
            }
        }
        
        
        /**
         * Snippet #6: This code should take 10 scores from the user
         * and then calculate the average score.
         */
        /*
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Enter score #" + i + ":");
            sum += kb.nextInt();
            double average = sum / 10.0;
            System.out.println("The average score is " + average + ".");
        }
        */
       
        /**
         * Snippet #7: This code should ask the user to pick a lunch option and
         * then respond to that choice with a customized comment. 
         */
        /*
        System.out.println("What would you like for lunch:");
        System.out.println("1 - Burritos");
        System.out.println("2 - Sandwiches");
        System.out.println("3 - Pasta");
        System.out.println("4 - None of the above");
        System.out.println("Enter your choice:");
        int choice = kb.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.println("I love burritos!  Let's go.");
            case 2:
                System.out.println("Ok. But let's get fries or shakes too!");
            case 3:
                System.out.println("That sounds good. We can make it ourselves.");
            case 4: 
                System.out.println("Alright.  I think I'll just go home then.");
            default:
                System.out.println("Why can't you just answer the question I asked?");
        }
        */
       
        /**
         * Snippet #8: The code should generate a random number between a user
         * selected minimum value and a user selected maximum value.
         */
        /*
        System.out.println("I will generate a random number between two positive values.");
        System.out.println("Enter the minimum value:");
        int userMin = kb.nextInt();
        System.out.println("Enter the maximum value:");
        int userMax = kb.nextInt();
        // Add code here to make this work
        System.out.println("The random number is " + randomNumber2 + ".");
        */
        
        /**
         * Snippet #9: This code lets the user enter how many values they would
         * like to average.  It should then prompt them to enter that many values
         * and print out th average.  This code must use a for loop to do this.
         */
        /*
        System.out.println("How many values would you like me to average?");
        int numberOfValues = kb.nextInt();
        int sum1 = 0;
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Enter value #" + i + ":");
            sum1 += kb.nextInt();
        }
        double valueAverage = sum1 / 5;
        System.out.println("The average value is " + valueAverage + ".");
        */
       
        /**
         * Snippet #10: This code should do the same thing as the code in Snippet #9,
         * but it should use a while loop instead of a for loop.
         */
        /*
        System.out.println("How many values would you like me to average?");
        int numberOfValuesW = kb.nextInt();
        int sum2 = 0;
        //Add while loop and remaining code here
        */
    }
}
