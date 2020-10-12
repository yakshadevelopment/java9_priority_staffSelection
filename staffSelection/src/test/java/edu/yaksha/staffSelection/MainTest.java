package edu.yaksha.staffSelection;

import static org.junit.Assert.*;

import org.junit.Test;
import static edu.yaksha.staffSelection.TestUtils.*;

public class MainTest {

	@Test
	public void testTotalCalculation() throws Exception {
		Applicant app1=new Applicant("John",90, 25, 75);
		Applicant app2=new Applicant("Rio",55, 80, 75);
		int val1=Main.totalCalculation(app1);
		int val2=Main.totalCalculation(app2);
		yakshaAssert(currentTest(),(val1==0?"true":"false"),businessTestFile);
		yakshaAssert(currentTest(),(val2==210?"true":"false"),businessTestFile);
		
	}

	@Test
	public void testPercentageCalculation() throws Exception {
		Applicant app1=new Applicant("John",90, 25, 75);
		Applicant app2=new Applicant("Rio",55, 80, 75);
		int tot1=Main.totalCalculation(app1);
		int tot2=Main.totalCalculation(app2);
		int val1=Main.percentageCalculation(tot1);
		int val2=Main.percentageCalculation(tot2);
		System.out.println(""+val1+val2);
		yakshaAssert(currentTest(),(val1==0?"true":"false"),businessTestFile);
		yakshaAssert(currentTest(),(val2==70?"true":"false"),businessTestFile);
	}
	
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }



}
