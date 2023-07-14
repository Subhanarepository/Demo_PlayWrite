package PW_Session;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserContectConcept {

	public static void main(String[] args) {

		Playwright playwrite = Playwright.create();
		Browser browser = playwrite.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

		BrowserContext bcx1 = browser.newContext();
		Page p1 = bcx1.newPage();
		p1.navigate("https://www.google.com/");
		p1.fill("#APjFqb", "youtube");
		System.out.println(p1.title());

		
		  BrowserContext bcx2 = browser.newContext(); Page p2 = bcx2.newPage();
		  p2.navigate("https://www.youtube.com/"); System.out.println(p2.title());
		  
		  BrowserContext bcx3 = browser.newContext(); Page p3 = bcx3.newPage();
		  p3.navigate("https://indianexpress.com/section/sports/");
		  System.out.println(p3.title());
		  
		  
		  
		  p1.close(); 
		  bcx1.close();
		  
		  p2.close(); 
		  bcx2.close();
		  
		  p3.close(); 
		  bcx3.close();
		 

	}

}
