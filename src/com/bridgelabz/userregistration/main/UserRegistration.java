package com.bridgelabz.userregistration.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.userregistration.utils.Constants;

public class UserRegistration {
	
	public boolean firstName(String userFirstName) {
		return IsValidPattern(userFirstName, Constants.FIRST_NAME_REGEX);
	}

	public boolean IsValidPattern(String input, String regexPattern) {
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}
}
