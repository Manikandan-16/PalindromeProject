package com.testproj.TestPrj2;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class DistanceTest{
	
	private static DistInterface d1;

@BeforeClass
public static void initDistance() {
	 d1=new Palindrome();
	
}

@Test
public void testDist() {
	int result=d1.countPal("abbab");
	assertEquals(3, result);

}

@Test
public void testDist2() {
	int result=d1.countPal("aba");
	assertEquals(1, result);

}

}
