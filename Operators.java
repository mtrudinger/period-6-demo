
/**
 * Write a description of class Operators here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Operators
{
   
   public static void main (String [] args)
   
    {
    int result= 1+2;
    System.out.println("1+2=" + result);
    
    int previousResult= result;
    
    result=result-1;
   System.out.println(previousResult + "-1=" + result);
    result= result*10;
    System.out.println(previousResult + "*10=" + result);
    result=result / 5;
    System.out.println(previousResult + "/5=" + result);
    previousResult=result;
    result= result%3;
    System.out.println(previousResult + "%3=" + result);
    previousResult=result;
    //*************
    result=result+1;
     System.out.println("Result is now equal to " + result);
     result++;
      System.out.println("Result is now equal to" + result);
      result--;
       System.out.println("Result ios now equat to" +result);
    result+=10;
     System.out.println("Result ios now equat to" +result);
    result*=4;
     System.out.println("Result ios now equat to" +result);
     //*****************************************
     int num=50;
     if (num==50)
     {
         System.out.println("num is 50");
     }
     if(num!= 50)
        System.out.println("Num is not 50");
     if(num<75)
        System.out.print("Num is less than 75");
     if(num>=49)
        System.out.println("Num is greater than or equal to 49");
     if((num>30) && (num<60))
        System.out.println("Num is greater than 30 and less than 60");
     if((num<=50)||(num>=120))
           System.out.println("Num is less then or equal to 50 or greater then or equal to 120");
    


    }
}

