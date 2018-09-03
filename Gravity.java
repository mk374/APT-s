  public class Gravity {
	  private final double gravity = 9.8;
	  
      public double falling(double time, double velo){
    	  		return velo*time + 0.5*gravity*Math.pow(time, 2.0);
    	  
    	  //d = v0*t + 0.5*a*t2
      }
      
      public static void main(String[] args) {
    	  		double time = 3;
    	  		double velo = 5;
    	  		Gravity grav = new Gravity();
    	  		System.out.print(grav.falling(time, velo));
    	  	
      }
  }