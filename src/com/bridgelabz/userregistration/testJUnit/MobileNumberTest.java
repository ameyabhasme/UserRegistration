package com.bridgelabz.userregistration.testJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.userregistration.exceptions.InvalidInputException;
import com.bridgelabz.userregistration.main.UserRegistration;

public class MobileNumberTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void testNumberValid_success() throws InvalidInputException {
		assertTrue(userRegistration.mobileNumber("91 9975401899"));
	}

	@Test(expected = InvalidInputException.class)
	public void testNumberInvalid_Fail() throws InvalidInputException {
		assertFalse(userRegistration.mobileNumber("91 5784925468"));
	}

	@Test(expected = InvalidInputException.class)
	public void testNumber_LessDigits_Fail() throws InvalidInputException {
		assertFalse(userRegistration.mobileNumber("985987"));
	}

	@Test(expected = InvalidInputException.class)
	public void testNumber_MoreDigits_Fail() throws InvalidInputException {
		assertFalse(userRegistration.mobileNumber("9819026442334"));
	}

	@Test(expected = InvalidInputException.class)
	public void testNumberEmpty_Fail() throws InvalidInputException {
		assertFalse(userRegistration.mobileNumber(" "));
	}

	@Test(expected = InvalidInputException.class)
	public void testNumberInvalid_SPecialChar_Fail() throws InvalidInputException {
		assertFalse(userRegistration.mobileNumber("91 99754%1899"));
	}

	@Test(expected = InvalidInputException.class)
	public void testNumberInvalid_SmallLetter_Fail() throws InvalidInputException {
		assertFalse(userRegistration.mobileNumber("91 99754z1899"));
	}

	@Test(expected = InvalidInputException.class)
	public void testNumberInvalid_CapLetter_Fail() throws InvalidInputException {
		assertFalse(userRegistration.mobileNumber("91 99754D1899"));
	}
}
