// service class to perform operations
package com.cg.frs.service;

import java.util.ArrayList;

import com.cg.frs.dao.FlatRegistrationDAOImpl;
import com.cg.frs.dao.IFlatRegistrationDAO;
import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exceptions.DetailsNotFoundException;
import com.cg.frs.exceptions.OwnerDoesNotExistsException;

public class FlatRegistrationServiceImpl implements IFlatRegistrationService{

	// object creation of DAO interface
	IFlatRegistrationDAO dao = new FlatRegistrationDAOImpl();
	// object of bean class
	FlatRegistrationDTO flat1 = new FlatRegistrationDTO();
	
	// method to register flat details 
	@Override
	public FlatRegistrationDTO registerFlat(FlatRegistrationDTO flat) {
		
		flat1 =  dao.registerFlat(flat);
		return flat1;
	}
// methods to return owner ids
	@Override
	public ArrayList<Integer> getAllOwnerIds() throws OwnerDoesNotExistsException {
		
		ArrayList<Integer> ids = new ArrayList<>();
		
		 ids = dao.getAllOwnersIds();
		 if(ids == null)
		 {
			 throw new  OwnerDoesNotExistsException();
		 }
		 else
		 {
		return  ids;
		 }
	}
// method to print owner ids
	@Override
	public FlatRegistrationDTO getDetails(int id) throws DetailsNotFoundException {
		
		flat1 = dao.getDetails(id);
		if(flat1!=null)
		{
		return flat1;
		}
		else
		{
			throw new DetailsNotFoundException();
		}
	}


	
}
