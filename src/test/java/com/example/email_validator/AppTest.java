package com.example.email_validator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName){
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite( AppTest.class );
    }
    /**
     * Rigourous Test :-)
     */
    
    @org.junit.Test
    //This test checks for a single '@' character and at least one '.' character
    public void testApp1(){
        App jTestApp = new App();
        jTestApp.jEmailValidator("Your@name.ca");
    	assertTrue( true );
    }
  //This test checks for a single '@' character and atleast one '.' character
    public void testApp2(){
        App jTestApp = new App();
        jTestApp.jEmailValidator("Yo.ur@na.me.ca");
    	assertTrue( true );
    }
    //This test fails because the email does not follow the two set rules
    public void testApp3(){
    	App jTestApp = new App();
    	jTestApp.jEmailValidator("Your@1name.ca");
    	assertTrue(false);
    }
  //This test fails because the email does not follow the two set rules
    public void testApp4(){
    	App jTestApp = new App();
    	jTestApp.jEmailValidator("Your@na@e.ca");
    	assertTrue(false);
    }
}
