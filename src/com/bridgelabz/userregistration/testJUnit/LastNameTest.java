package com.bridgelabz.userregistration.testJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.userregistration.main.UserRegistration;

public class LastNameTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void testLastNameValid_success() {
		assertTrue(userRegistration.lastName("Bhasme"));
	}

	@Test()
	public void testLastNameValid_fail() {
		assertFalse(userRegistration.lastName("bhasme"));
	}
	
	@Test
	public void testFirstNameInvalid_Whitespace_Fail() {
		assertFalse(userRegistration.lastName("Bhas me"));
	}

	@Test
	public void testFirstNameInvalid_SpecialChar_Fail() {
		assertFalse(userRegistration.lastName("Nhasm@e"));
	}

	@Test
	public void testFirstNameInvalid_Digit_Fail() {
		assertFalse(userRegistration.lastName("Bhasme30"));
	}

	@Test
	public void testFirstNameInvalid_Minimum2Chars_Fail() {
		assertFalse(userRegistration.lastName("Bh"));
	}

}
