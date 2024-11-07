package chetan.inheritance;

public class Student
{
   private int studentId;
   private String name;
   private long mobileNo;
   
   public Student(int studentId,String name,long mobileNo)
   {
	   this.studentId=studentId;
	   this.name=name;
	   this.mobileNo=mobileNo;
	   
   }
   {
	   System.out.println("hii");
   }
   
   
   public void display()
   {
	   System.out.println("Student Id is:"+studentId);
	   System.out.println("Student Name is:"+name);
	   System.out.println("Student Mobile Number is:"+mobileNo);
   }
}




class JobGuaranteeStudent extends Student{
	
   private	boolean placementGuarantee;
   
   public JobGuaranteeStudent(int id,String name,long mobileNo,boolean placementGurantee)
   {
	   super(id, name, mobileNo);
	   this.placementGuarantee=placementGurantee;
   }
   
   
   
   public void displayStudentInfo()
   {
	   super.display();
	   System.out.println("Placement Guarantee:"+this.placementGuarantee);
   }
	
}
