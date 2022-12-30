package com.propertyfile;

import java.io.IOException;

public class Helper {
	
	
	
	public Reader getinstanceCR() throws IOException {
		
		Reader r = new Reader();
        return r;
		
	}
	
	
	
	public static Helper getinstance() {
		
		Helper h = new Helper();
		
		return h;
	}
	
	
	
	public Helper() {
		
		
	}
	
	
	

}
