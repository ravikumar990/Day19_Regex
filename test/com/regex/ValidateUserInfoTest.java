package com.regex;

import org.junit.Assert;
import org.junit.Test;

public class ValidateUserInfoTest {

	ValidateUserInfo validateInfo = new ValidateUserInfo();

	@Test
	public void firstNameValid() {
		String expectedVal = "Happy";
		String actualResult = validateInfo.firstName("Ravi");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void firstNameInValid() {
		String expectedVal = "Sad";
		String actualResult = validateInfo.firstName("ravi");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void lastNameValid() {
		String expectedVal = "Happy";
		String actualResult = validateInfo.lastName("Kumar");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void lastNameInValid() {
		String expectedVal = "Sad";
		String actualResult = validateInfo.lastName("kumar");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void emailIdValid() {
		String expectedVal = "Happy";
		String actualResult = validateInfo.emailId("ravi.kumar@sample.com");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void emailIdInValid() {
		String expectedVal = "Sad";
		String actualResult = validateInfo.emailId("ravi.kumar.co.in");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void mobNumValid() {
		String expectedVal = "Happy";
		String actualResult = validateInfo.mobNum("54-5465322154");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void mobNumInValid() {
		String expectedVal = "Sad";
		String actualResult = validateInfo.mobNum("54-55465322154");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void passwordValid() {
		String expectedVal = "Happy";
		String actualResult = validateInfo.password("ab98cDE@&fg");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void passwordInValid() {
		String expectedVal = "Sad";
		String actualResult = validateInfo.password("ab98cDEfg");
		Assert.assertEquals(expectedVal, actualResult);
	}
}