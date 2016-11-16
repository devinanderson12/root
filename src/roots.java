import java.util.Scanner;

/**
 * 
 */

/**
 * @author d.anderson2
 *
 */
public class roots {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner userInput = new Scanner(System.in);
		double userNum;
		 
	    
		
		do{
			
			System.out.print("\nWhat is your number? ");
	    	userNum = userInput.nextDouble();
	    			
	    	 
	    	if(userNum < 1){
	    		System.out.print("Please enter a positive Number! ");
	    	}	  
		    
	    	
		} while(userNum < 1);
	
		
		System.out.println("Your square root is: " + Math.sqrt(userNum));
		
		
		userInput.close();
		

	}

}
