// dao class
package com.cg.frs.dao;

import java.util.ArrayList;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exceptions.DetailsNotFoundException;

public interface IFlatRegistrationDAO {
	
	// method to register the user and store the data into map
	FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat);
	// method to return owner ids
	ArrayList<Integer> getAllOwnersIds();
	// methods to return user details stored in map
	FlatRegistrationDTO getDetails(int id) throws DetailsNotFoundException;

}
