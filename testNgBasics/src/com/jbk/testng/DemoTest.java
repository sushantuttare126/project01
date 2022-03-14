package com.jbk.testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenersEx.class)
public class DemoTest {
	@Test   //for test pass
	public void ts01() {
		System.out.println("testcase 01");
		Assert.assertEquals(1,1);
	}
	@Test   //for test fail
	public void ts02() {
		System.out.println("testcase 02");
		Assert.assertEquals(1,2);
	}
	@Test   //for test case skip
	public void ts03() {
		System.out.println("testcase 03");
		throw new SkipException("skipping a tsetcase");
	}

}
