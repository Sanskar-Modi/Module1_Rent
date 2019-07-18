// exception class if the details of the user is not found
package com.cg.frs.exceptions;

public class DetailsNotFoundException extends Exception{
	
	public DetailsNotFoundException() 
	
	{
		
	}

	@Override
	public String toString() {
		return "Sorry Details Not Found!!!";
	}

}
