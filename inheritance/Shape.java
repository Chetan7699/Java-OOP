package chetan.inheritance;

public class Shape
{
    private String color;
    public Shape(String color)
    {
    	this.color=color;
    }
    
    
    public void displayColor()
    {
    	System.out.println("Color of the shape is:"+color);
    }
}

class Circle extends Shape{
	private double radius;
	public Circle(double radius,String color)
	{
		super(color);
		this.radius=radius;
	}
	
	
	public double area()
	{
		 final double pi=3.14;
		 return pi*radius*radius;
	}
	
	public void displayArea()
	{
		super.displayColor();
		System.out.println("Area of circle is:"+this.area());
	}
	
}
