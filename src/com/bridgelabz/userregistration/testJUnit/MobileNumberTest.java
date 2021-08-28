package com.bridgelabz.userregistration.testJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.userregistration.main.UserRegistration;

public class MobileNumberTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void testNumberValid_success() {
		assertTrue(userRegistration.mobileNumber("91 9975401899"));
	}

	@Test
	public void testNumberInvalid_Fail() {
		assertFalse(userRegistration.mobileNumber("91 5784925468"));
	}

	@Test
	public void testNumber_LessDigits_Fail() {
		assertFalse(userRegistration.mobileNumber("985987"));
	}

	@Test
	public void testNumber_MoreDigits_Fail() {
		assertFalse(userRegistration.mobileNumber("9819026442334"));
	}

	@Test
	public void testNumberEmpty_Fail() {
		assertFalse(userRegistration.mobileNumber(" "));
	}

	@Test
	public void testNumberInvalid_SPecialChar_Fail() {
		assertFalse(userRegistration.mobileNumber("91 99754%1899"));
	}

	@Test
	public void testNumberInvalid_SmallLetter_Fail() {
		assertFalse(userRegistration.mobileNumber("91 99754z1899"));
	}

	@Test
	public void testNumberInvalid_CapLetter_Fail() {
		assertFalse(userRegistration.mobileNumber("91 99754D1899"));
	}
}
