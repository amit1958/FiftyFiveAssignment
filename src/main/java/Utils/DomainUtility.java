package Utils;

import java.net.URI;
import java.net.URISyntaxException;

import TestRunner.TestExecuter;

public class DomainUtility extends TestExecuter{
	
	public static String GetDomainURL() throws URISyntaxException {
		  //Fetching the Domain Name of the site. Tostring() change object to name.		
		URI myurl= new URI(driver.getCurrentUrl());
      String DomainName = myurl.getHost();
      String ActualDomain= "https://"+DomainName;
      System.out.println("Domain name of the site = "+ActualDomain);
		return ActualDomain;	
	}

}
