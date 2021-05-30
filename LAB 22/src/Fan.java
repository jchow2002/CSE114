public class Fan {
	final static int slow = 1;
	final static int medium = 2;
	final static int fast = 3;

	private int speed;
	private boolean on;
	private double radius;
	private String color;

	Fan() {
		speed = slow;
		on = false;
		radius = 1;
		color = "blue";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean getOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		if (on == true)
			return "A " + this.getRadius() + " inch " + this.getColor() + " fan at a speed of " + this.getSpeed();
		else
			return "A " + this.getRadius() + " inch " + this.getColor() + " fan" + "; fan is off";
	}

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();

		fan1.setSpeed(fast);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);

		fan2.setSpeed(medium);
		fan2.setRadius(5);

		System.out.println(fan1.toString());
		System.out.println(fan2.toString());

	}

}