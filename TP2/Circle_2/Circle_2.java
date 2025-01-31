package Circle_2;

public class Circle_2 {
	private double radius;
	public Circle_2() {
		radius = 1.0;
	}
	public Circle_2(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		   this.radius = radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getCircumference() {
		return 2*radius*Math.PI;
	}
	
	public String toString() {
	      return "Circle[radius=" + radius + "]";
	}
}
