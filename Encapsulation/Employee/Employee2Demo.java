package chetan.encapsulation;

public class Employee2Demo
{

	public static void main(String[] args) 
	{
      Employee2 employee=new Employee2("Shaktiman",0,"Sales",50000,"Average");
      employee.updateSalary();
      System.out.println(employee);
      Employee2 employee1=new Employee2("Gangadhar",6,"HR",47000,"null");
      employee1.updateSalary();
      System.out.println(employee1);
      
      Employee2 employee2=new Employee2("chetan",21,"Software",60000,"good");
      
      
      employee2.updateSalary();
      System.out.println(employee2);
      
     
	}

}
