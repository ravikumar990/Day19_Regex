package com.regex;

import org.junit.Assert;
import org.junit.Test;

public class ValidateUserInfoTest {

	ValidateUserInfo validateInfo = new ValidateUserInfo();

	@Test
	public void firstNameValid() {
		boolean expectedVal = true;
		boolean actualResult = validateInfo.firstName("Ravi");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void firstNameInValid() {
		boolean expectedVal = false;
		boolean actualResult = validateInfo.firstName("ravi");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void lastNameValid() {
		boolean expectedVal = true;
		boolean actualResult = validateInfo.lastName("Kumar");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void lastNameInValid() {
		boolean expectedVal = false;
		boolean actualResult = validateInfo.lastName("kumar");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void emailIdValid() {
		boolean expectedVal = true;
		boolean actualResult = validateInfo.emailId("ravi.kumar@sample.com");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void emailIdInValid() {
		boolean expectedVal = false;
		boolean actualResult = validateInfo.emailId("ravi.kumar.co.in");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void mobNumValid() {
		boolean expectedVal = true;
		boolean actualResult = validateInfo.mobNum("91-8187819238");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void mobNumInValid() {
		boolean expectedVal = false;
		boolean actualResult = validateInfo.mobNum("91-8087819238");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void passwordValid() {
		boolean expectedVal = true;
		boolean actualResult = validateInfo.password("ravi@143");
		Assert.assertEquals(expectedVal, actualResult);
	}

	@Test
	public void passwordInValid() {
		boolean expectedVal = false;
		boolean actualResult = validateInfo.password("ravi@123");
		Assert.assertEquals(expectedVal, actualResult);
	}
}
