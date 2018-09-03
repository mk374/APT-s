import java.lang.reflect.Array;

public class SandwichBar{
      
	
	
	
	public int whichOrder(String[] available, String[] orders){
		boolean hey = false;
         for (int i=0; i< orders.length; i++) {
        	 	
        	 	
        	 	while loop of available checking if ing is within availabe
        	 		if even one is not, then it exists with the boolean becoming false
        	 	
        	 	if boolean of the previous while statement is true
        	 		return i;
        	 	
        	 	String[] ing = orders[i].split(" ");
        	 	boolean ingTruth = true;
        	 	int ingC = 0;
        	 	while(ingTruth) {
        	 		for (int i = 0; i < available.length; i++) {
        	 			for (int y =0; y< ing.length; y++) {
        	 				if (available[i].equals(ing[y])) {
        	 					
        	 				}
        	 			}
        	 				
        	 		}
        	 		
        	 		
        	 		ingC++;
        	 	}
         }
         int i = 0;
         
         
         return -1;
     }


	public static void main(String[] args) {
		String[] available = { "ham", "cheese", "mustard" };

		String [] orders = { "ham", "cheese" };
		
		System.out.println(orders in available);

	}


}
