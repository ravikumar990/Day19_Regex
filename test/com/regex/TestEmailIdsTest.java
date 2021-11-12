package com.regex;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestEmailIdsTest {
	private String emailIds;
	private boolean expectedResult;

	public TestEmailIdsTest(String emailIds, boolean expectedResult) {
		this.emailIds = emailIds;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection mailIdsExpectedResult() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", "Happy" }, { "abc-100@yahoo.com", "Happy" },
				{ "abc.100@yahoo.com", "Happy" }, { "abc111@abc.com", "Happy" }, { "abc-100@abc.net", "Happy" },
				{ "abc.100@abc.com.au", "Happy" }, { "abc@1.com", "Happy" }, { "abc@gmail.com.com", "Happy" },
				{ "abc+100@gmail.com", "Happy" }, { "abc", "Sad" }, { "abc@.com.my", "Sad" },
				{ "abc123@gmail.a", "Sad" }, { "abc123@.com", "Sad" }, { "abc123@.com.com", "Sad" },
				{ ".abc@abc.com", "Sad" }, { "abc()*@gmail.com", "Sad" }, { "abc@%*.com", "Sad" },
				{ "abc..2002@gmail.com", "Sad" }, { "abc.@gmail.com", "Sad" }, { "abc@abc@gmail.com", "Sad" },
				{ "abc@gmail.com.1a", "Sad" }, { "abc@gmail.com.aa.au", "Sad" }, });
	}

	@Test
	public void TestEmailIds() {
		ValidateUserInfo testEmail = new ValidateUserInfo();
		String result = testEmail.emailId(this.emailIds);
		Assert.assertEquals(this.expectedResult, result);
	}
}