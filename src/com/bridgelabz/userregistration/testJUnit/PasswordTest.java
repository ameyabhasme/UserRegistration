package com.bridgelabz.userregistration.testJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.userregistration.exceptions.InvalidInputException;
import com.bridgelabz.userregistration.main.UserRegistration;

public class PasswordTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void testPasswordValid_Success() throws InvalidInputException {
		assertTrue(userRegistration.password("Ameya@123"));
	}

	@Test(expected = InvalidInputException.class)
	public void testPasswordInvalid_Fail() throws InvalidInputException {
		assertFalse(userRegistration.password("ameya"));
	}

	@Test(expected = InvalidInputException.class)
	public void testPasswordInvalid_Minimum8Char_Fail() throws InvalidInputException {
		assertFalse(userRegistration.password("Amey@1"));
	}

	@Test(expected = InvalidInputException.class)
	public void testPasswordInvalid_OneCapLetter_Fail() throws InvalidInputException {
		assertFalse(userRegistration.password("ameya@1256"));
	}

	@Test(expected = InvalidInputException.class)
	public void testPasswordInvalid_OneDigit_Fail() throws InvalidInputException {
		assertFalse(userRegistration.password("Ameyabhasme@@"));
	}

	@Test(expected = InvalidInputException.class)
	public void testPasswordInvalid_OneSmallLetter_Fail() throws InvalidInputException {
		assertFalse(userRegistration.password("AMEYA@12556"));
	}

	@Test(expected = InvalidInputException.class)
	public void testPasswordInvalid_OneSpecialChar_Fail() throws InvalidInputException {
		assertFalse(userRegistration.password("Ameya1231564"));
	}

	@Test(expected = InvalidInputException.class)
	public void testPasswordInvalid_WhiteSpace_Fail() throws InvalidInputException {
		assertFalse(userRegistration.password("Ameya12356 Amdk"));
	}

}
