package Task4;

import java.io.*;

import java.util.*;
public class Interest {
	public static void findInterest()
	{
		Scanner sc = new Scanner(System.in);
		PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
		
		ps.println("Enter Amount");
		try {
		double princpalamt = sc.nextDouble();
		ps.println("Enter the time :");
		double time = sc.nextDouble();
		ps.println("Enter the rate of interest per annum :");
		double rateofinterest = sc.nextDouble();
		
		ps.println("Simple Interest :"+(princpalamt*time*rateofinterest)/100);
		ps.println("Compound Interest :"+((princpalamt*Math.pow(1+(rateofinterest/100),time))-princpalamt));
		}
		catch (Exception e) {
			ps.println("You Entered Invalid input");
		}
	}

}

