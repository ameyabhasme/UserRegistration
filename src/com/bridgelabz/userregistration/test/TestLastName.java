package com.bridgelabz.userregistration.test;

import java.util.Scanner;

import com.bridgelabz.userregistration.exceptions.InvalidInputException;
import com.bridgelabz.userregistration.main.UserRegistration;

public class TestLastName {
	static final Scanner SC = new Scanner(System.in);

	public static void checkValidTest(UserRegistration userRegistration, String userName) throws InvalidInputException {
		if (userRegistration.lastName(userName)) {
			System.out.println("Valid Name: " + userName);
		} else {
			System.out.println("Invalid Name: " + userName);
		}
	}

	public static void main(String[] args) throws InvalidInputException {
		UserRegistration userRegistration = new UserRegistration();
		int key = 0;
		while (key != 2) {
				System.out.println("Select From Option\n1) Enter Last Name\n2) Exit");
				key = SC.nextInt();
				switch (key) {
				case 1:
					System.out.println("Enter Last Name");
					String userName = SC.next();
					checkValidTest(userRegistration, userName);
					break;
				default:
					break;
			} 
		}
	}
}
