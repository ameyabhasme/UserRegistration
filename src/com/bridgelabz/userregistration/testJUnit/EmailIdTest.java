package com.bridgelabz.userregistration.testJUnit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.bridgelabz.userregistration.exceptions.InvalidInputException;
import com.bridgelabz.userregistration.main.UserRegistration;

@RunWith(Parameterized.class)
public class EmailIdTest {
	
	enum Status { VALID, INVALID};
	private Status status;
	private String userEmail;
	private boolean expectedResult;
	UserRegistration userRegistration= new UserRegistration();

	
	public EmailIdTest(Status status, String userEmail, boolean expectedResult) {
		this.status = status;
		this.userEmail = userEmail;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection data() {
		
		return Arrays.asList(new Object[][] {
			{Status.VALID,"abc@yahoo.com",true},
			{Status.VALID,"abc-100@yahoo.com",true},
			{Status.VALID,"abc.100@yahoo.com",true},
			{Status.VALID,"abc111@abc.com",true},
			{Status.VALID,"abc-100@abc.net",true},
			{Status.VALID,"abc.100@abc.com.au",true},
			{Status.VALID,"abc@1.com",true},
			{Status.VALID,"abc@gmail.com.com",true},
			{Status.VALID,"abc+100@gmail.com",true},
			
			{Status.INVALID,"abc",false},
			{Status.INVALID,"abc@.com.my",false},
			{Status.INVALID,"abc123@gmail.a",false},
			{Status.INVALID,"abc123@.com",false},
			{Status.INVALID,"abc123@.com.com",false},
			{Status.INVALID,".abc@abc.com",false},
			{Status.INVALID,"abc()*@gmail.com",false},
			{Status.INVALID,"abc@%*.com",false},
			{Status.INVALID,"abc..2002@gmail.com",false},
			{Status.INVALID,"abc.@gmail.com",false},
			{Status.INVALID,"abc@abc@gmail.com",false},
			{Status.INVALID,"abc@gmail.com.1a",false},
			{Status.INVALID,"abc@gmail.com.aa.au",false}
			});
	}
	
	@Test
	public void testEmailValid_Success() throws InvalidInputException {
		Assume.assumeTrue(status == Status.VALID);
		boolean actual = userRegistration.emailID(userEmail);
		assertEquals(expectedResult, actual);
	}

	@Test(expected = InvalidInputException.class)
	public void testEmailValid_Fail() throws InvalidInputException {
		Assume.assumeTrue(status == Status.INVALID);
		boolean actual = userRegistration.emailID(userEmail);
		assertEquals(expectedResult, actual);
	}
}
