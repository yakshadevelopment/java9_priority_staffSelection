package edu.yaksha.staffSelection;

public class ApplicantService {
	public  int totalCalculation (Applicant app)
	{
		int total=0;
		if(app.getSubject1()>=50 && app.getSubject2()>=50 && app.getSubject3()>=50)
			total=app.getSubject1()+ app.getSubject2()+ app.getSubject3();
			 return total;
	}
	 public  int percentageCalculation (int total)
	 {
		 double x=((double)total/300)*100;
		 int val=(int)x;
		 return val;
	 }

}
