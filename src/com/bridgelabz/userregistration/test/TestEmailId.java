package com.bridgelabz.userregistration.test;

import java.util.Scanner;

import com.bridgelabz.userregistration.main.UserRegistration;

public class TestEmailId {
	static final Scanner SC = new Scanner(System.in);

	public static void checkValidTest(UserRegistration userRegistration, String userEmail) {
		if (userRegistration.emailID(userEmail)) {
			System.out.println("Valid Email Id: " + userEmail);
		} else {
			System.out.println("Invalid Email Id: " + userEmail);
		}
	}

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		int key = 0;
		while (key != 2) {
				System.out.println("Select From Option\n1) Enter Email Id\n2) Exit");
				key = SC.nextInt();
				switch (key) {
				case 1:
					System.out.println("Enter Email Id");
					String userEmail = SC.next();
					checkValidTest(userRegistration, userEmail);
					break;
				default:
					break;
			} 
		}
	}
}
