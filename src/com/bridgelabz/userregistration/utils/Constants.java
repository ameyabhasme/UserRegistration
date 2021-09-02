package com.bridgelabz.userregistration.utils;

public class Constants {
	
	public static final String FIRST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
	public static final String LAST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
	public static final String EMAIL_ID_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9]+\\.){1,2}[a-zA-Z]{2,7}$";
	public static final String MOBILE_NUMBER_REGEX = "^[0-9]{2}[ ][6789]{1}+[0-9]{9}$";
	public static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
	
	public static final String INVALID_FIRST_NAME = "Invalid First Name";
	public static final String INVALID_LAST_NAME = "Invalid Last Name";
	public static final String INVALID_EMAIL_ID = "Invalid Email Id";
	public static final String INVALID_MOBILE_NUMBER = "Invalid Mobile Number";
	public static final String INVALID_PASSWORD = "Invalid Password";
}
