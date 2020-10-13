package edu.yaksha.staffSelection;

import static org.junit.Assert.*;

import org.junit.Test;
import static edu.yaksha.staffSelection.TestUtils.*;
import static org.mockito.Mockito.*;  
public class MainTest {

	@Test
	public void testTotalCalculation() throws Exception {
		ApplicantService appService=mock(ApplicantService.class);
		Applicant app1=new Applicant("John",90, 25, 75);
		Applicant app2=new Applicant("Rio",55, 80, 75);
		when(appService.totalCalculation(app1)).thenReturn(0);
		int val=appService.totalCalculation(app1);
		yakshaAssert(currentTest(),(val==0?"true":"false"),businessTestFile);
		when(appService.totalCalculation(app2)).thenReturn(210);
		 val=appService.totalCalculation(app2);
		yakshaAssert(currentTest(),(val==210?"true":"false"),businessTestFile);
		
	}

	@Test
	public void testPercentageCalculation() throws Exception {
		ApplicantService appService=mock(ApplicantService.class);
		Applicant app1=new Applicant("John",90, 25, 75);
		Applicant app2=new Applicant("Rio",55, 80, 75);
		int tot1=appService.totalCalculation(app1);
		int tot2=appService.totalCalculation(app2);
		when(appService.percentageCalculation(tot1)).thenReturn(0);
		int val=appService.percentageCalculation(tot1);
		yakshaAssert(currentTest(),(val==0?"true":"false"),businessTestFile);
		when(appService.percentageCalculation(tot2)).thenReturn(70);
		 val=appService.percentageCalculation(tot2);
		yakshaAssert(currentTest(),(val==70?"true":"false"),businessTestFile);
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
