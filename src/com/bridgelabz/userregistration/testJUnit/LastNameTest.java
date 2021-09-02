package com.bridgelabz.userregistration.testJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.userregistration.exceptions.InvalidInputException;
import com.bridgelabz.userregistration.main.UserRegistration;

public class LastNameTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void testLastNameValid_success() throws InvalidInputException {
		assertTrue(userRegistration.lastName("Bhasme"));
	}

	@Test(expected = InvalidInputException.class)
	public void testLastNameValid_fail() throws InvalidInputException {
		assertFalse(userRegistration.lastName("bhasme"));
	}
	
	@Test(expected = InvalidInputException.class)
	public void testFirstNameInvalid_Whitespace_Fail() throws InvalidInputException {
		assertFalse(userRegistration.lastName("Bhas me"));
	}

	@Test(expected = InvalidInputException.class)
	public void testFirstNameInvalid_SpecialChar_Fail() throws InvalidInputException {
		assertFalse(userRegistration.lastName("Nhasm@e"));
	}

	@Test(expected = InvalidInputException.class)
	public void testFirstNameInvalid_Digit_Fail() throws InvalidInputException {
		assertFalse(userRegistration.lastName("Bhasme30"));
	}

	@Test(expected = InvalidInputException.class)
	public void testFirstNameInvalid_Minimum2Chars_Fail() throws InvalidInputException {
		assertFalse(userRegistration.lastName("Bh"));
	}

}
