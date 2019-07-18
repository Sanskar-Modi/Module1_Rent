package com.cg.frs.dto;

//bean class to store details of Flat owners
public class FlatOwner {
	
	//attributes of flat owners
	private int ownerId;


	private String  ownerName;
	private long ownerPhone;
	
	// getters and setters to get and set value of flat owners 
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	// parameterized constructor
	public FlatOwner(int ownerId, String ownerName, long ownerPhone) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.ownerPhone = ownerPhone;
	}
	public long getOwnerPhone() {
		return ownerPhone;
	}
	public void setOwnerPhone(long ownerPhone) {
		this.ownerPhone = ownerPhone;
	}
	
	

	
}
