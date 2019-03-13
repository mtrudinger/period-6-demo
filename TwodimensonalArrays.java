
/**
 * Write a description of class TwodimensonalArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwodimensonalArrays
{
    public static void main (String [] args)
    {
        int [][] nums = 
        {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {10, 11, 12}
        };
        
        //System.out.println( nums[0][1]);
        
        for (int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        for(int [] arr : nums)
        {
            for(int val : arr)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        int sum = 0;
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col < nums[row].length; col++)
            {
                sum += nums[row][col];
            }
        }
        System.out.println("Sum:" + sum);
        
        
        
        int [] sums = new int [nums.length];
        int singlesum = 0;
        for (int row = 0; row < nums.length; row++)
        {
            for (int col = 0; col < nums[row].length; col++)
            {
                singlesum = (nums[row][col]);
                
            }
        }
    }
}
