import java.util.Scanner;
/**
 * Boring MASH Game with no theme
 *
 * @author Mostyn Trudinger-Smith
 * @version 8/19/28
 */
public class MASHGame
{   public static void main (String [] args)
    {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Lets play MASH!");
        String [] homes = {"Mansion", "Apartment", "Shack", "House"};
        
        System.out.println("Enter four jobs, each on an new line.");
        String [] jobs = new String [4];
        for (int i = 0; i < jobs.length; i++)
        {
            jobs [i] = kb.nextLine();
            
        }
         
        System.out.println("Great! Now enter four modes of transportation, each on a new line");
        String [] transport = new String [4];
        for(int i = 0; i < transport.length; i++)
        {
            transport [i] = kb.nextLine();
        }
        
        System.out.println("Great! Now enter four types pets each on a new line");
        String [] pets = new String [4];
        for(int i = 0; i < pets.length; i++)
        {
            pets [i] = kb.nextLine();
        }
        
        System.out.println("These are the options for your future:");
        
        System.out.print("Dwellings: ");
        for (int i= 0; i < homes.length; i++)
        {
            System.out.print(homes [i]);
            
            if (homes.length > (i + 1))
            {
              System.out.print(", "); 
            }
            else
            {
                 System.out.print(".");
            }
            
        }
        
        
        System.out.println();

         System.out.print("Jobs: ");
        for (int i= 0; i < jobs.length; i++)
        {
            System.out.print(jobs [i]);
            
            if (jobs.length > (i + 1))
            {
              System.out.print(", "); 
            }
            else
            {
                 System.out.print(".");
            }
        }
        
                
        System.out.println();

         System.out.print("Transportation: ");
        for (int i= 0; i < transport.length; i++)
        {
            System.out.print(transport [i]);
            if (transport.length > (i + 1))
            {
              System.out.print(", "); 
            }
            else
            {
                 System.out.print(".");
            }
        }
        
                
        System.out.println();

         System.out.print("Pets: ");
         
        for (int i= 0; i < pets.length; i++)
        {
            System.out.print(pets [i]);
            if (pets.length > (i + 1))
            {
              System.out.print(", "); 
            }
            else
            {
                 System.out.print(".");
            }
        }
        
        System.out.println("\n Press enter");
        
        String enter = kb.nextLine();
        System.out.print('\u000C');
        for (int i = 0; i < 4; i++)
        {
            System.out.print("Preparing Algorithms");
            
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            System.out.print(".");
            
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            System.out.print(".");
            
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            System.out.print(".");
            
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            System.out.print('\u000C');
        }
            
            
            
       
        int ranjob = (int)(Math.random() * jobs.length);
        int rantransport = (int)(Math.random() * transport.length);
        int ranpet = (int)(Math.random() * pets.length);
        int ranhome = (int)(Math.random() * homes.length);
       
        System.out.println("Now to determine your future...");
        try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        
        
        for (int i = 0; i < 4; i++)
        {
            System.out.print('\u000C');
            System.out.print("Your dwelling:");
            
            System.out.print(homes [i]);
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            System.out.print('\u000C');
            System.out.print("Your dwelling:");
        }
        
        for (int i = 0; i <= (ranhome); i++)
        {
            
            System.out.print('\u000C');
            
            System.out.print("Your dwelling:");
            
            System.out.print(homes [i]);
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            //System.out.print("Your dwelling:");
        }
        
        try
            {
                Thread.sleep(600);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
        
        
        for (int i = 0; i < 4; i++)
        {
            
            System.out.print('\u000C');
            System.out.println("Your dwelling:" + homes [ranhome]);
            System.out.print("Your job:");
            
            System.out.print(jobs [i]);
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            
           
        }
       
        for (int i = 0; i <= (ranjob); i++)
        {
            
            System.out.print('\u000C');
            
            System.out.println("Your dwelling:" + homes [ranhome]);
            
            System.out.print("Your job:");
            
            System.out.print(jobs [i]);
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
           
        }
        
        try
            {
                Thread.sleep(600);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        
        
        
        
        
        for (int i = 0; i < 4; i++)
        {
            System.out.print('\u000C');
            System.out.println("Your dwelling:" + homes [ranhome]);
            
            System.out.println("Your job:" + jobs [ranjob] );
            
            System.out.print("Your Transportation:");
            
            System.out.print(transport [i]);
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
        }
        
        for (int i = 0; i <= (rantransport); i++)
        {
            
            System.out.print('\u000C');
            
            System.out.println("Your dwelling:" + homes [ranhome]);
            
            System.out.println("Your job:" + jobs [ranjob] );
            
            System.out.print("Your Transport:");
            
            System.out.print(transport [i]);
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            
        }
        
        try
            {
                Thread.sleep(600);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
         
        
        
        for (int i = 0; i < 4; i++)
        {
            System.out.print('\u000C');
            System.out.println("Your dwelling:" + homes [ranhome]);
            
            System.out.println("Your job:" + jobs [ranjob] );
            
            System.out.println("Your Transport:" + transport [rantransport]);
            
            System.out.print("Your Pet:");
            
            System.out.print(pets [i]);
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
        }
        
        for (int i = 0; i <= (ranpet); i++)
        {
            
            System.out.print('\u000C');
            
            System.out.println("Your dwelling:" + homes [ranhome]);
            
            System.out.println("Your job:" + jobs [ranjob] );
            
            System.out.println("Your Transport:" + transport [rantransport]);
            
            System.out.print("Your Pet:");
            
            System.out.print(pets [i]);
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            
            
        }
        
    } 
  }
