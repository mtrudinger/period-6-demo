
/**
 * Write a description of class Arrays here.
 *
 * @author Mostyn Trudinger-Smith
 * @version 8/7/18
 */
public class Arrays
{
    public static void main (String [] args)
    {
       /*int temp1 = 99;
       int temp2 = 102;
       int temp3 = 105;
       int temp4 = 98;
       int temp5 = 103;
       double average = (temp1 + temp2 +temp3 + temp4 + temp5)/5.0;
       System.out.println("The average temperature is " + average + " degrees.");
       */
      
     //  int [] temps = {99, 102, 105, 98, 103, 107, 109};
      
       /*
       System.out.println(temps[3]);
       System.out.println();
       */
      
      
    /*  
       for(int i = 0; i < temps.length; i++)
       {
           System.out.print(temps[i] + " ");
        }
        
        System.out.println();
        
       int sum = 0;
       for(int i = 0; i < temps.length; i++)
       {
           sum = sum + temps[i];
        
          
       }
    
    double average2= (double)sum/temps.length;
    
    System.out.println("average temp is " + average2);
    */
    
   /*
    double [] nums = {32, 0, 993};
    char [] letters = { 'g', 't', 'r'};
    String [] words = {"cat", "duck"};
    
    int [] unknowns = new int[10];
    unknowns [3] = 17;
    
    */
    
    //int arr [] = {100, -25, 76, 8769, -31};
    
    /*
   find the largest value in the array
   */
    //int largestnum = arr[0];
   
   // for (int i = 1; i < arr.length; i++)
    {
        //if( arr[i] > largestnum)
        {
            //largestnum = arr[i];
            
        }
    }
    //System.out.println("The largest number in thid array is " + largestnum + ".");
    
    
    /*
   find the smallest value in the array
   
    int minnum = arr[0];
    for (int i = 1; i < arr.length; i++)
    {
        if( arr[i] < minnum)
        {
            minnum = arr[i];
        }
    }
    System.out.println("The lowest number in this array is " + minnum + ".");
    

    
    find the index of the largest value in the array
    

     int maxIndex = 0;
   
    for (int i = 1; i < arr.length; i++)
    {
        if( arr[i] > arr[maxIndex])
        {
            
            maxIndex = i;
            
        }
    }
    System.out.println("The indx of the largest number in this array is " + maxIndex + ".");
    
    /*
   find the index of the smallest value in the array
   
    int minIndex = 0;
   
    for (int i = 1; i < arr.length; i++)
    {
        if( arr[i] < arr[minIndex])
        {
            
            minIndex = i;
            
        }
    }
    System.out.println("The indx of the smallest number in this array is " + minIndex + ".");
  
    
    
    String [] names = {"Mostyn", "Cassie", "Bianca", "Other person"};
    int rand = (int)(Math.random() * names.length);
    System.out.println(names[rand]);
    
    */
    
   int [] nums3 = {5, 17, 291, 35};
   
    for(int num : nums3)
    {
        System.out.print(num + " ");
    }
    System.out.println();
    
    String [] words = {"apple", "fog", "wool"};
    
    for( String word : words)
    {
        System.out.print(word + " ");
    }
    System.out.println();
    
    int sum = 0;
    
    for(int num:nums3)
    {
        sum += num;
    }
    System.out.print(sum);
    
    
}
}
