package com.bridgelabz.userregistration.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.userregistration.utils.Constants;

public class UserRegistration {
	
	public boolean firstName(String userFirstName) {
		return isValidPattern(userFirstName, Constants.FIRST_NAME_REGEX);
	}
	
	public boolean lastName(String userLastName) {
		return isValidPattern(userLastName, Constants.LAST_NAME_REGEX);
	}
	
	public boolean emailID(String userEmail) {
		return isValidPattern(userEmail, Constants.EMAIL_ID_REGEX);
	}
	
	public boolean mobileNumber(String userMobNumber) {
		return isValidPattern(userMobNumber, Constants.MOBILE_NUMBER_REGEX);
	}
	
	public boolean password(String userPassword) {
		return isValidPattern(userPassword, Constants.PASSWORD_REGEX);
	}

	public boolean isValidPattern(String input, String regexPattern) {
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}
}
