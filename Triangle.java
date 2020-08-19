package meyerj;

public class Triangle extends Shape {
	private double length;
	private double base;
	private double height;
	
	public Triangle(String shapeName)
	{
		super(shapeName);
	}
	
	public void setLength(double length)
	{
		if (length > 0)
		{
		this.length = length;
		}
		else
		{
			System.out.println("Please enter length greater than 0.");
		}
	}
	
	public void setBase(double base)
	{
		if (base > 0)
		{
		this.base = base;
		}
		else
		{
			System.out.println("Please enter base greater tha 0.");
		}
	}
	
	public void setHeight(double height)
	{
		if (height > 0)
		{
		this.height = height;
		}
		else
		{
			System.out.println("Please enter height greater than 0.");
		}
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getBase()
	{
		return base;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	@Override
	public double getVolume()
	{
		return getLength() * getBase() * getHeight() / 3;
	}

	@Override
	public double getArea()
	{
		return getBase() * getHeight() / 2;
	}
}
