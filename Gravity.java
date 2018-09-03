  public class Gravity {
	  private final double gravity = 9.8;
	  
      public double falling(double time, double velo){
    	  		return velo*time + 0.5*gravity*Math.pow(time, 2.0);
    	  
    	  
      }
     
  }