package adactin;

import java.io.IOException;

import com.baseclass.Baseclass;
import com.pom.SDP;
import com.pom.adactin.SDPPOM;
import com.propertyfile.Helper;

public class Hotel_boooking extends Baseclass{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		
		String browser = Helper.getinstance().getinstanceCR().getbrowser();
		browserlaunch(browser);
        String url = Helper.getinstance().getinstanceCR().geturl();
		url(url);
		SDPPOM sp = new SDPPOM(driver);
		inputvalue(sp.getloginpage().getUsername(), "Yuvikane");
		inputvalue(sp.getloginpage().getPassword(), "9MYH30");
		clickonElement(sp.getloginpage().getLgn());
		implicitwait();
		index(sp.getsearchhotel().getLocation(), 4);
		index(sp.getsearchhotel().getHotels(), 3);
		value(sp.getsearchhotel().getRoomtype(), "Deluxe");
		value(sp.getsearchhotel().getNoofrooms(), "8");
		inputvalue(sp.getsearchhotel().getCheckindate(), "24/12/2022");
		inputvalue(sp.getsearchhotel().getCheckoutdate(), "26/12/2022");
		visibletext(sp.getsearchhotel().getAdults(), "4 - Four");
		visibletext(sp.getsearchhotel().getChild(), "1 - One");
		clickonElement(sp.getsearchhotel().getSearch());
		implicitwait();
		clickonElement(sp.getselecthotel().getSelect());
		clickonElement(sp.getselecthotel().getClick());
		implicitwait();
		inputvalue(sp.getbookahotel().getFirstname(), "messi");
		inputvalue(sp.getbookahotel().getLastname(), "alvarez");
		inputvalue(sp.getbookahotel().getAddress(), "No 25 IHFD nagar pallavaram");
		String cardnumber = Helper.getinstance().getinstanceCR().getcardnumber();
		inputvalue(sp.getbookahotel().getCreditnumber(), cardnumber);
		index(sp.getbookahotel().getCctype(), 2);
		value(sp.getbookahotel().getExpmonth(), "12");
		visibletext(sp.getbookahotel().getExpyear(), "2022");
		String cvv = Helper.getinstance().getinstanceCR().getcvv();
		inputvalue(sp.getbookahotel().getCvvno(), cvv);
		implicitwait();
		clickonElement(sp.getbookahotel().getBook());
		implicitwait();
		getattribute(sp.getbookingconfirmation().getOrderno());
		implicitwait();
		screenshot();
		clickonElement(sp.getbookingconfirmation().getLogout());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
