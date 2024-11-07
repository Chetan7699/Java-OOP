package chetan.encapsulation;
import java.util.Scanner;
public class EmployeeDemo
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number of Employees:");
		int noOfEmployees=sc.nextInt();
		
		Employee arr[] = new Employee[noOfEmployees];
		
		for(int i=0;i<arr.length;i++)
		{
		Employee employee=Employee.getObject();
		employee.calculateSalary();
		arr[i] = employee;
		
		}
		for (Employee employee : arr) {
			System.out.println(employee);
		}
		sc.close();
		
		
		
	}

}
