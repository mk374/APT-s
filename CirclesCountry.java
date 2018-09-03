public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
    		
    	boolean [] beginCircles = new boolean[x.length];
    	boolean [] endCircles = new boolean[x.length];
    	
    	int totalBegin = 0;
    	int totalEnd = 0;
    	int totalSame = 0;
    	
    	for (int i = 0; i<x.length; i++) {
    		double xCor = Math.pow((x[i] - x1),2) +  Math.pow((y[i]-y1), 2);
    		//double yCor = Math.abs(y[i] - y1);
    		if (xCor < Math.pow((r[i]),2)) {
    			beginCircles[i] = true;
    		}
    		else {
    			beginCircles[i] = false;
    		}
    		
    		double xCor2 = Math.pow((x[i] - x2),2) +  Math.pow((y[i]-y2), 2);
    		//int yCor2 = Math.abs(x[i] - x2);
    		if (xCor2 < Math.pow((r[i]),2)) {
    			endCircles[i] = true;
    		}
    		else {
    			endCircles[i] = false;
    		}
    	}
    	for (int i = 0; i<beginCircles.length; i++) {
    		if (beginCircles[i] == true) {
    				totalBegin++;
    		}
    		if (endCircles[i] == true) {
    				totalEnd++;
    		}
    		if (beginCircles[i] == true && endCircles[i] == true) {
    				totalSame ++;
    		}
    	}
        return (totalBegin + totalEnd - (totalSame*2));
    }
    
    public static void main (String[] args){
    		CirclesCountry foo = new CirclesCountry();
    		
    		int [] x = {0, 0, 0, 0 };
    		int [] y = {0, 7, 6, -6};
    		int [] r = {10, 1, 3, 2 };
    				
    		int result = foo.leastBorders(x,y,r, 0,7,0,-6);
    		System.out.print(result);
    }
 }