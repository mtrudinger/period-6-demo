import java.util.Scanner;
/**
 * intro to condional statemets
 *
 * @author Mostyn Trudinger-Smith
 * @version 8/24/18
 */
public class ConditionalStatemets
{
   public static void main (String [] args)
   {
       Scanner kboard = new Scanner(System.in);
       /*
       System.out.println("Enter a 1 or a 2.");
       int num = kboard.nextInt();
       
       if(num == 1)
       {
           System.out.println("You entered a 1. Way to go!");
          
       }
   
       else if(num== 2)
       {
       System.out.println("You enterd a 2. Great job!");
       }
       else 
       {
           System.out.println("You didn't enter a 1 or a 2.");
        }
    
       System.out.println("Thanks for playing!");
       
      
      System.out.println("Enter the number points you have earned");
      int pointsearned = kboard.nextInt();
      
      System.out.println("Enter the number of possible points");
      int pointspossbile = kboard.nextInt();
      
      double average = 100.0 * pointsearned/pointspossbile;
      
      System.out.println("Your current average is " + average + "%");
      
      String grade;
      
      if(average>=90)
      {
        grade= "A";
        }
        
        else if(average>= 80)
        grade="B";
        
        else if(average>=70)
        grade= "C";
        
        else if(average>=60)
        grade= "D";
        
        else 
        grade= "F";
        
        System.out.println("Your grade is a(n)" + grade + ".");
        */
       
       /*
       int randomNumber = (int)(Math.random() * 10) + 1;
        System.out.println("Guess a number between 1 and 10.");
        
        int guess = kboard.nextInt();
        
        System.out.println("The number was " + randomNumber + ".");
        
        if(randomNumber == guess)
        {
            System.out.println("You were correct! Nice job.");
          
        }
        
        else 
        {
        System.out.println("You were not correct. Better luck next time!");
    }
    
    int x= 5;
    int y= 10;
    int z= 20;
    if(x > 0 && y < 20 && z == 20)
    {
        System.out.println("Hi");
    }
    
    if (x > 5)
    {
        if (y > 10)
        System.out.println("Path 2");
        else
        {
            System.out.println("Path 1");
        }
    }
    else
    { 
        System.out.println("Path 3");
    }
    */
    
    System.out.println("Enter a nuimber between 1 and 3");
    int number = kboard.nextInt();
    switch (number)
    {
        case 1: 
        
           System.out.println("Path 1");
        break;
        case 2:
        
        System.out.println("Path 2");
    break;
    case 3:
    
        System.out.println("Path 3");
    break;
    default:
    System.out.println("Path 4");
    
    
    }
}
}
