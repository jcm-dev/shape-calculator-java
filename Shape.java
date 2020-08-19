package meyerj;

public abstract class Shape {
	
	private final String shapeName;
	
	public Shape(String shapeName)
	{
		this.shapeName = shapeName;
	}
	
	public abstract double getArea();
	
	public abstract double getVolume();
	
	public String getName()
	{
		return shapeName;
	}
}
