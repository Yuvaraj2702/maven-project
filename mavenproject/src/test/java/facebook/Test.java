package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Baseclass;
import com.pom.Loginpage;
import com.pom.SDP;
import com.pom.signup;
import com.propertyfile.Helper;

public class Test extends Baseclass{
	
	
public static void main(String[] args) throws Exception {
	
	
	
	String browser = Helper.getinstance().getinstanceCR().getbrowser();
     browserlaunch(browser);
	
	String url = Helper.getinstance().getinstanceCR().geturl();
	
	url(url);
	
	SDP s = new SDP(driver);
	
	inputvalue(s.getlogoin().getUsername(), "yuvaraj");
	
	inputvalue(s.getlogoin().getPassword(), "haaland@123");
	
	clickonElement(s.getlogoin().getCreateaccount());
	
	implicitwait();
	
	
   inputvalue(s.getsignup().getFirstname(), "yuvaraj");
   inputvalue(s.getsignup().getLastname(), "dhandapani");
   inputvalue(s.getsignup().getPhno(), "9632587412");
   inputvalue(s.getsignup().getPass(), "yuvi@2726");
   
   index(s.getsignup().getDay(), 26);
   value(s.getsignup().getMonth(), "2");
   visibletext(s.getsignup().getYear(), "1993");
   
   clickonElement(s.getsignup().getGender());
   
   
   clickonElement(s.getsignup().getSubmit());
     
    gettitle();
	
    implicitwait();
    
	screenshot();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
