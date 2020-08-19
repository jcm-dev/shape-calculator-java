package meyerj;

public class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(String shapeName) {
		super(shapeName);
	}

	public void setLength(double length) {
		if (length > 0) {
			this.length = length;
		} else {
			System.out.println("Please enter length greater than 0.");
		}
	}

	public void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		} else {
			System.out.println("Please enter width greater than 0.");
		}
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public double getArea() {
		return getLength() * getWidth();
	}

	@Override
	public double getVolume() {
		return getLength() * getWidth() * getWidth();
	}
}
