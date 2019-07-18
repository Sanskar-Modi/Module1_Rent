// service interface
package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exceptions.DetailsNotFoundException;
import com.cg.frs.exceptions.OwnerDoesNotExistsException;

public interface IFlatRegistrationService {
	
	// methods to register user
	FlatRegistrationDTO registerFlat (FlatRegistrationDTO flat);
	// methods to return owner ids
	ArrayList<Integer> getAllOwnerIds() throws OwnerDoesNotExistsException;
	 //method to get the user details
	FlatRegistrationDTO getDetails(int id) throws DetailsNotFoundException;


}
