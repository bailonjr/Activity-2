package candymachine;
import java.util.Scanner;

public class productSelect {
	
void showCost(){
Scanner in = new Scanner ( System.in );

System.out.println("PRESS 1 FOR CANDY| PRESS 2 FOR GUM | PRESS 3 FOR CHIPS | PRESS 4 FOR COOKIES");
	
switch ( in.nextInt() ) {

			  default:
			  System.out.println ( "Invalid option." );
			  System.out.println ( "Please try again." );
			  break;
			  
			  case 1:      
			  System.out.println ( "Candy cost you 1.00" );              
			  System.out.println ( "Input your money:" );
			  
			  Scanner sc = new Scanner(System.in);
			  float money = sc.nextFloat();
			 
			  if (money > 1) {
			  System.out.println( "Your change is "+ (money - 1));
			  System.out.println();
			  System.out.println("You can claim your purchased item. Have a nice day!");
			  }
			  else {
				  System.out.println("You have insufficient fund.");
			  }
			  break;
			
			  case 2:
			  System.out.println ( "Gum cost you 5.00" );              
			  System.out.println ( "Input your money:" );
			  
			  Scanner sc1 = new Scanner(System.in);
			  float money1 = sc1.nextFloat();
			  
			  if (money1 > 5) {
			  System.out.println( "Your change is "+ (money1 - 5));
			  System.out.println();
			  System.out.println("You can claim your purchased item. Have a nice day!");
			  }
			  else {
				  System.out.println("You have insufficient fund.");
			  }
			  break;
			
			  case 3:
			  System.out.println ( "Chips cost you 7.50" );             
			  System.out.println ( "Input your money:" );
			  
			  Scanner sc2 = new Scanner(System.in);
			  float money2 = sc2.nextFloat();
			  
			  if(money2 > 7.50) {
			  System.out.println( "Your change is "+ (money2 - 7.5));
			  System.out.println();
			  System.out.println("You can claim your purchased item. Have a nice day!");
			  }
			  else {
				  System.out.println("You have insufficient fund.");
			  }
			  break;
			
			  case 4:
			  System.out.println ( "Cookies cost you 9.25"  );
			  System.out.println ( "Input your money:" );
			  
			  Scanner sc3 = new Scanner(System.in);
			  float money3 = sc3.nextFloat();
			  
			  if (money3 > 9.25) {
			  System.out.println( "Your change is "+ (money3 - 9.25));
			  System.out.println();
			  System.out.println("You can claim your purchased item. Have a nice day!");
			  }
			  else {
				  System.out.println("You have insufficient fund.");
              }                                         
		}
			
	}
}
