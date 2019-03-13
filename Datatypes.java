
/**
 * Introduction to data types
 *
 * @author Mostyn Trudinger-Smith
 * @version 8/9/18
 */
public class Datatypes
{
    public static void main (String [] args)
    {
        //System.out.println(7*5);
        int num1=2;
        int num2=8;
        int num3= num1*num2;
        num2=5;
        System.out.println(num1+num2);
        System.out.println(num3);
        //byte has width of 8 bits
      
        byte mybyte=125;
        System.out.println((byte)(mybyte+10));//misbehaves
        //short has a width of 16 bites and holds a value of -32,728 and 32,768
        short myshort=30000;
        //int has a width of 32 bits, holds a value of -2^36 and 2^63
        int myint= 543433;
        //long width of 24 bits -2^63 AND 2^63 -1
        long mylong= 3543324543L;
        // float width of 32 bits and holdes floating point value 
        float myfloat= 54.43F;
        // width 64 bits holdes floating point value
        double mydouble= 5236.543;
        // char hold a single character, wrapped in single quotes
        char myChar= 'G';
        
        char myChar2= '\u0152';
        System.out.println(myChar2);
        //booleans hold true or false 1 bit wide
        boolean myBoolean= false;
        //Strings objects, not primitave data types. Wrap in double quotes
        String name= "Mostyn"; 
        System.out.println(name);
    }
}
