package com.bridgelabz.userregistration.test;

import java.util.Scanner;

import com.bridgelabz.userregistration.exceptions.InvalidInputException;
import com.bridgelabz.userregistration.main.UserRegistration;

public class TestMobileNumber {
	static final Scanner SC = new Scanner(System.in);

	public static void checkValidTest(UserRegistration userRegistration, String userMobNumber) throws InvalidInputException {
		if (userRegistration.mobileNumber(userMobNumber)) {
			System.out.println("Valid Mobile Number: " + userMobNumber);
		} else {
			System.out.println("Invalid Mobile Number: " + userMobNumber);
		}
	}

	public static void main(String[] args) throws InvalidInputException {
		UserRegistration userRegistration = new UserRegistration();
		int key = 0;
		while (key != 2) {
			System.out.println("Select From Option\n1) Enter Mobile Number\n2) Exit");
			key = SC.nextInt();
			switch (key) {
			case 1:
				System.out.println("Enter Mobile Number");
				String userMobNumber = SC.next();
				checkValidTest(userRegistration, "91 " + userMobNumber);
				break;
			default:
				break;
			}
		}
	}
}
