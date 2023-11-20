package Onlinejava;

import java.util.Scanner;

public class company {
	String company_name;
	employee e;
	 company(String company_name)
	 {
		 this.company_name=company_name;
	 }
	 public void addEmpolyee(String emp_name,int emp_id,long cno)
	 {
		  if(e!=null)
		  {
			  System.out.println("employee already present");
		  }
		  else
		  {
			    int emp = 0;
				String empname = null;
				e=new employee(empname,emp,cno);
			    System.out.println("Employee added sucessfully");
		  }
	 }
	 public void removeEmployee()
	 {
		  if(e!=null)
		  {
			  e=null;
			  System.out.println("Employee remove successfully");
		  }
		  else
		  {
			  System.out.println("No employee present");
		  }
		  }
	 public void updateEmpName()
	 {
		 if(e!=null)
		 {
			 @SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the new name of the employee you want to update");
		  String new_name=sc.nextLine();
		  e.setEmpName(new_name);
		  System.out.println("Name update sucessfully");
		  System.out.println("The update name is "+new_name);
		 }
		 else
		 {
			 System.out.println("Employee not found");
		 }
	 }
	   public void getEmpDetails()
	   {
		   if(e!=null)
		   {
			   System.out.println("====== EMPOLYEE DETAILS=====");
			   System.out.println("The employee cno is "+e.getClass());
			   System.out.println("The employee id is "+e.getEmpId());
			   System.out.println("The employee name is "+e.getEmpName());
		   }
		   else
		   {
			   System.out.println("Employee not found");
			   
		  
		 }
		 

	 }

}
