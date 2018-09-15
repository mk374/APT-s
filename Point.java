
public class Point {
	private double myX;
	private double myY;
	public Point() {
		myX = 0.000;
		myY = 0.000;
	}
	public Point(double x, double y) {
		myX = x;
		myY = y;
	}
	public static void main(String[] args) {
		Point a = new Point();
		System.out.println(a);
	}
}
