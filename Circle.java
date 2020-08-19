package meyerj;

public class Circle extends Shape {
	private double radius;
	
	public Circle(String shapeName)
	{
		super(shapeName);
	}
	
	public void setRadius(double radius)
	{
		if (radius > 0)
		{
		this.radius = radius;
		}
		else
		{
			System.out.println("Please enter a positive number greater than 0.");
		}
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	@Override
	public double getArea()
	{
		return Math.PI * (getRadius() * getRadius());
	}
	
	@Override
	public double getVolume()
	{
		return 4/3 * Math.PI * (getRadius() * getRadius() * getRadius());
	}
}
