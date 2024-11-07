package chetan.encapsulation;
import java.util.Scanner;
public class Employee 
{
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProjects;
	
	public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProjects) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProjects = noOfProjects;
	}
	public static Employee getObject()
	{
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.print("Enter Employee first name:");
	  String fname=sc.next();
	  System.out.print("Enter Employee last name:");
	  String lname=sc.next();
	  System.out.println("Enter Employee Salary:");
	  double salary=sc.nextDouble();
	  System.out.println("Enter Employee Id");
	  int id=sc.nextInt();
	  System.out.println("Enter Number of projects:");
	  int projects=sc.nextInt();
	  return new Employee(fname, lname, id, salary, projects);
	}
 
	public void calculateSalary()
	{
		if(noOfProjects>0)
		{
	
		if(noOfProjects>5 && noOfProjects<10)
		{
			salary+=5000;
		}
		else if(noOfProjects>10 && noOfProjects<=20)
		{
			salary +=10000;
		}
		else
		{
			salary+=15000;
		}
		}
		else 
		{
			System.err.println("Invalid Number of projects");
		}
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", noOfProjects=" + noOfProjects + "]";
	}

}
