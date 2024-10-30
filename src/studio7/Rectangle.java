package studio7;

public class Rectangle {
	private int length;
	private int width;
	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
}
public int area() {
	return length * width;
}
public int perimeter() {
	return 2 * length + 2 * width;
}
public String toString() {
	return "length : " + length + "width : " + width;
}
	
	public static void main(String[] args) {
Rectangle rectangleExample = new Rectangle(5, 5);
		System.out.println(rectangleExample.area());
		System.out.println(rectangleExample.perimeter());
		System.out.println(rectangleExample);
	}
}


