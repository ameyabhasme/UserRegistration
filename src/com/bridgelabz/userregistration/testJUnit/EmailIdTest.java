package com.bridgelabz.userregistration.testJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.userregistration.main.UserRegistration;

public class EmailIdTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void testEmailValid_Success() {
		assertTrue(userRegistration.emailID("ameyabhasme5@gmail.com"));
	}

	@Test
	public void testEmailInvalid_Fail() {
		assertFalse(userRegistration.emailID("ameya@ai5"));
	}

}
