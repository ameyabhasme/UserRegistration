package com.bridgelabz.userregistration.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.userregistration.exceptions.InvalidInputException;
import com.bridgelabz.userregistration.utils.Constants;

interface CheckValid {
	public boolean isValidPattern(String input, String regexPattern);
}

public class UserRegistration {

	CheckValid checkvalidity = (String input, String regexPattern) -> {
		Pattern pattern = Pattern.compile(regexPattern);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	};
	
	public boolean firstName(String userFirstName) throws InvalidInputException {
		
		if (checkvalidity.isValidPattern(userFirstName, Constants.FIRST_NAME_REGEX))
			return true;
		else
			throw new InvalidInputException(Constants.INVALID_FIRST_NAME);
	}

	public boolean lastName(String userLastName) throws InvalidInputException {

		if (checkvalidity.isValidPattern(userLastName, Constants.LAST_NAME_REGEX))
			return true;
		else
			throw new InvalidInputException(Constants.INVALID_LAST_NAME);
	}

	public boolean emailID(String userEmail) throws InvalidInputException {

		if (checkvalidity.isValidPattern(userEmail, Constants.EMAIL_ID_REGEX))
			return true;
		else
			throw new InvalidInputException(Constants.INVALID_EMAIL_ID);
	}

	public boolean mobileNumber(String userMobNumber) throws InvalidInputException {

		if (checkvalidity.isValidPattern(userMobNumber, Constants.MOBILE_NUMBER_REGEX))
			return true;
		else
			throw new InvalidInputException(Constants.INVALID_MOBILE_NUMBER);
	}

	public boolean password(String userPassword) throws InvalidInputException {

		if (checkvalidity.isValidPattern(userPassword, Constants.PASSWORD_REGEX))
			return true;
		else
			throw new InvalidInputException(Constants.INVALID_PASSWORD);
	}
}
