package com.bridgelabz.userregistration.test;

import java.util.Arrays;
import java.util.List;

import com.bridgelabz.userregistration.exceptions.InvalidInputException;
import com.bridgelabz.userregistration.main.UserRegistration;

public class TestEmailId {

	public static void checkValidTest(UserRegistration userRegistration, String userEmail) throws InvalidInputException {
		if (userRegistration.emailID(userEmail)) {
			System.out.println("Valid Email Id: " + userEmail);
		} else {
			System.out.println("Invalid Email Id: " + userEmail);
		}
	}

	public static void main(String[] args) throws InvalidInputException {
		UserRegistration userRegistration = new UserRegistration();
		List<String> emailSamples = Arrays.asList(
		"abc@yahoo.com",
		"abc-100@yahoo.com",
		"abc-100@yahoo.com",
		"abc111@abc.com",
		"abc-100@abc.net",
		"abc.100@abc.com.au",
		"abc@1.com",
		"abc@gmail.com.com",
		"abc+100@gmail.com",

		"abc",
		"abc@.com.my",
		"abc123@gmail.a",
		"abc123@.com",
		"abc123@.com.com",
		".abc@abc.com",
		"abc()*@gmail.com",
		"abc@%*.com",
		"abc..2002@gmail.com",
		"abc.@gmail.com",
		"abc@abc@gmail.com",
		"abc@gmail.com.1a",
		"abc@gmail.com.aa.au");

		for (String userEmail : emailSamples) {
			checkValidTest(userRegistration, userEmail);
		}
	}
}
