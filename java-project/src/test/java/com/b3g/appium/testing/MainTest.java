package com.b3g.appium.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {
	@Test
    public void exampleOfTestNgMaven() {
        System.out.println("This is TestNG-Maven Example");
        int testInt = 4*4;
        Assert.assertEquals(testInt, 16);
    }
	
	@Test
    public void exampleOfTestNgMaven2() {
        System.out.println("This is TestNG-Maven Example");
        int testInt = 4*4;
        Assert.assertEquals(testInt, 4);
    }
}
