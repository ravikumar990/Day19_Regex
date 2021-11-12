package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserInfo {
	public String firstName(String firstName) {
		// regex pattern
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		return checkPattern(regex, firstName);
	}

	public String lastName(String lastName) {
		// regex pattern
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		return checkPattern(regex, lastName);
	}

	public String emailId(String emailId) {
		// regex pattern
		String regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
		return checkPattern(regex, emailId);
	}

	public String mobNum(String mobNum) {
		// regex pattern
		String regex = "^[0-9]{1,3}-[0-9]{10}$";
		return checkPattern(regex, mobNum);
	}

	public String password(String pswrd) {
		// regex pattern
		String regex = "^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$";
		return checkPattern(regex, pswrd);
	}

	// check regex pattern and input
	public String checkPattern(String regexPattern, String userInput) {
		Pattern pattern = Pattern.compile(regexPattern);

		Matcher matcher = pattern.matcher(userInput);

		// checking input is valid or not
		if (matcher.matches()) {
			return "Happy";
		} else {
			return "Sad";
		}
	}
}