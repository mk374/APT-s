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
    
    public static void main(String[] args) {
    		int [] a = {1,2,3,4,5};
    		Totality foo = new Totality();
    		System.out.println(foo.sum(a, "all"));
    		
    		ArrayList<String> x = new ArrayList<String>();
    		x.add("purple");
    		System.out.println(x);
    		HashSet<String> y = new HashSet<String>(x);
    		System.out.print(y);
    		
    		
    }
}