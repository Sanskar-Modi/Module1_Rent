package com.cg.frs.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cg.frs.dto.FlatOwner;
import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exceptions.DetailsNotFoundException;

public class FlatRegistrationDAOImpl implements IFlatRegistrationDAO {

	
	// map to store owner details
	static Map<Integer, FlatOwner> owners = new HashMap<>();

	// map to store flat details
	Map<Integer, FlatRegistrationDTO> flatDetails = new HashMap<>();

	//details of owners 
	static {
		owners.put(1, new FlatOwner(1, "Vaishali", 9023002122L));
		owners.put(2, new FlatOwner(2, "Megha", 9643221234L));
		owners.put(3, new FlatOwner(3, "Manish", 5453221234L));
	}

	// method to register the flat and store the details into the map 
	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		
		FlatRegistrationDTO flat1 = new FlatRegistrationDTO();
		
		int id = flat.getRegisterationId();
		flatDetails.put(id,flat);
		
		if(flatDetails.containsKey(id))
		{
		  flat1 = flatDetails.get(id);
		}
		
		return flat1;
	}

	// method to return owner ids from the map
	
	@Override
	public ArrayList<Integer> getAllOwnersIds() {

		Set<Integer> ids = owners.keySet();
		ArrayList<Integer> ownerIds = new ArrayList<>(ids);
		return ownerIds;
	}

	// method to return the users registration details
	@Override
	public FlatRegistrationDTO getDetails(int id) throws DetailsNotFoundException {
		FlatRegistrationDTO flat1 = new FlatRegistrationDTO();
		
		if(flatDetails.containsKey(id))
		
		{
			flat1 = flatDetails.get(id);
			return flat1;
		}
		else
		{
			throw new DetailsNotFoundException();
		}
		
	}

}
