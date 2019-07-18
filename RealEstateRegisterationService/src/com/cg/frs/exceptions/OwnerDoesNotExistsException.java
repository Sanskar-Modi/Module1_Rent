// exception class for if the owner doesn't exist
package com.cg.frs.exceptions;

public class OwnerDoesNotExistsException extends Exception{
	
	public OwnerDoesNotExistsException()
	{
		
	}

	@Override
	public String toString() {
		
		return " Sorry Owner Doesnot Exists";
	}
	
	

}
