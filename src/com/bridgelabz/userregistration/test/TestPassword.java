package com.bridgelabz.userregistration.test;

import java.util.Scanner;

import com.bridgelabz.userregistration.main.UserRegistration;

public class TestPassword {
	static final Scanner SC = new Scanner(System.in);

	public static void checkValidTest(UserRegistration userRegistration, String userPassword) {
		if (userRegistration.password(userPassword)) {
			System.out.println("Valid Password: " + userPassword);
		} else {
			System.out.println("Invalid Password: " + userPassword);
		}
	}

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		int key = 0;
		while (key != 2) {
			System.out.println("Select From Option\n1) Enter Password\n2) Exit");
			key = SC.nextInt();
			switch (key) {
			case 1:
				System.out.println("Enter Password");
				String userPassword = SC.next();
				checkValidTest(userRegistration, userPassword);
				break;
			default:
				break;
			}
		}
	}
}
