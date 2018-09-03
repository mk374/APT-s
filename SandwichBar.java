import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SandwichBar{
	public int whichOrder(String[] available, String[] orders){
		
		
		for (int i= 0; i < orders.length; i++) {
			//maximum number of true's an order can get
			int maxScore = 0;
			
			//getting each individual order into a set with no duplicates
			Set<String> or1 = new HashSet<String>();
			//below line is splitting the respective order
			String[] spl = orders[i].split(" ",0);
			for (int k = 0; k < spl.length; k++) {
				or1.add(spl[k]);
			}
			
			//limit of the number of trues
			int limit = or1.size();
			// adding the number of trues
			for(String s: or1) {
				if(Arrays.asList(available).contains(s)) {
					maxScore += 1;
				}
			}
			if (maxScore == limit) {
				return i;
			}
				
		}
		return -1;
	
	}
	
}
