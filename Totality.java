import java.util.ArrayList;
import java.util.HashSet;

public class Totality {
    public int sum(int[] a, String stype) {
    		int sum = 0;
        if (stype.equals("odd")) {
        		for (int i = 0; i< a.length; i++) {
        			if (i%2 != 0) {
        				sum += a[i];
        			}
        		}
        }
        else if( stype.equals("even")) {
        		for (int i = 0; i< a.length; i++) {
        			if (i%2 == 0) {
        				sum += a[i];
        			}
        		}
        }
        else {
     
        		for (int i = 0; i< a.length; i++) {
        				sum += a[i];
        		}
        }
        return sum;
    }
    
    
}