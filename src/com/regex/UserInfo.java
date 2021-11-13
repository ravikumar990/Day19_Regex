package com.regex;

import java.util.Scanner;

public class UserInfo {
	Scanner sc = new Scanner(System.in);
	ValidateUserInfo validateInfo = new ValidateUserInfo();

	public String userFirstName() throws UserRegistrationException {
		// taking user input
		System.out.println("Enter Your First Name : ");
		String firstName = sc.next();

		// call firstName method in Validate class
		return validateInfo.firstName(firstName);
	}

	public String userLastName() throws UserRegistrationException {
		// taking user input
		System.out.println("Enter Your Last Name : ");
		String lastName = sc.next();

		// call firstName method in Validate class
		return validateInfo.lastName(lastName);
	}

	public String userEmailId() throws UserRegistrationException {
		// taking user input
		System.out.println("Enter Your Email : ");
		String emailID = sc.next();

		// call firstName method in Validate class
		return validateInfo.emailId(emailID);
	}

	public String userMobNum() throws UserRegistrationException {
		// taking user input
		System.out.println("Enter Your Mobile Number : ");
		String mobileNum = sc.next();

		// call firstName method in Validate class
		return validateInfo.mobNum(mobileNum);
	}

	public String userPassword() throws UserRegistrationException {
		// taking user input
		System.out.println("Enter Your Password : ");
		String passWord = sc.next();

		// call firstName method in Validate class
		return validateInfo.password(passWord);
	}
}