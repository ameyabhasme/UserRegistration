package com.bridgelabz.userregistration.testJUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.bridgelabz.userregistration.main.UserRegistration;

public class PasswordTest {

	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void testPasswordValid_Success() {
		assertTrue(userRegistration.password("Ameya@123"));
	}

	@Test
	public void testPasswordInvalid_Fail() {
		assertFalse(userRegistration.password("ameya"));
	}

	@Test
	public void testPasswordInvalid_Minimum8Char_Fail() {
		assertFalse(userRegistration.password("Amey@1"));
	}

	@Test
	public void testPasswordInvalid_OneCapLetter_Fail() {
		assertFalse(userRegistration.password("ameya@1256"));
	}

	@Test
	public void testPasswordInvalid_OneDigit_Fail() {
		assertFalse(userRegistration.password("Ameyabhasme@@"));
	}

	@Test
	public void testPasswordInvalid_OneSmallLetter_Fail() {
		assertFalse(userRegistration.password("AMEYA@12556"));
	}

	@Test
	public void testPasswordInvalid_OneSpecialChar_Fail() {
		assertFalse(userRegistration.password("Ameya1231564"));
	}

	@Test
	public void testPasswordInvalid_WhiteSpace_Fail() {
		assertFalse(userRegistration.password("Ameya12356 Amdk"));
	}

}
