package chetan.inheritance;

public class Vehicle 
{
	private String brand;
	private int year;
	
	public Vehicle(String brand,int year)
	{
		this.brand=brand;
		this.year=year;
	}
	
	public void start()
	{
		System.out.println("The vehicle is starting");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}

class Car extends Vehicle
{
	private String model;
	Car(String brand,int year,String model)
	{
		super(brand,year);
		this.model=model;
		
	}
	
	public void displayCarDetails()
	{
		System.out.println("Car brand is: "+super.getBrand());
		System.out.println("Car year is: "+super.getYear());
		System.out.println("Car model is: "+model);
	}
}
