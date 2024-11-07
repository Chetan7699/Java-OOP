package chetan.inheritance;

public class Person
{
   private  String name;
   private  int age;
    
   public Person(String name,int age)
   {
	   this.name=name;
	   this.age=age;
   }
   
   public void displayDetails()
   {
	   System.out.println("Name of the person is:"+name);
	   System.out.println("Age of the person is:"+age);
   }
   
   
   
}

class Employee extends Person
{
	double salary;
	Employee(String name,int age,double salary)
	{
		super(name,age);
	this.salary=salary;
				
	}
	
	public void displayEmployeeDetails()
	{
		super.displayDetails();
		System.out.println("Salary of employee is:"+salary);
		
	}
}
