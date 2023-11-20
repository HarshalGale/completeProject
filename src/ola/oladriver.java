package ola;

import java.util.Scanner;

public class oladriver
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		olaApp op=new olaApp();
		for(;;)
		{
			System.out.println("1.login 2.logout 3.make a ride 4. cancel ride 5.make a bill 6.exit");
		     switch(sc.nextInt())
		     {
		     case 1:
		    	 op.login();
		    	 break;
		     case 2:
		    	 op.logout();
		    	 break;
		     case 3:
		    	 op.MakeaRide();
		    	 break;
		     case 4:
		    	 op.cancelRide();
		    	 break;
		     case 5:
		    	 op.makeABill();
		     case 6:
		    	 System.exit(2);
		     }
		}
	}

}

