package com.bridgelabz.userregistration.test;

import java.util.Scanner;

import com.bridgelabz.userregistration.main.UserRegistration;

public class TestFirstName {
	static final Scanner SC = new Scanner(System.in);

	public static void checkValidTest(UserRegistration userRegistration, String userName) {
		if (userRegistration.firstName(userName)) {
			System.out.println("Valid Name: " + userName);
		} else {
			System.out.println("Invalid Name: " + userName);
		}
	}

	public static void main(String[] args) {
		UserRegistration userRegistration = new UserRegistration();
		int key = 0;
		while (key != 2) {
				System.out.println("Select From Option\n1) Enter First Name\n2) Exit");
				key = SC.nextInt();
				switch (key) {
				case 1:
					System.out.println("Enter First Name");
					String userName = SC.next();
					checkValidTest(userRegistration, userName);
					break;
				default:
					break;
			} 
		}
	}
}
