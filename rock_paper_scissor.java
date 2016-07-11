import java.util.*;
import java.lang.*;
import java.io.Console; 
class rock
{
	public static void main(String[] args)
	{
		int B=1;
		int u1win=0 , u2win=0;
		while (B != 0) 
		{
			int u1=0, u2=0;
			String ch1=null, ch2=null;
			Console console = System.console();
			Scanner s1=new Scanner(System.in);
			System.out.println("select first choice\nr or R for rock\np or P for paper\ns or S for scissor");
			char c1[] = console.readPassword();  			 //take input from user1 //
			
			if ((c1[0] != 'r') && (c1[0] != 'R') && (c1[0] != 'p') && (c1[0] != 'P') && (c1[0] != 's') && (c1[0] != 'S'))
																		// if user1 enter wrong input it shows error // 
			{
				System.out.println("User 1 selects " + c1 + ", This is wrong Input \n Closing the program... Try luck again");
				System.exit(0);
			}
			else
			{
				if(c1[0] == 'r' || c1[0] == 'R')
				{
					ch1 = "Rock";
					u1 = 1;
				}
				else if (c1[0] == 'p' || c1[0] == 'P')
				{
					ch1 = "Paper";
					u1 = 2;
				}
				else 
				{
					ch1 = "Scissor";
					u1 = 3;
				}
			}
			System.out.println("select second choice\nr or R for rock\np or P for paper\ns or S for scissor");
			
			char c2[] = console.readPassword();				 //take input from user2 //
			if ((c2[0] != 'r') && (c2[0] != 'R') && (c2[0] != 'p') && (c2[0] != 'P') && (c2[0] != 's') && (c2[0] != 'S')) 
																		// if user2 enter wrong input it shows error //			
			{
				System.out.println("User 2 selects " + c2 + ", This is wrong Input \n Closing the program... Try luck again");
				System.exit(0);
			}
			else
			{
				if(c2[0] == 'r' || c2[0] == 'R')
				{
					ch2 = "Rock";
					u2 = 1;
				}
				else if (c2[0] == 'p' || c2[0] == 'P')
				{
					ch2 = "Paper";
					u2 = 2;
				}
				else 
				{
					ch2 = "Scissor";
					u2 = 3;
				}
			}    
					
			if((u1==1 && u2==1) || (u1==2 && u2==2) || (u1==3 && u2==3))
			// condition for match tie //
			{
				System.out.println("MATCH TIE");  
				System.out.println("user1 selects "+ ch1);
				System.out.println("user2 selects "+ ch2);		
			}
			else
			{   //user 1 win condition
				if((u1==1 && u2==3) || (u1==2 && u2==1) || (u1==3 && u2==2))
				{
					System.out.println("user1 selects "+ ch1);
					System.out.println("user2 selects "+ ch2);					
					System.out.println("user1 win");
					u1win++;				
				}
				//user 2 win condition
				else
				{
					System.out.println("user1 selects "+ ch1);
					System.out.println("user2 selects "+ ch2);					
					System.out.println("user2 win");
					u2win++;
				}
			}	

      
    	System.out.println("Do you want to play again? Y/N");
      char d =s1.next().charAt(0);			// 
      if((d=='Y')||(d=='y'))
		{
      	B=1;	
      	System.out.println("Rock, Paper,SCISSOR");
    	}
    	else 
    	{
			B=0;	
			System.out.println("user 1  win " + u1win + "times"  );  	//print the user 1 winning time //
			System.out.println("user 2  win " + u2win + "times"  );		//print the user 2 winning time //
		}

	}
 }
	
} 
