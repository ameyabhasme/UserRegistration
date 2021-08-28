package com.bridgelabz.userregistration.testJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.userregistration.main.UserRegistration;

public class FirstNameTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void testFirstNameValid_success() {
		assertTrue(userRegistration.firstName("Ameya"));
	}

	@Test
	public void testFirstNameValid_fail() {
		assertFalse(userRegistration.firstName("ameya"));
	}

	@Test
	public void testFirstNameInvalid_Whitespace_Fail() {
		assertFalse(userRegistration.firstName("Amey a"));
	}

	@Test
	public void testFirstNameInvalid_SpecialChar_Fail() {
		assertFalse(userRegistration.firstName("Amey@a"));
	}

	@Test
	public void testFirstNameInvalid_Digit_Fail() {
		assertFalse(userRegistration.firstName("Ameya30"));
	}

	@Test
	public void testFirstNameInvalid_Minimum2Chars_Fail() {
		assertFalse(userRegistration.firstName("om"));
	}
}
