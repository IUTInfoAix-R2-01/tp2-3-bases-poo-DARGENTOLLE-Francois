package Rectangle;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;
	public Rectangle() {
		length =1.0f;
		width = 2.0f;
	}
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return 2*(length+width);
	}
	public String toString() {
	      return "Rectangle[length=" + length + " width = "+ width + "]";
	}
}
