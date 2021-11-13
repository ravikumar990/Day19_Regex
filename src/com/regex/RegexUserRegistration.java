package com.regex;

public class RegexUserRegistration {
	public static void main(String args[]) throws UserRegistrationException{
		//created user info object
		UserInfo userInfo = new UserInfo();

		//calling method in UserInfo class  to validate first name
		System.out.println(userInfo.userFirstName());
		System.out.println("==================");

		//calling method in UserInfo class to validate last name
		System.out.println(userInfo.userLastName());
		System.out.println("==================");

		//calling method in UserInfo class to validate email
		System.out.println(userInfo.userEmailId());
		System.out.println("==================");

		//calling method in UserInfo class to validate mobile number
		System.out.println(userInfo.userMobNum());
		System.out.println("==================");

		//calling method in UserInfo class to validate password
		System.out.println(userInfo.userPassword());
		System.out.println("==================");
	}
}