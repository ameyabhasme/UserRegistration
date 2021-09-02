package com.bridgelabz.userregistration.testJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.userregistration.exceptions.InvalidInputException;
import com.bridgelabz.userregistration.main.UserRegistration;

public class FirstNameTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void testFirstNameValid_success() throws InvalidInputException {
		assertTrue(userRegistration.firstName("Ameya"));
	}

	@Test(expected = InvalidInputException.class)
	public void testFirstNameValid_fail() throws InvalidInputException{
		assertFalse(userRegistration.firstName("ameya"));
	}

	@Test(expected = InvalidInputException.class)
	public void testFirstNameInvalid_Whitespace_Fail() throws InvalidInputException {
		assertFalse(userRegistration.firstName("Amey a"));
	}

	@Test(expected = InvalidInputException.class)
	public void testFirstNameInvalid_SpecialChar_Fail() throws InvalidInputException {
		assertFalse(userRegistration.firstName("Amey@a"));
	}

	@Test(expected = InvalidInputException.class)
	public void testFirstNameInvalid_Digit_Fail() throws InvalidInputException {
		assertFalse(userRegistration.firstName("Ameya30"));
	}

	@Test(expected = InvalidInputException.class)
	public void testFirstNameInvalid_Minimum2Chars_Fail() throws InvalidInputException {
		assertFalse(userRegistration.firstName("om"));
	}
}

