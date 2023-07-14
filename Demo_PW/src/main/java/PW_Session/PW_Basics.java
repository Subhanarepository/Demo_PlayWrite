package PW_Session;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PW_Basics {

	public static void main(String args[])
	
	{
		
	Playwright playwrite = Playwright.create();
	
	/*
	 * LaunchOptions lp = new LaunchOptions(); lp.setChannel("chrome");
	 * lp.setHeadless(false); 
	 * Browser browser = playwrite.chromium().launch(lp);
	 */
	Browser browser = playwrite.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	
	Page page = browser.newPage();
	page.navigate("https://www.google.com/");
	
	String title = page.title();
	System.out.println("Page title is: "+ title);
	
	browser.close();
	
	playwrite.close();
	
	
	}
	
}
