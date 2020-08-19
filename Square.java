package meyerj;

public class Square extends Shape {
	private double side;
	
	public Square(String shapeName)
	{
		super(shapeName);
	}
	
	public void setSide(double side)
	{
		if (side > 0)
		{
		this.side = side;
		}
		else
		{
			System.out.println("Please enter a number greater than 0.");
		}
	}
	
	public double getSide()
	{
		return side;
	}
	
	@Override
	public double getArea()
	{
		return side * side;
	}
	
	@Override
	public double getVolume()
	{
		return side * side * side;
	}

}
