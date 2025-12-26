/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		sierpinski(n, 0.2, 0.5, 0.8, 0.2, 0.8, 0.2);
	}
	
	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		//Base case
		if (n == 0){
			return;
		}
		//Draw an equilateral triangle.
		StdDraw.line(x1, y1, x2, y2);
		StdDraw.line(x1, y1, x3, y3);
		StdDraw.line(x3, y3, x2, y2);

		//Caculate the smaller equilateral triangles points
		double xMid0 = (x1 + x2) / 2;
		double xMid1 = (x2 + x3) / 2;
		double yMid = (y1 + y2) / 2;

		//Subdivide it into four smaller equilateral triangles recursivly
		sierpinski(n-1, x1, xMid0, x2, y1, yMid, y1);
		sierpinski(n-1, xMid0, x2, xMid1, yMid, y2, yMid);
		sierpinski(n-1, x2, xMid1, x3, y1, yMid, y1);

	}
}
