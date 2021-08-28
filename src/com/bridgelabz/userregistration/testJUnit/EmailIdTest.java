package com.bridgelabz.userregistration.testJUnit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.bridgelabz.userregistration.main.UserRegistration;

@RunWith(Parameterized.class)
public class EmailIdTest {
	
	private String userEmail;
	private boolean expectedResult;
	UserRegistration userRegistration= new UserRegistration();

	
	public EmailIdTest(String userEmail, boolean expectedResult) {
		this.userEmail = userEmail;
		this.expectedResult = expectedResult;
	}

	@Parameters
	public static Collection data() {
		
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com",true},
			{"abc-100@yahoo.com",true},
			{"abc.100@yahoo.com",true},
			{"abc111@abc.com",true},
			{"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true},
			{"abc@1.com",true},
			{"abc@gmail.com.com",true},
			{"abc+100@gmail.com",true},
			
			{"abc",false},
			{"abc@.com.my",false},
			{"abc123@gmail.a",false},
			{"abc123@.com",false},
			{"abc123@.com.com",false},
			{".abc@abc.com",false},
			{"abc()*@gmail.com",false},
			{"abc@%*.com",false},
			{"abc..2002@gmail.com",false},
			{"abc.@gmail.com",false},
			{"abc@abc@gmail.com",false},
			{"abc@gmail.com.1a",false},
			{"abc@gmail.com.aa.au",false}
			});
	}
	
	@Test
	public void testEmailValid_success() {
		boolean actual = userRegistration.emailID(userEmail);
		assertEquals(expectedResult, actual);
	}

}
