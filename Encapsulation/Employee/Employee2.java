package chetan.encapsulation;

public class Employee2
{
   private String name;
   private int age;
   private String department;
   private double salary;
   private String performance;
   
   
   public Employee2(String name,int age,String department,double salary,String performance)
   {
	   this.name=name;
	   
	   this.age=age;
	   
	   this.department=department;
	   
	   this.salary=salary;
	   this.performance=performance;
	   if(age<=0)
	   {
		   System.err.println("Age must be a positive integer");
	   }
	   else
	   {
		   this.age=age; 
		   
	   }
   }
   
   
   public String getName()
   {
	   return this.name;
   }
   
   public void setName(String name)
   {
	   this.name=name;
   }
   
   
   public int getAge()
   {
	   return this.age;
	   
   }
   
   public void setAge(int age)
   {
	   this.age=age;
	   
   }
   
   public String getDepartment()
   {
	   return this.department;
	   
   }
   public void setDepartment(String department)
   {
	   this.department=department;
   }
   
   
   public double getSalary()
   {
	   return this.salary;
   }
   
   
   public void setSalary(double salary)
   {
	   this.salary=salary;
   }
   
   public String getPerformance()
   {
	   return this.performance;
   }
   
   
   public void setPerformance(String performance)
   {
	   this.performance=performance;
   }
   
   
   
   public double updateSalary()
   {
	   
	   if(performance.equalsIgnoreCase("good"))
	   {
		   salary+=10000;
	   }
	   else if(performance.equalsIgnoreCase("average"))
	   {
		   salary+=5000;
	   }
	   else if(performance.equalsIgnoreCase(null))
	   {
		 salary=salary;
	   }
	   else
	   {
		   System.err.println("Invalid performance");
	   }
	   return salary;
   }


@Override
public String toString() {
	return "Employee2 [name=" + name + ", age=" + age + ", department=" + department + ", salary=" + salary
			+ ", performance=" + performance + "]";
}
   
}
