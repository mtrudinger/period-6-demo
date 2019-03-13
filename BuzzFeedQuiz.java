import java.util.Scanner;
/**
 * Find out what type of fence you are!
 *
 * @author Mostyn Trudinger-Smith :(
 * @version 8/28/18
 */
public class BuzzFeedQuiz
{
    public static void main (String []args)
    
    {
        Scanner kb = new Scanner(System.in);
        int electric = 0;
        int chainlink = 0;
        int picket = 0;
        int gardenfence = 0;
        
        System.out.println("Find out what type of fence you are!");
        
        System.out.println("What do you see in your future?(Enter a 1,2,3,or 4)");
        System.out.println("1: A conservative family with a big house and 2.5 kids");
        System.out.println("2: Prison");
        System.out.println("3: Lots of houseplants instead of a family");
        System.out.println("4: Owning a private business");
        int question1 = kb.nextInt();
        
       switch(question1)
       {
       case 1:
       picket++;
       break;
       
       case 2:
       electric++;
       break;
       
       case 3:
      gardenfence++;
       break;
       
       case 4:
       chainlink++;
       break;
      
       default:
       System.out.println("That isn't an option. please try again");
            break;
    }
    
      System.out.println("How do you spend typical weekend?(Enter a 1,2,3,or 4)");
        System.out.println("1: Taking a hike or being in nature");
        System.out.println("2: None of your business");
        System.out.println("3: Having a picnic on your front lawn with fireworks in the background");
        System.out.println("4: Isolated");
        int question2 = kb.nextInt();
        
       switch(question2)
       {
        case 1:
        gardenfence++;
        break;
        
        case 2:
        chainlink++;
        break;
        
        case 3:
        picket++;
        break;
        
        case 4:
        electric++;
        break;
        
        default:
        System.out.println("That isn't an option. please try again");
            break;
        }
        
        System.out.println("What word/phrase best describes you?(Enter a 1,2,3,or 4)");
        System.out.println("1: Dangerous");
        System.out.println("2: Snobbish ");
        System.out.println("3: Chill and aesthetic");
        System.out.println("4: Edgy");
        int question3 = kb.nextInt();
        
        switch(question3)
        {
            case 1:
            electric++;
            break;
            
            case 2:
            picket++;
            break;
            
            case 3:
            gardenfence++;
            break;
            
            case 4:
            chainlink++;
            break;
            
            default:
            System.out.println("That isn't an option. please try again");
            break;
        }
        
        System.out.println("What type of music do you prefer?(Enter a 1,2,3,or 4)");
        System.out.println("1: Rock");
        System.out.println("2: Indie");
        System.out.println("3: Electronic");
        System.out.println("4: Americana");
        int question4 = kb.nextInt();
        switch (question4)
        {
            case 1:
            chainlink++;
            break;
            
            case 2:
            gardenfence++;
            break;
            
            case 3:
            electric++;
            break;
            
            case 4:
            picket++;
            break;
            
            default:
            System.out.println("That isn't an option. please try again");
            break;
        }
        
        System.out.println("Pick a color(Enter a 1,2,3,or 4)");
        System.out.println("1: Green: ");
        System.out.println("2: Yellow");
        System.out.println("3: White");
        System.out.println("4: Gray");
        int question5 = kb.nextInt();
        switch(question5)
        {
            case 1:
            gardenfence++;
            break;
            
            case 2:
            electric++;
            break;
            
            case 3:
            picket++;
            break;
            
            case 4:
            chainlink++;
            break;
            
            default:
            System.out.println("Not an option. please try again");
            break;
        }
        
        if(electric > chainlink)
        
            if (electric > gardenfence)
        
            
                if(electric > picket)
                
                System.out.println("You are an electric fence! You are a lone wolf, who likes to live on the edge.");
            
        if(chainlink > electric)
        
            if(chainlink > gardenfence)
            
                if(chainlink > picket)
                System.out.println("You are a chainlink fence! You are independent and off beat but still guided and steady.");
            
         if(gardenfence > electric)
        
            if(gardenfence > chainlink) 
            
                if(gardenfence> picket)
                System.out.println("You are a garden fence! You are calm, and like to go with the flow, and to be in nature.");
            
         if(picket > electric)
        
            if(picket > chainlink)
            
                if(picket > gardenfence)
                System.out.println("You are a picket fence! You are are proud and a bit snobbish.");
            
         if(picket == 2 && electric == 2)
        System.out.println("You are a mix of picket and electric fence. You are a suburban punk.");
        else if(picket == 2 && gardenfence == 2)
        System.out.println("You are a mix of picket and garden fence. You are snobbish but not in other people faces about it.");
        else if(picket == 2 && chainlink == 2)
        System.out.print("You are a mix of picket and chain link. You are snobbish, but you try to hide it so that’s good at least.");
        else if(chainlink == 2 && electric == 2)
        System.out.println("You are a mix of chainlink and electric. You are independent, and like to live on the edge, but still motivated.");
        else if(chainlink == 2 && gardenfence == 2)
        System.out.println("You are a mix of chainlink and garden fence. You are independent, chill and calm.");
        else if(electric == 2 && gardenfence == 2)
        System.out.println("You are a mix of electric and garden fence. You are calm and chill, but also like to live on the edge.");



}
}

