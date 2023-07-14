package PW_Session;

import java.util.Iterator;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Element_ElementsConcepts {

	public static void main(String[] args) {
		
		Playwright playwrite = Playwright.create();
		Browser browser = 	playwrite.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	
		//launch
		
		BrowserContext bc = browser.newContext();
		Page p = bc.newPage();
		p.navigate("https://www.orangehrm.com/en/contact-sales/");
		
		/*
		 * //single element Locator contactsales = p.locator("text = Contact Sales");
		 * contactsales.hover(); contactsales.click();
		 * 
		 * 
		 * Locator btn = p.locator("#Form_submitForm_action_request"); int totalbtn =
		 * btn.count(); System.out.println(totalbtn); btn.first().click();
		 */
		
		
		//multiple elements
		Locator country_drpdn= p.locator("select#Form_getForm_Country");
		System.out.println(country_drpdn.count());
		
		for(int i=0; i<country_drpdn.count(); i++) 
		{
			String text = country_drpdn.nth(i).textContent();
			System.out.println(text);
			
		}
		
		
		
		
	}

}
