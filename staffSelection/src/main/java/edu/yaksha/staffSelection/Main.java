package edu.yaksha.staffSelection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Main 
{
	
	public static int totalCalculation (Applicant app)
	{
		int total=0;
		if(app.getSubject1()>=50 && app.getSubject2()>=50 && app.getSubject3()>=50)
			total=app.getSubject1()+ app.getSubject2()+ app.getSubject3();
			 return total;
	}
	 public static int percentageCalculation (int total)
	 {
		 double x=((double)total/300)*100;
		 int val=(int)x;
		 return val;
	 }
    public static void main( String[] args )
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of applicants:");
        int no=Integer.parseInt(scanner.nextLine());
        ArrayList<Applicant> applicantList=new ArrayList<Applicant>();
         for(int i=0;i<no;i++)
         {
        	 System.out.println("Enter applicant details:");
        	 String appDetails=scanner.nextLine();
        	 String appArr[]=appDetails.split(",");
        	 Applicant applicant=new Applicant(appArr[0],Integer.parseInt(appArr[1]) ,Integer.parseInt(appArr[2]),Integer.parseInt(appArr[3]));
        	 int total=totalCalculation(applicant);
        	 int percentage=percentageCalculation(total);
        	 if(total>0 && percentage>=70)
        	 {
        		 applicant.setTotal(total);
        		 applicant.setPercentage(percentage);
        		 applicantList.add(applicant);
        	 }
         }
         
         Collections.sort(applicantList);
         
         for(Applicant app:applicantList)
        	 System.out.println(app);
         
       
        	
    }
}
