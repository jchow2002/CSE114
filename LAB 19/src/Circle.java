public class Circle {
	double radius = 1.0;
	static int numofobjs = 0;

	public Circle() {
		numofobjs++;
	}

	public Circle(double r) {
		radius = r;
		numofobjs++;

	}

	public static int numofobjs() {
		return numofobjs;
	}

	public int getArea() {
		return Circle.numofobjs;
	}

	// toString method has the same header in all the class
	// this method returns the object description in a string
	public String toString() {
		String st;
		st = "The circle with radius: " + radius + " The num of obj is " + numofobjs;

		return st;
	}
}
