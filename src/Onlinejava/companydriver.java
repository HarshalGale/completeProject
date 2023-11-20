package Onlinejava;

import java.util.Scanner;

public class companydriver {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		company c=new company("Enter the company name");
		String company name=sc.next();
		company con=new company(company name);
		System.out.println("Enter your choice: \n 1.Addemployee\n 2.removeemployee\n 3.updateemployee");
		
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter employee name");
			String empname=sc.next();
			System.out.println("Enter employee id");
			int emp_id=sc.nextInt();
			System.out.println("Enter employee cno");
			long cno=sc.nextLong();
		}
		break;
		case 2:
		{
			c.removeEmployee();
		}
		break;
		case 3:
		{
			c.updateEmpName();
		}
		break;
		default:
		{
			
		    System.out.println("invalid choice");
		}	
			
		}
	
	}

}
