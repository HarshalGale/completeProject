package ola;

import java.util.Scanner;
public class olaApp 
{
	ola o=new ola();
	Scanner sc=new Scanner(System.in);
	int point=1;
	public void login()
	{
		if(o.a==null)
		{
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter cno");
			long cno=sc.nextLong();
			System.out.println("enter gender");
			char gender=sc.next().charAt(0);
			System.out.println("enter address");
			String address=sc.next();
			o.a=new Account(name,cno,gender,address);
			System.out.println("account is created");
			
		}
		else
		{
			System.out.println("already account is existing");
		}
		
		
	}
	public void logout()
	{
		if(o.a!=null)
		{
			o.a=null;
			System.out.println("logout is done!!! :)");
		}
		else
		{
			System.err.println("first login");
		}
	}
	public void MakeaRide()
	{
		if(o.a!=null)
		{
			System.out.println("1.mini 2.prime3.sweden");
			switch(sc.nextInt())
			{
			case 1:
			{
				System.out.println("enter from");
				String f=sc.next();
				System.out.println("enter to");
				String t=sc.next();
				System.out.println("enter km");
				int km=sc.nextInt();
				o=new mini(f,t,km);
				point++;
				System.out.println("booked");
				break;
			}
			case 2:
			{
				System.out.println("enter from");
				String f=sc.next();
				System.out.println("enter to");
				String t=sc.next();
				System.out.println("enter km");
				int km=sc.nextInt();
				o=new prime(f,t,km);
				System.out.println("booked");
				point++;
				break;
			}
			case 3:
			{
				System.out.println("enter from");
				String f=sc.next();
				System.out.println("enter to");
				String t=sc.next();
				System.out.println("enter km");
				int km=sc.nextInt();
				o=new sweden(f,t,km);
				point++;
				System.out.println("booked");
			}
			}
  		}
		else
		{
			System.err.println("first login");
		}
	}
	public void cancelRide()
	{
		if(point==1)
		{
			System.out.println("first make ride");
		}
		else
		{
			o=new ola();
			point--;
			System.err.println("OOPs");
		}
	}
     public void makeABill()
     {
    	if(point==1) 
    	{
    		System.out.println("first make a ride");
    		
    	}
    	else
    	{
    		if(o instanceof mini)
    		{
    			mini m=(mini)o;
    			int wallet=m.km*m.p;
    			System.out.println("enter money more than"+wallet);
    			int money=sc.nextInt();
    			if(money>=wallet)
    			{
    				System.out.println("payment succesfull");
    			}
    			else
    				System.out.println("server slow");
    			
    		}
    		else if(o instanceof prime)
    		{
    			prime m=(prime)o;
    			int wallet=m.km*m.p;
    			System.out.println("enter money more than"+wallet);
    			int money=sc.nextInt();
    			if(money>=wallet)
    			{
    				System.out.println("payment succ");
    			}
    			else
    				System.out.println("server slow");
    		}
    		else
    		{
    			sweden m=(sweden)o;
    			int wallet=m.km*m.p;
    			System.out.println("enter money morethan"+wallet);
    			int money=sc.nextInt();
    			if(money>=wallet)
    			{
    				System.out.println("payment succ");
    			}
    			else
    				System.out.println("server slow");
    		}
    	}
    	 
     }
}