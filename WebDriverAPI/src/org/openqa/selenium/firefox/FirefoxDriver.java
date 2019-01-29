package org.openqa.selenium.firefox;

import org.openqa.selenium.WebDriver;

public class FirefoxDriver implements WebDriver {
	
	public FirefoxDriver()
	{
		System.out.println("Launch Firefox");
	}
	
	public void get(String url)
	{
		System.out.println("Navigating to the URL in Firefox");
	}

	public void getTitle()
	{
		System.out.println("Getting the title in Firefox");
	}
	
	public void click()
	{
		System.out.println("Clicking on an Element in Firefox");
	}
	
	public void sendKeys()
	{
		System.out.println("Typing in an Element in Firefox");
	}
	
	public void captureScreenshot()
	{
		System.out.println("Capturing screenshot in Firefox");
	}
	
}
