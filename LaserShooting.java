import java.util.*;
public class LaserShooting {
	public double numberOfHits(int[] x, int[] y1, int[] y2) {
		List<Double> angles = new ArrayList<Double>();
		
		for (int i = 0; i<x.length; i++){
			double ang1 = Math.abs(Math.atan(((double) y1[i])/x[i]));
			System.out.println(ang1);
			double ang2 = Math.abs(Math.atan(((double) y2[i]/x[i])));
			System.out.println(ang2);
			double prob;
			if ((y1[i] >= 0 && y2[i] >= 0) || (y1[i] <=0 && y2[i] <= 0)) {
				prob = Math.abs((ang1 - ang2) / Math.PI);
			}
			else {
				prob = Math.abs(ang1+ang2)/Math.PI;
			}
		
			System.out.println(prob);
			//double expva = prob * (Math.abs(y1[i]) + Math.abs(y2[i]));
			angles.add(prob);
		}
		double totalsum = 0;
		for(Double d: angles) {
			totalsum += d;
		}
		
		return totalsum; // the expected value of the number of targets hit.
        // fill in code here
	}
	
	public static void main(String[] args) {
		int [] x = {739};
		int [] y1 = {-281};
		int [] y2 = {971};
		LaserShooting foo = new LaserShooting();
		System.out.print(foo.numberOfHits(x,y1,y2));
	}
}
