import java.util.Scanner;
/**
 * Introduction to loops
 *
 * @author Mostyn Trudinger-Smith
 * @version 8/30/18
 */
public class Loops
{
    public static void main (String [] args)
    {
       
        Scanner kb = new Scanner (System.in);
        /* int x = ((int)(Math.random() * 10) + 1);
        System.out.println("Guess a number from 1 to 10");
        int guess = kb.nextInt();
        while (guess != x)
        {
            
           
            if (guess < x)
        {
            System.out.println("Too low.");
        }
        else if (guess > x)
        {
            System.out.println("Too high.");
        }
         
        System.out.println(" Guess again.");
        
        guess = kb.nextInt();
        }
       System.out.println("Yay you got it right!");
        */
       
       /*
       int z ;
       do
       {
           System.out.println("Enter a number that is less than three");
           z = kb.nextInt();
        } while(z >= 3);
       
        
        for (int i = 0; i < 10; i++)
        {
            System.out.println(i + ". Mostyn");
        }
        */
       /*
       for (int i = 1; i <= 10; i+= 2)
        {
            System.out.println("Loop #" + i );
        }
        
        
       for (int i = 50; i >= 40; i--)
        {
            System.out.println("Loop #" + i );
        }
        
        */
       /*
       for (int i = 100; i >= 1; i--)
       {
           System.out.println(Math.abs(i - 101));
        }
        
        for (int i = 100; i < 200; i ++)
        {
            System.out.println(i - 99);
        }
        */
       
       int one = 0;
       int two = 0;
       int three = 0;
       int four = 0;
       int five = 0;
        for (int i = 0; i < 10000000; i++)
        {
            int SomeRando = ((int)(Math.random() * 5) + 1);
            /*
        System.out.println(SomeRando);
        */
        switch (SomeRando)
        {
        case 1:
        one++;
        break;
        
        case 2:
        two++;
        break;
        
        case 3:
        three++;
        break;
        
        case 4:
        four++;
        break;
        
        case 5:
        five++;
        break;
        
    }
        }  
        System.out.println( "1 =" + one);
        System.out.println( "2 =" + two);
        System.out.println( "3 =" + three);
        System.out.println( "4 =" + four);
        System.out.println( "5 =" + five);
    }
}
