package com.example.email_validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        //App jMyApp = new App();
    	//String jMyEmail = "MYNAME@DOMAIN.COM";
    	
        //jMyApp.jEmailValidator(jMyEmail);
    }
    
    //Email validator method
    public void jEmailValidator(String jEmail){
    	//Regex string [A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4} for a valid email address
    	//Rule 1: The string has a single '@' character
    	//Rule 2: The string has at least one '.' character 
    	//Rule 3: The string can have digit characters
    	//Rule $; The first part of the string (before the '@'character)can have 
    	//special characters like underscores, percentage, plus and minus
    	Pattern jPattern = Pattern.compile("[A-Z0-9._%+-]+@[A-Z0-9.]+\\.[A-Z]{2,4}");
    	
    	//Matching string to the pattern for a valid email address
    	Matcher jMatcher = jPattern.matcher(jEmail.toUpperCase());
    	
    	if(jMatcher.matches()){
    		System.out.println("Valid Email Address...!!!");    		
    	} else {
    		System.out.println("Not a Valid Email");
    	}
    }
}
